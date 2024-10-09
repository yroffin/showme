package org.yroffin.showme.app.model;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.stream.Collectors;

import lombok.Data;
import lombok.NonNull;

@Data
public class DataMessage {
    private @NonNull String filename;
    private String md5;

    public DataMessage computeMD5() throws NoSuchAlgorithmException, IOException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        Path path = Paths.get(filename);
        String content = Files.lines(path).collect(Collectors.joining("\n"));
        byte[] inputBytes = content.getBytes(StandardCharsets.UTF_8);
        byte[] digest = md.digest(inputBytes);
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(String.format("%02x", b));
        }
        this.md5 = sb.toString();
        return this;
    }
}

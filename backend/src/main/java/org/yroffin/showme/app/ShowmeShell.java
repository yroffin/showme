package org.yroffin.showme.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class ShowmeShell {
    protected static final Logger LOG = LoggerFactory.getLogger(ShowmeShell.class);

    public record Args(String folder, String wildcard, boolean recursive) {
    };

    public static Args args;

    @ShellMethod(value = "Scan folder.", key = "scan")
    public void scanFolder(
            @ShellOption(value = "folder", defaultValue = "") String folder,
            @ShellOption(value = "wildcard", defaultValue = "") String wildcard,
            @ShellOption(value = "recursive", defaultValue = "false") String recursive) {
        ShowmeShell.args = new Args(folder, wildcard, recursive.compareTo("true") == 0);
        LOG.info("Arguments: {}", ShowmeShell.args);
    }
}

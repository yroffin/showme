package org.yroffin.showme.app.model;

import java.util.LinkedList;
import java.util.Queue;

public class DataQueue {
    private final Queue<DataMessage> queue = new LinkedList<>();
    private final Object IS_NOT_FULL = new Object();
    private final Object IS_NOT_EMPTY = new Object();

    public DataQueue() {
    }

    public void waitIsNotFull() throws InterruptedException {
        synchronized (IS_NOT_FULL) {
            IS_NOT_FULL.wait();
        }
    }

    private void notifyIsNotFull() {
        synchronized (IS_NOT_FULL) {
            IS_NOT_FULL.notify();
        }
    }

    public void waitIsNotEmpty() throws InterruptedException {
        synchronized (IS_NOT_EMPTY) {
            IS_NOT_EMPTY.wait();
        }
    }

    public void notifyIsNotEmpty() {
        synchronized (IS_NOT_EMPTY) {
            IS_NOT_EMPTY.notify();
        }
    }

    public void add(DataMessage message) {
        queue.add(message);
        notifyIsNotEmpty();
    }

    public DataMessage remove() {
        DataMessage mess = queue.poll();
        notifyIsNotFull();
        return mess;
    }
}

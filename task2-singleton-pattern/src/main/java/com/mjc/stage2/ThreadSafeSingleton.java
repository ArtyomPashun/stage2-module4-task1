package com.mjc.stage2;

public class ThreadSafeSingleton {

    private volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
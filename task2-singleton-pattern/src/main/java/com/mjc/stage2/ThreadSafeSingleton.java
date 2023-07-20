package com.mjc.stage2;

public class ThreadSafeSingleton {

    public static final ThreadSafeSingleton INSTANCE = new ThreadSafeSingleton();

    public static ThreadSafeSingleton getInstance() {
        return INSTANCE;
    }

    private ThreadSafeSingleton() {
    }
}

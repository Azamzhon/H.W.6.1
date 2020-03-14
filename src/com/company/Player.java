package com.company;

public class Player <T extends Number> implements Runnable {
    private T runnerId;

    public Player(T runnerId) {
        this.runnerId = runnerId;
    }

    @Override
    public Object startRunning() {
        System.out.println("Runner " + runnerId + " is running");
        return null;
    }
}

package org.example.lesson5;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Program {
    public static void main(String[] args) {
        int numbPhilosophy = 5;
        String[] name = {"Гавриил", "Петр", "Аристотель", "Архимед", "Колька"};
        Lock[] forks = new Lock[5];
        for (int i = 0; i < numbPhilosophy; i++) {
            forks[i] = new ReentrantLock();
        }
        Thread[] philosophers = new Thread[numbPhilosophy];
        for (int i = 0; i < numbPhilosophy; i++) {
            philosophers[i] = new Thread(new Philosopher(name[i], forks[i], forks[(i + 1) % 5]));
            philosophers[i].start();
        }
        try {
            for (Thread philosopher : philosophers) {
                philosopher.join();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
}

package org.example.lesson5;

import java.util.concurrent.locks.Lock;
/*
Пять безмолвных философов сидят вокруг круглого стола, перед каждым философом стоит тарелка спагетти.
Вилки лежат на столе между каждой парой ближайших философов.
Каждый философ может либо есть, либо размышлять.
Философ может есть только тогда, когда держит две вилки — взятую справа и слева.
Философ не может есть два раза подряд, не прервавшись на размышления (можно не учитывать)
Описать в виде кода такую ситуацию. Каждый философ должен поесть три раза
 */
// очень сложно. подсмотрел. Частично переварил,попробую поискать доп информацию,может посоветуете какие то ресурсы?
public class Philosopher implements Runnable {
    private String name;
    private Lock leftFork;
    private Lock rightFork;

    public Philosopher(String name, Lock leftFork, Lock rightFork) {
        this.name = name;
        this.leftFork = leftFork;
        this.rightFork = rightFork;

    }

    private void eat() throws InterruptedException {
        System.out.println("Философ " + name + " ест.");
        Thread.sleep(100);
    }

    private void think() throws InterruptedException {
        System.out.println("Философ " + name + " размышляет.");
        Thread.sleep(100);
    }

    @Override
    public void run() {
        for (int i =0;i<3;i++){
            try {
                think();
                leftFork.lock();
                try {
                    rightFork.lock();
                    try {
                        eat();
                    } finally {
                        rightFork.unlock();
                    }
                } finally {
                    leftFork.unlock();
                }
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
        }
    }
}


package com.java.thread.notify;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerTest {

    public static void main(String[] args) throws InterruptedException {
         
         
        final Queue<Integer> sharedQ = new LinkedList < Integer >();
         
        Thread consumerThread = new Thread(new Consumer(sharedQ), "CONSUMER");
        Thread producerThread = new Thread(new Producer(sharedQ, 4), "PRODUCER");
         
        producerThread.start();
        consumerThread.start();
         
         
    }
}

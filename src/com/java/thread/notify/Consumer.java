package com.java.thread.notify;

import java.util.Queue;

class Consumer implements Runnable
{
    private final Queue<Integer> sharedQ;
   // private int maxSize;
     
    public Consumer(Queue<Integer> sharedQ)
    {
        this.sharedQ = sharedQ;
    }
     
    @Override
    public void run(){
        while(true)
        {
            synchronized (sharedQ) {
                while(sharedQ.isEmpty())
                {
                    try {
                        System.out.println("Que is Empty");
                        sharedQ.wait();
                    }
                    catch(InterruptedException e)
                    {
                        e.printStackTrace(); 
                    }
                }
                 
                int number = (int) sharedQ.poll();
                System.out.println("removing Element " + number);
                sharedQ.notify();
                 
            }
        }
    }
     
}
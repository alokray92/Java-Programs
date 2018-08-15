package com.java.concurrency;

public class ThreadJoinExample {
	public static void main(String[] args) {
		Thread T1=new Thread(new MyRunnable(), "t1");
		Thread T2=new Thread(new MyRunnable(), "t2");
		Thread T3=new Thread(new MyRunnable(), "t3");
		T1.start();
		try{
			T1.join(2000);
		}catch(InterruptedException  e){
			e.printStackTrace();
		}
		T2.start();
		try{
			T1.join();
		}catch(InterruptedException  e){
			e.printStackTrace();
		}
	    T3.start();
	}
}

class MyRunnable implements Runnable{

	@Override
	public void run() {		
		
		System.out.println("Thread started:::"+Thread.currentThread().getName());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread ended:::"+Thread.currentThread().getName());
	}
	
}
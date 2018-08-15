package com.java.concurrency;

public class Threads {
	public static void main(String[] args) throws InterruptedException   {
		
		 Thread separateThread= new Thread(new ThreadPrinter());
		separateThread.start();
		for(int i=0;i<5;i++){
			System.out.println("from the main thead :"+Thread.currentThread().getName());
			Thread.sleep(1000);
		}
	}
}

 class ThreadPrinter implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<5;i++){
			System.out.println("from the new thead :"+Thread.currentThread().getName());
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}

	}

}


package com.vish.Others;
class Thread1 extends Thread
{
    public void run(){
        for(int i=1; i<100; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Thread2 extends Thread
{
    public void run(){
        for(int i=1; i<100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        Thread1 obj1 = new Thread1();
        Thread2 obj2 = new Thread2();
        obj1.start();
        obj2.start();
    }
}

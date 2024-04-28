class RunnableClass1 implements Runnable
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
class RunnableClass2 implements Runnable
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
public class RunnableDemo {
    public static void main(String[] args) {
        Runnable obj1 = new RunnableClass1();
        Runnable obj2 = new RunnableClass2();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}

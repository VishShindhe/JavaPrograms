package com.vish.Others;
class Throws
{
    public void show() throws ClassNotFoundException{
        Class.forName("Calc");
    }
}

public class ThrowsDemo {
    static{
        System.out.println("Class Loaded");
    }
    public static void main(String[] args) {
        Throws obj = new Throws();
            try {
                obj.show();
            } catch (ClassNotFoundException e) {
                System.out.println("Stack trace >>> ");
                e.printStackTrace();
            }
    }
}

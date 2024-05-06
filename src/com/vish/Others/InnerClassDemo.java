package com.vish.Others;
 class OuterClass{
    public void show(){
        System.out.println("In show");
    }
    class InnerClass{
        public void config(){
            System.out.println("In config");
        }
     }
}

public class InnerClassDemo {
    public static void main(String a[]) {
        OuterClass obj = new OuterClass();
        obj.show();

       // InnerClass obj1 = new InnerClass();  //>> This will throw error - cannot resolve symbol: InnerClass
        OuterClass.InnerClass obj1 = obj.new InnerClass();
        obj1.config();
    }

}

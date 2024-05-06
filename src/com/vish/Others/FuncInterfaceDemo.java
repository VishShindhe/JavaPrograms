package com.vish.Others;
@FunctionalInterface
interface MyFunctionalInterface {
    //void show(); //1st test
    //void show(int i);  //2nd test
    int add(int i , int j); //3rd test
}

public class FuncInterfaceDemo {
    public static void main(String a[]){
        /* 1st test
        MyFunctionalInterface myFunctionalInterface = () -> System.out.println("Hello Java");
        myFunctionalInterface.show();  */

        /* 2nd test
        //MyFunctionalInterface myFunctionalInterface = (i) -> System.out.println("Hello Java " +i); //we can use this form as well
        MyFunctionalInterface myFunctionalInterface = i -> System.out.println("Hello Java " +i);
        myFunctionalInterface.show(8);
        */

        // 3rd Test
        MyFunctionalInterface myFunctionalInterface = (n1, n2) -> n1+n2 ;
        int sum = myFunctionalInterface.add(5,10);
        System.out.println("Sum of 5, 10 is " +sum);
    }
}

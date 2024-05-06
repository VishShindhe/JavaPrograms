package com.vish.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {
    public static void main(String[] args) {
        //List<Integer> nums = new ArrayList<>();
        //nums.add(10);

        List<Integer> nums = Arrays.asList(80,19,25,12,57,98);  //Directly add elements to ArrayList

        //This is how foreach method works -- long way
        Consumer<Integer> con = new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                System.out.println(n);
            }
        };
       nums.forEach(con);

       //for each in shorter way
        //Consumer<Integer> con = n -> System.out.println(n); //Condensed code for above

        //Since con can be replaced  RHS part
        nums.forEach(n -> System.out.println(n));


    }
}

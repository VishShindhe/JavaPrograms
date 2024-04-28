package com.vish.Collections;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(50);
        nums.add(30);
        System.out.println(nums);
        System.out.println(nums.get(2));
        System.out.println(nums.indexOf(50));
        for(int n : nums)
            System.out.println(n);

        /* If we dont use Integer as param in declaration
        for(Object n : nums){
            int num =(Integer)n;
            System.out.println(num);
        }*/

    }
}

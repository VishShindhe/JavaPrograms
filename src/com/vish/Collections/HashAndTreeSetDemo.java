package com.vish.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashAndTreeSetDemo {
    public static void main(String[] args) {
        //Set gives an unordered list of only unique numbers. Whereas ArrayList gives ordered list(same order as inserted) & can contain duplicates
        Set<Integer> integerSet = new HashSet<Integer>();
        integerSet.add(20);
        integerSet.add(12);
        integerSet.add(65);
        integerSet.add(77);
        integerSet.add(20);
        Iterator<Integer> iterator  = integerSet.iterator();
        System.out.println("Elements in Hash Set are: ");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Use TreeSet to get sorted list
        Set<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(20);
        treeSet.add(12);
        treeSet.add(65);
        treeSet.add(77);
        treeSet.add(20);
        System.out.println("Elements in Tree Set are: ");
        for (Integer integer : treeSet) {
            System.out.println(integer);
        }
    }
}

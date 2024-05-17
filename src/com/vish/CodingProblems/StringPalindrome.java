package CodingProblems;

import java.io.*;
import java.util.*;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A = sc.next();
        StringBuffer sb = new StringBuffer(A);
        sb.reverse();
        if((sb.toString()).equals(A))
            System.out.println("Yes ");
        else
            System.out.println("No");
    }
}

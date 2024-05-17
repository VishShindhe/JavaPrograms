package CodingProblems;

import java.util.*;

/**
 * Given two strings of lowercase English letters, A and B, perform the following operations:
 * Sum the lengths of A and B.
 * Determine if A is lexicographically larger than B(i.e.: does A come before B in the dictionary?).
 * Capitalize the first letter in A and B print them on a single line, separated by a space.
 */

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int lexo = A.compareTo(B);
        System.out.println(A.length() + B.length());

        if(lexo>=0) System.out.println("Yes");
        else System.out.println("No");

        String capitalisedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalisedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalisedA +" " + capitalisedB);
    }
}

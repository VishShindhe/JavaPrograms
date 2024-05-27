package CodingProblems;
import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s= s.trim();
        String[] words = s.split("[\\s',!?._@]+");
        if(s.isBlank() || s.isEmpty())
            System.out.println(0);
        else
            System.out.println(words.length);
        for(String word: words)
            System.out.println(word);

        scan.close();
    }
}



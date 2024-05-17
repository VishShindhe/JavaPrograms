package CodingProblems;

import java.util.Arrays;
import java.util.Scanner;
public class AnagramString {
     static boolean isAnagram(String a, String b)
     {
         if(a.length() == b.length()){
            char[] aArray = a.toCharArray();
            char[] bArray = b.toCharArray();
            Arrays.sort(aArray);
            Arrays.sort(bArray);
            return(Arrays.equals(aArray,bArray));
         }
         return false;
     }

     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         String a = scan.next();
         String b = scan.next();
         scan.close();
         boolean ret = isAnagram(a, b);
         System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
     }
}

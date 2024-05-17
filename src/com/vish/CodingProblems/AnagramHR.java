package CodingProblems;

import java.util.Scanner;

public class AnagramHR {
    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length())
            return false;
        int indexOfChar;
        a= a.toUpperCase();
        b= b.toUpperCase();
        for (int i = 0; i<a.length(); i++) {
            indexOfChar = b.indexOf(a.charAt(i));
            if (indexOfChar == -1)
                return false;
            // remove first index of str2
            b = b.substring(0, indexOfChar) + b.substring(indexOfChar + 1);

        }
        return true;
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

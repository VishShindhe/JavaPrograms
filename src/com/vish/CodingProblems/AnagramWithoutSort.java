package CodingProblems;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramWithoutSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

    }

    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length())
            return false;
        HashMap mapOne = createMapKeys(a);
        HashMap mapTwo = createMapKeys(b);

        return(mapOne.equals(mapTwo));
    }

    private static HashMap createMapKeys(String str) {
        HashMap map = new HashMap<>();
        int count;
        for(int i = 0; i < str.length(); i++){
            if(map.containsKey(str.charAt(i))) {
                count = (int) map.get(str.charAt(i));
                map.put(str.charAt(i), count + 1);
            }
            else{
                map.put(str.charAt(i),0);
            }
        }
        return map;

    }

}


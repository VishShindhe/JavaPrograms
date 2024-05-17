package CodingProblems;
import java.util.Scanner;

public class SubStringArray {
    // Function to split the String
    static String getSmallestAndLargest(String s, int k)
    {
        String smallest = "";
        String largest = "";
        smallest = s.substring(0,k);
        largest = s.substring(0,k);
        String str ="";
        for(int j =0; j <= s.length()-k; j++) {
            str = s.substring(j, j + k);
            if(smallest.compareTo(str)>0)
                smallest = str;
            if(largest.compareTo(str)<0)
                largest=str;
        }
        return smallest + "\n" + largest;

    }

    // Driver code
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ArraysDemo {
    public static void main(String[] args) {
        int total =0;
        int counter =0;
        int[] myNum = {1, 3, 4, 5};

       for(int i=0; i< myNum.length;i++)
        {
            total += myNum[i];
            counter += ++counter;
        }
        System.out.println(total);
        System.out.println(counter);
        int num = counter - total;
        System.out.println("Missing number is" + num);

    }
}
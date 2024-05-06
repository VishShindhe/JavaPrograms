package com.vish.Others;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputUsingBRDemo{
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number");
        //Used before java 1.5
        /*InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        int num = Integer.parseInt(br.readLine());
        System.out.println(num);
        br.close();*/

        //Better way since java 1.5
        Scanner scanner = new Scanner(System.in);
        int num2 = scanner.nextInt();
        System.out.println(num2);
    }
}

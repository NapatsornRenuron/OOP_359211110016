package ooplab5;

//1. declare array as Integer
//2. allow user to input data into array
//3. show data in array

import java.util.Scanner;

public class InputDataToArray {
    private static int MAX = 5;

    public static void main(String[] args) {

        Integer[] num = new Integer[MAX];
        //int[] num2 = new int[MAX];
        num = inputData(num);

        showData(num);


    }//main

    private static void showData(Integer[] num) {

        System.out.println("Data in array : ");
        for (int i=0; i<num.length; i++) {
            System.out.print(num[i]+" ");
        }
        //enhane loop
        for (int i : num) {
            System.out.print(i+"");
        }

        System.out.println();

    }

    private static Integer[] inputData(Integer[] num) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer : ");
        for (int i=0; i<num.length; i++) {
            System.out.print("num ["+i+"] : ");
            num[i] = scanner.nextInt();

        }

        return num;
    }//inputData

}//class
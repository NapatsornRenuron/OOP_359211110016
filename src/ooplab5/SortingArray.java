package ooplab5;
//1. allow user input data into array
//2. find summation of data in array
//3. find average value in array
//4. find maximum value in array
//5. find minimum value in array
//6. sorting data in array (Decending order)
//7. sorting data in array (Ascending order)

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortingArray {
    private static int MAX = 5;

    public static void main(String[] args) {
        Integer[] num = new Integer[MAX];

        num = inputData(num);
        showData(num);
        findSummation(num);
        findMax(num);
        findmin(num);
        DescendingOrder(num);
        AscendingOrder(num);


    }//main

    private static void AscendingOrder(Integer[] num) {
        System.out.println("Ascending Order : ");
        Arrays.sort(num,Collections.reverseOrder());
        showData(num);
    }

    private static void DescendingOrder(Integer[] num) {
        Arrays.sort(num);
        System.out.println("Descending Order : ");
        showData(num);
    }

    private static void findmin(Integer[] num) {
        System.out.println("The Minimum value is : "+Collections.min(Arrays.asList(num)));
    }//findMin

    private static void findMax(Integer[] num) {
        System.out.println("The Maximum value is : "+Collections.max(Arrays.asList(num)));
    }//findMax

    private static void findSummation(Integer[] num) {
        Integer total = 0;
        for (int val : num)
            total+=val;
        System.out.println("The summation is : "+total);

        findAverage(total);
    }//findSummation

    private static void findAverage(Integer num) {
        System.out.println("The average value is : "+num/MAX);
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


    private static void showData(Integer[] num) {
        System.out.println("Data in array : ");
        for (int i=0; i<num.length; i++) {
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }//Showdata
}




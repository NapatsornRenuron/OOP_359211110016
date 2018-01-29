package ooplab5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class myArray2D {
    public static void main(String[] args) throws IOException {

        int num[][] = new int[2][3];
//        num[0][0] = 1;
//        num[0][1] = 2;
//        num[0][2] = 3;

        num = inputData2D(num);

        showData2D(num);

    }//main

    private static void showData2D(int[][] num) {
        System.out.println("Data in array 2D : ");
        for (int i=0; i<num.length; i++) {
            for (int j=0; j<num[i].length; j++) {
                System.out.print(num[i][j]+"");
            }//j
            System.out.println();
        }//i
        System.out.println();
    }//ShowData2D


    private static int[][] inputData2D(int[][] num) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer : ");
        for (int i=0; i<num.length; i++) {
            for (int j=0; j<num[i].length; j++) {
                System.out.print("num["+i+"]["+j+"]");
                num[i][j] = Integer.parseInt(reader.readLine());
            }
        }
        return num;
    }
}//class


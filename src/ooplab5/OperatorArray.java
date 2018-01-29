package ooplab5;

public class OperatorArray {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5};
        int num2[] = num;
        int num3[] = {1, 2, 3, 4, 5};
        if (num==num3)
            System.out.println("true");
        else
            System.out.println("false");
        if (num==num2)
            System.out.println("true");
        else
            System.out.println("false");
        num[0] = 100;
        System.out.println(num2[0]);
        num2[4] = 500;
        System.out.println(num[4]);

    }//main

}//class


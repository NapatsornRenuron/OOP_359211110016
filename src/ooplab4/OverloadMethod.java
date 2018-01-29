package ooplab4;

public class OverloadMethod {
    //    global variable
    private static int value = 100;

    public static void a() {
        System.out.println("Hello");
        int number = 20;
        System.out.println(number);
        System.out.println(value);
    }

    public static void a(int x) {
        System.out.println("Hello"+x);

    }
    public static void a(int x, int y) {
        System.out.println("Hello"+(x+y));

    }


    public static void main(String[] args) {

//        OverloadMethod
        a();
        a(5);
        a(5,10);

//        local variable
        int number = 10;


    }//main

}//class


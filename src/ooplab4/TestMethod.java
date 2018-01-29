package ooplab4;

public class TestMethod {
    public static void a() {
        System.out.println("Hello A");
    }
    public static void b(int x, int y, String s) {
        System.out.println(s);
    }
    public static int c(int x, int y){
        return x+y;
    }

    public static void main(String[] args) {

        //protected

        //private

        a();
        int x=5,y=10;
        b(x,y,"Hello");
//        Managr return value
        //1
        int z = c(x, y);
        System.out.println(z);
        //2
        System.out.println(c(x,y));

    }//main
}//class


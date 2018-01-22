package MidTerm;

import java.util.Scanner;

public class M3_2 {
    public static void main(String[] args) {
        int id = getID();
        String name = getName();
        float sal = getSalary();
        float ov = getOverTime();
        System.out.println("show information");
        showDataInfo(id,name,sal,ov);
    }

    private static void showDataInfo(int id, String name, float sal, float ov) {
        M3_2 a = new M3_2();
        System.out.println("ID :"+ id);
        System.out.println("Name :"+ name);
        System.out.println("Salary :"+ sal);
        System.out.println("OverTime :"+ ov);
        System.out.println("Tax is :"+ a.calculateTex(sal,ov));
    }

    public static int getID() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter ID : ");
        int ID = in.nextInt();
        return ID;
    }

    public static String getName() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you name : ");
        String name = in.nextLine();
        return name;
    }

    public static float getSalary() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you salary : ");
        float salary = in.nextFloat();
        return salary;
    }


    public static float getOverTime() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you Overtime : ");
        float overTime = in.nextFloat();
        return overTime;
    }
    private static int calculateTex(float a,float b){
        float sum = b+a;
        if (sum>=100000){
            return 10;
        }
        else if (sum>=70000){
            return 7;
        }
        else if (sum>=50000) {
            return 5;
        }
        else if (sum>=30000) {
            return 3;
        }
        else{
            return 1;
        }
    }
}


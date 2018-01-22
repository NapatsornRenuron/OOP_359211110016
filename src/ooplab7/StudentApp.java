package ooplab7;

import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {

        //create object as Student ดึงตัวแปลมาจาก Student แล้วใสค่าลงไป
        Student s1 = new Student();
        s1.setId("111111111111");
        s1.setname("Boy Saiyai");
        s1.setmajor("Information System");
        s1.setgroup("IS221"); //สร้างแบบพิมพ์

        Student s2 = new Student("222222222222",
                "Gril Saiyai",
                "Maketing",
                "MK221"); //สร้างแบบไม่พิมพ์
        showData(s1); //โชว์แบบที่มีในโปรแกรมแล้ว s1
        showData(s2); //โชว์แบบที่มีในโปรแกรมแล้ว s2

        Student s3 = new Student();
        s3 = inputData(s3);
        showData(s3); //โชว์แบบพิมพ์ไปก่อนแล้วโชว์ข้อความ s3

    }

    private static Student inputData(Student s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student info : ");
        System.out.print("Enter Student ID : ");
        s.setId(scanner.nextLine());
        System.out.print("Enter Student Name : ");
        s.setname(scanner.nextLine());
        System.out.print("Enter Student Major : ");
        s.setmajor(scanner.nextLine());
        System.out.print("Enter Student Group : ");
        s.setgroup(scanner.nextLine());

        return s;   //รับค่าจากผู้ใช้ s3
    }

    private static void showData(Student s) {
        System.out.println("Student info : ");
        System.out.println("ID : "+ s.getId());
        System.out.println("Name : "+ s.getname());
        System.out.println("Major : "+ s.getmajor());
        System.out.println("Group : "+ s.getgroup());
    }//โชว์ข้อมูล

}//class
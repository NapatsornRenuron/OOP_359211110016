package ooplab7;

public class StudentApp {
    public static  void  main (String[] args){
        //create object as Student
        Student S1 = new Student();
        S1.setId("111111111111");
        S1.setname("Boy Saiyai");
        S1.setmajor("Information System");
        S1.setgroup("IS221");

        Student S2 = new Student(id: "222222222222",
        n: "Girl Saiyai",
        m: "Maketing",
        g: "MK221");
showData(S1);

    }//main

    private static void showData (Student S) {
        System.out.println("Student info: ");
        System.out.println("ID: " + S.getId());
        System.out.println("Name:" + S.getname());
        System.out.println("Major:" + S.getmajor());
        System.out.println("Group:" + S.getgroup());



    }//showData

}//class


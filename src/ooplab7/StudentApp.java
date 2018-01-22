package ooplab7;

public class StudentApp {
    public static void main(String[] args) {
        //create object as student
        Student s1 = new Student();
        s1.setId("111111111111");
        s1.setname("Boy Saiyai");
        s1.setmajor("Information System");
        s1.setgroup("IS221");

        Student s2 = new Student("222222222222","Gril Saiyai","Maketing","MK221");
        showData(s1);


    }//main

    private static void showData(Student s1) {
        System.out.println("student info: ");
        System.out.println("Id: "+s1.getId());
        System.out.println("Name: "+s1.getname());
        System.out.println("Major: "+s1.getmajor());
        System.out.println("Group: "+s1.getgroup());





    }
}//class
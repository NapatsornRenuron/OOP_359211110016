package ooplab9;

public class PersonApp {
    public static void main(String[] args) {
        person person = new person("Thadarat","25435954213",
                new Address("303/63 M.3","SuratThani","84140"),
                new Job("Staff","20000"));


        System.out.println(person.toString());

        person.getJob().setsalary("30000");

        System.out.println(person.getJob());

    }//main

}//class

package ooplab8;
// Dos is sub-class
//Pet is super-class
public class Dog extends Pet {


    public Dog(String name, String hairColor, String gender, int age) {
        super(name, hairColor, gender, age); //super การเรียกใช้งานจาก superclass Pet
    }
    //กด ออติเนส อินเสิด เลือกOverride
    @Override
    public void makeNoise() {
        System.out.println("Box Box !!!");
    }
}//class
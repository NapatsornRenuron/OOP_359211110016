package ooplab8;

import javax.naming.Name;

//Application for Pet,Dog,and Cat Class
public class PetApp {
    public static void main (String[] args){
            Dog dog = new Dog("Bow",
                    "white",
                    "Female",
                    2);
            System.out.println(dog.toString());
            Cat cat = new Cat("dig",
                    "white",
                    "Female",
                    1);
            System.out.println(cat.getClass()+" "+cat.toString());
            dog.makeNoise();
            cat.makeNoise();
        }//main


    }//class


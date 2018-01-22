package ooplab7;

//design class
//taking about Student
//1. student id
//2. name
//3. major
//4. group
public class Student {
    private String id;
    private String name;
    private String major;
    private String group;

    //constructor
    //default
    public Student(){}
    public Student(String id,String n,String m,String g){
        this.id = id;
        this.name = n;
        this.major = m;
        this.group = g;
    }// condtructor

    //getter and srtter methods
    //id
    public void setId(String id){
        this.id = id;
    }//setID
    public String getId(){
        return  this.id;
    }//getID

    public void setname(String n){
        this.name = n;
    }//setname
    public String getname(){
        return  this.name;
    }//getname

    public void setmajor(String m){
        this.major = m;
    }//setmajor
    public String getmajor(){
        return  this.major;
    }//getmajor

    public void setgroup(String g){
        this.group = g;
    }//setgroup
    public String getgroup(){
        return  this.group;
    }//getgroup






}//class



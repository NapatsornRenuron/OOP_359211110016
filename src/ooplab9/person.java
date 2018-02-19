package ooplab9;

public class person {
    private  String name;
    private  String personid;
    private  Address Address;
    private Job Job;

    public person(String name, String personid,
                  Address Address, Job Job) {
        this.name = name;
        this.personid = personid;
        this.Address = Address;
        this.Job = Job;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personid='" + personid + '\'' +
                ", Address='" + Address + '\'' +
                ", Job=" + Job +
                '}';
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getpersonid() {
        return personid;
    }

    public void setpersonid(String personid) {
        this.personid = personid;
    }

    public Address getAddress() {
        return Address;
    }

    public void setAddress(Address Address) {
        this.Address = Address;
    }

    public Job getJob() {
        return Job;
    }

    public void setJob(Job Job) {
        this.Job = Job;
    }
}
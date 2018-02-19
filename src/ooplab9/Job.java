package ooplab9;

public class Job {
    private String position;
    private  String salary;

    public Job(String position, String salary) {
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Job{" +
                "position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public String getposition() {
        return  position;
    }

    public void setposition(String position) {
        this. position = position;
    }

    public String getsalary() {
        return salary;
    }

    public void setsalary(String salary) {
        this.salary = salary;
    }


}

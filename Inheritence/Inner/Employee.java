package Inheritence.Inner;

public class Employee extends Person{
    private String title;
    private String department;
    private double salary;



    public Employee(String firstName, String lastName, int age, double height, String ethnicity, String title, String department, double salary){
        super(firstName,lastName,age,height,ethnicity);
        this.title = title;
        this.department = department;
        this.salary =salary;
    }
    public String getTitle() {
        return title;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void printAbout(){
        System.out.println("Employee Data: \n");
        super.printAbout();
        System.out.println("Employee title: "+ this.title+"\n"+
                        "Employee department: "+ this.department+"\n"+
                        "Employee salary: "+ this.salary+"\n");

    }

}

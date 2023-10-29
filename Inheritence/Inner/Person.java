package Inheritence.Inner;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double height;
    private String ethnicity;
    public Person(){
        this("John","Doe",18,154,"Unknown");
    }
    public Person(String firstName, String lastName){
      this(firstName, lastName,18,154,"unknown");
    }
    public Person(String firstName, String lastName,int age){
        this(firstName, lastName,age,154,"unknown");
    }
    public Person(String firstName, String lastName,int age,double height){
        this(firstName, lastName,age,height,"unknown");
    }
    public Person(String firstName, String lastName, int age, double height, String ethnicity){
        this.firstName =firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.ethnicity =ethnicity;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void printAbout(){
        System.out.println(
                "First name is: "+ this.getFirstName()+"\n"+
                        "Last name is: "+this.getLastName()+"\n"+
                        "Age is: "+this.getAge()+"\n"+
                        "Height is: "+this.getHeight() +"\n"+
                        "Ethnicity is: "+this.getEthnicity());
    }

}

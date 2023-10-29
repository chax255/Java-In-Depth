package Constructors;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    //these first two constructors are calling the 3rd constructor
    //this is how to achieve constructor overloading
    //therefore methods of all kind can be overloaded including constructors.
    public VipCustomer(){
        this("defaultName",100,"test@example.com");
    }
    public VipCustomer(String name,double creditLimit){
        this(name,creditLimit,"test@example.com");
    }
    public VipCustomer(String name,double creditLimit,String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}

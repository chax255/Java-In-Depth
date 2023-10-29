package Constructors;

public class Car {
    private String maker;
    private String model;
    private int doors;
    private int wheels;

    public Car(int wheels){
        //if you call another constructor inside a constructor you either give it default value of parameters your current constructor is carrying from outside
        this("Nissan","Patrol",4,wheels);
        System.out.println("Single parameterized constructor called \n");
        System.out.println("\n");
    }
    public Car(int doors, int wheels){
        this("Nissan","Patrol",doors,wheels);
        System.out.println("2 Parameterized constructor is used \n");
        System.out.println("\n");
    }
    public Car(){
        this("Nissan","Patrol",5, 4);
        System.out.println("None parameterized constructor is used \n");
        System.out.println("\n");
    }
    public Car(String model,int doors, int wheels){
        this("Nissan",model,doors,wheels);
        System.out.println("3 Parameterized constructor is used \n");
        System.out.println("\n");
    }
    public Car(String maker, String model,int doors, int wheels){
        this.maker = maker;
        this.model = model;
        this.doors = doors;
        this.wheels = wheels;
//        System.out.println("Full parameterized constructor is used \n");
    }
    public String getMaker() {
        return this.maker;
    }

    public String getModel() {
        return this.model;
    }

    public int getDoors() {
        return this.doors;
    }

    public int getWheels() {
        return this.wheels;
    }
 public static void printData(String meka, String modo,int doorz, int wheelz){

     System.out.println("This car is made by "+ meka + ", it's model is "+modo+", it has "+doorz+" doors and "+ wheelz+ " wheels");
     System.out.println("\n");
 }
    public static void printData(String modo,int doorz, int wheelz){
        System.out.println("This car is made by Unknown, it's model is "+modo+", it has "+doorz+" doors and "+ wheelz + " wheels");
        System.out.println("\n");
    }
    public static void printData(int doorz, int wheelz){
        System.out.println("This car is made by unknown, it's model is unknown, it has "+doorz+" doors and "+ wheelz+" wheels");
        System.out.println("\n");
    }
    public static void printData(int wheelz){
        System.out.println("This car is made by unknown, it's model is unknown, it has unknown number of doors and "+ wheelz + " wheels");
        System.out.println("\n");
    }
}

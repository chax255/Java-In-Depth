package Inheritence.Vehicle;

public class Vehicle {
    //fields
    private int numberOfWheels;
    private String name;
    private String locationOfUse;
    private String steeringType;
    private String gearType;
    private double speed;
    public Vehicle(int numberOfWheels,String name, String locationOfUse, String steeringType,String gearType,double speed){
        this.numberOfWheels =numberOfWheels;
        this.name = name;
        this.locationOfUse =locationOfUse;
        this.steeringType = steeringType;
        this.gearType = gearType;
        this.speed = speed;

    }
    //getters
    public int getNumberOfWheels(){
        return this.numberOfWheels;
    }
    public String getName(){
        return this.name;
    }
    public String getLocationOfUse(){
        return this.locationOfUse;
    }
    public String getSteeringType(){
        return this.steeringType;
    }
    public String getGearType(){
        return this.gearType;
    }

    public double getSpeed() {
        return speed;
    }
    public void getVehicleDetails(){
        System.out.println(
                "Vehicle name: "+this.getName()+"\n"+
                        "This vehicle is used on: "+this.getLocationOfUse()+"\n"+
                        "Number of wheels: "+this.getNumberOfWheels()+"\n"+
                        "Steering type: "+this.getSteeringType()+"\n"+
                        "Gear type is: "+this.getGearType()+"\n"+
                        "I can move up to: "+this.getSpeed()+"Km/h"

        );
    }
}

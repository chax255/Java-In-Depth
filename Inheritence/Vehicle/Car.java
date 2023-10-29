package Inheritence.Vehicle;

public class Car extends Vehicle{
    private String engineType;
    private String assemblyPlant;
    private String maker;
    public Car(int numberOfWheels,String name, String locationOfUse, String steeringType,String gearType,double speed,String engineType,String assemblyPlant,String maker){
        super(numberOfWheels,name,locationOfUse,steeringType,gearType,speed);
        this.engineType = engineType;
        this.assemblyPlant = assemblyPlant;
        this.maker =maker;
    }
    public String getEngineType(){
        return this.engineType;
    }
    public String getAssemblyPlant(){
        return this.assemblyPlant;
    }
    public String getMaker(){
        return this.maker;
    }

    @Override
    public void getVehicleDetails(){
        super.getVehicleDetails();
        System.out.println(
                "Vehicle engine type is: "+this.getEngineType()+"\n"+
                        "Car is assembled at: "+this.getAssemblyPlant()+" Plant\n"+
                        "This car is made by: "+this.getMaker()+"\n"

        );
}}

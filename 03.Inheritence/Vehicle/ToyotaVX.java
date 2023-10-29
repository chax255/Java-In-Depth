package Inheritence.Vehicle;

public class ToyotaVX extends Car{
    private int manufactureYear;
    ToyotaVX(double speed,String engineType,String assemblyPlant,int manufactureYear){
        super(4,"ToyotaVX","land","oval","manual stick",speed,engineType,assemblyPlant,"Toyota");
this.manufactureYear = manufactureYear;
    }
    public int getManufactureYear(){
        return this.manufactureYear;
    }
    @Override
    public void getVehicleDetails(){
        System.out.println("Here is your car's details: \n");
        super.getVehicleDetails();
        System.out.println(
                "Car manufacture year: "+this.getManufactureYear()
        );
    }
}

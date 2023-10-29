package Constructors;

public class Main {
    public static void main(String[] ujuzi){
//        Constructors.Car car0 = new Constructors.Car();
//        Constructors.Car car1 = new Constructors.Car(4);
//        Constructors.Car car2 = new Constructors.Car(4,4);
//        Constructors.Car car3 = new Constructors.Car("Xtrail",4,4);
//        Constructors.Car car4 = new Constructors.Car("Mitsubishi","Isuzu",2,6);
//       Constructors.Car.printData(car0.getDoors());
//        Constructors.Car.printData(car0.getMaker(),car0.getModel(),car0.getDoors(), car0.getWheels());
//        Constructors.Car.printData(car1.getMaker(),car1.getModel(),car1.getDoors(), car1.getWheels());
//        Constructors.Car.printData(car2.getMaker(),car2.getModel(),car2.getDoors(), car2.getWheels());
//        Constructors.Car.printData(car3.getMaker(),car3.getModel(),car3.getDoors(), car3.getWheels());
//        Constructors.Car.printData(car4.getMaker(),car4.getModel(),car4.getDoors(), car4.getWheels());
//        //if having a static method from a different class than the class your calling it from, you need to mention the class before you can use such a method
//        System.out.println("\n");
//        Constructors.Car.printData(car0.getModel(),car0.getDoors(), car0.getWheels());
//        Constructors.Car.printData(car1.getModel(),car1.getDoors(), car1.getWheels());
//        Constructors.Car.printData(car2.getModel(),car2.getDoors(), car2.getWheels());
//        Constructors.Car.printData(car3.getModel(),car3.getDoors(), car3.getWheels());
//        Constructors.Car.printData(car4.getModel(),car4.getDoors(), car4.getWheels());
//        System.out.println("\n");
//        Constructors.Car.printData(car0.getDoors(), car0.getWheels());
//        Constructors.Car.printData(car1.getDoors(), car1.getWheels());
//        Constructors.Car.printData(car2.getDoors(), car2.getWheels());
//        Constructors.Car.printData(car3.getDoors(), car3.getWheels());
//        Constructors.Car.printData(car4.getDoors(), car4.getWheels());
//        System.out.println("\n");
//        Constructors.Car.printData(car0.getWheels());
//        Constructors.Car.printData(car1.getWheels());
//        Constructors.Car.printData(car2.getWheels());
//        Constructors.Car.printData(car3.getWheels());
//        Constructors.Car.printData(car4.getWheels());

//        Constructors.VipCustomer OBlong
    VipCustomer customer1 =  new VipCustomer("Ronald",200,"ronald.chaula@gmail.com");
    VipCustomer customer2 = new VipCustomer("Lwimiko",500);
    VipCustomer defaultCustomer = new VipCustomer();

        System.out.println("Customer name is: "+customer1.getName()+"\n"+"Credit Limit is: "+customer1.getCreditLimit()+"\n"+"Email address is: "+customer1.getEmail()+"\n");
        System.out.println("Customer name is: "+customer2.getName()+"\n"+"Credit Limit is: "+customer2.getCreditLimit()+"\n"+"Email address is: "+customer2.getEmail()+"\n");
        System.out.println("Customer name is: "+defaultCustomer.getName()+"\n"+"Credit Limit is: "+defaultCustomer.getCreditLimit()+"\n"+"Email address is: "+defaultCustomer.getEmail()+"\n");
    }
}

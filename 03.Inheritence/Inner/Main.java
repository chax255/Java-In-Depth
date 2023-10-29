package Inheritence.Inner;

public class Main {

   public static void main(String[] args){
      Employee employee;
      employee = new Employee("Ronald","Chaula",29,164,"black","Kibaraka","Michongo",1_000_000);
      employee.printAbout();
      Boss mchongotz;
      mchongotz = new Boss("Adam","Mwang'ombe",12,174,"black","Makumbusho",1_000_000);
      mchongotz.printAbout();
      Customer kibarati = new Customer("Juma","Kibarati",30,170,"black",false,false,true);
      kibarati.printAbout();
   }
}

//all java classes are inheriting from the object class Object, every class inherit from this class all objects including arrays
//toString is also a method of the Object class\
//by default every class you implement extends this class

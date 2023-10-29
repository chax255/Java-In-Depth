package Inheritence.Inner;

public class Customer extends Person{
    private boolean creditCard;
    private boolean coupon;
    private boolean cash;
    public Customer(String firstName,String lastName, int age, double height, String ethnicity, boolean creditCard,boolean coupon, boolean cash){
        super(firstName, lastName,age,height,ethnicity);
        this.cash =cash;
        this.coupon = coupon;
        this.creditCard = creditCard;
    }

    public boolean getCreditCard(){
        return this.creditCard;
    }
    public boolean getCoupon(){
        return this.coupon;
    }
    public boolean getCash(){
        return this.cash;
    }
@Override
    public void printAbout(){
        System.out.println("Customer Data");
        super.printAbout();
        System.out.println(
                "User has a credit card: "+this.getCreditCard()+"\n"+
                        "User has a coupon: "+this.getCoupon()+"\n"+
                        "User has cash: "+this.getCash()
        );
    }
}

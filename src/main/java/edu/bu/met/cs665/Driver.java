package edu.bu.met.cs665;
// Represents each Observer(drivers) that is monitoring changes in the subject
public class Driver implements observerDriver {
    private String name;
    private Shop shop = new Shop();

    public Driver(String name) { // the constructor to generate a name of an observer
        super();
        this.name = name;
    }


    @Override

    public void update(){ // Called to update all observers

        System.out.println("Hi " + name + " new delivery request for you. \nName: " + shop.deliveryName +  "\nAddress: " + shop.deliveryAddress + "\nPhone Number: " + shop.deliveryPhoneNumber);
    };

    @Override
    public void shopDriverRequest(Shop driverRequest){ // receive the info from the shop
        shop = driverRequest;
    }
}

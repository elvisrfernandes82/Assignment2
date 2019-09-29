package edu.bu.met.cs665;

// Represents each Observer(delivery request) that is monitoring changes in the subject
public class DeliveryRequest implements observerDeliveryRequest {
    private String name;
    private Shop shop = new Shop();

    public DeliveryRequest(String name) { // the constructor to generate a name of an observer
        super();
        this.name = name;
    }

    @Override
    public void updateRequested() { // Called to update all observers
        System.out.println("Hi " + name + " your package is out for delivery by:\n" + shop.driverName +  "\nCompany name: "+ shop.driverCompanyName);
    }

    @Override
    public void shopDeliverRequest(Shop deliverRequest) { // receive the info from the shop
        shop = deliverRequest;
    }
}
package edu.bu.met.cs665;

import java.util.ArrayList;// import an ArrayList Libary
import java.util.List;

public class Shop implements subjectShop { // Uses the Subject interface to update all Observers


    // Creates an ArrayList to hold all observers
    private List<Driver> drivers = new ArrayList<>();
    private List<DeliveryRequest> deliveries = new ArrayList<>();

    public String deliveryName;
    public String deliveryAddress;
    public String deliveryPhoneNumber;
    public String driverName;
    public String driverCompanyName;

    @Override
    public void newDeliverRequest(DeliveryRequest delivery){ // Adds a new observer(delivery request) to the ArrayList

        deliveries.add(delivery);
    };
    @Override
    public void cancelDeliverRequest(observerDeliveryRequest delivery){ // cancel a observer to the ArrayList

        deliveries.remove(delivery); // Get the index of the observer to delete

    };

    @Override
    public void newDriver(Driver drive){ // Adds a new observer to the ArrayList
        drivers.add(drive);
    };
    @Override
    public void changeDriver(observerDriver drive){ // cancel a observer to the ArrayList
        drivers.remove(drive);// Get the index of the observer to delete
    };

    @Override
    // Cycle through all observers(who requested a delivery) and notifies them of the delivery status

    public void notifyDeliveryRequest(){

        for(DeliveryRequest delivery: deliveries) {

            delivery.updateRequested();
        }
    }

    @Override
    // Cycle through all observers(driver that will do  the delivery) and notifies them of the delivery status
    public void notifyDriver(){

        for(Driver driver: drivers) {

            driver.update();
        }
    }

    @Override
    // send the delivery information to the  observers(driver that will do  the delivery) and giving that the information of where to delivery
    // the package.
    public void deliverStatus(String deliveryName, String deliveryAddress, String deliveryPhoneNumber){

        this.deliveryName = deliveryName;
        this.deliveryPhoneNumber = deliveryPhoneNumber;
        this.deliveryAddress = deliveryAddress;

        notifyDriver(); // send notification to the observer
    };
    @Override
    //send the delivery information to the  observers(who requested a delivery)
    public void deliverStatusClient(String driverName, String driverCompanyName){

        this.driverName = driverName;
        this.driverCompanyName = driverCompanyName;

        notifyDeliveryRequest(); // send notification to the observer

    };

            ;
}

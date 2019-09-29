package edu.bu.met.cs665;
// This interface handles adding, deleting and updating all observers

public interface subjectShop {
    void newDeliverRequest(DeliveryRequest delivery);

    void cancelDeliverRequest(observerDeliveryRequest delivery);

    void newDriver(Driver drive);

    void changeDriver(observerDriver drive);

    void notifyDeliveryRequest();

    void notifyDriver();

    void deliverStatus(String deliveryName, String deliveryAddress, String deliveryPhoneNumber);

    void deliverStatusClient(String driverName, String driverCompanyName);
}

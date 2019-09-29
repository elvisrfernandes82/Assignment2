package edu.bu.met.cs665;

public class OnlineShop {
    public static void main(String[] args) {
        /* Create the Subject object
         It will handle updating all observers
         as well as deleting and adding them */

        // Create an Observer that will be sent updates from Subject
        Shop onlineShop = new Shop();
        DeliveryRequest firstClient = new DeliveryRequest("Elvis Roberto");
        DeliveryRequest secondClient = new DeliveryRequest("Emannuel spencer");
        Driver taxiDriver = new Driver("Taxi Driver");
        Driver vanDriver = new Driver("Van Driver");



        onlineShop.newDeliverRequest(firstClient); // add one of the observers
        onlineShop.cancelDeliverRequest(secondClient); // Delete one of the observers

        onlineShop.newDriver(taxiDriver);
        onlineShop.changeDriver(vanDriver);// Delete one of the observers


        firstClient.shopDeliverRequest(onlineShop);
        taxiDriver.shopDriverRequest(onlineShop);

        onlineShop.deliverStatus("Elvis Roberto", "20 Jones Ave", "6177683241");
        onlineShop.deliverStatusClient("Pedro", "Taxi Driver");
    }
}

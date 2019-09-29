package edu.bu.met.cs665;
// The Observers update method is called when the Subject changes

public interface observerDeliveryRequest {
    void updateRequested();

    void shopDeliverRequest(Shop deliverRequest);
}

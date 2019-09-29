# Elvis Fernandes Assignment 2 
- MET CS 665 - Software Design and Patterns Delivery Application - Notification System

In this assignment, I have to implement a notification system to send notifications about delivery requests to drivers. When a store gets a product delivery orders should be created at store and a delivery request should be broadcasted to all drivers.

Implementation Details

 My implementation should include the following functionalities:
     • The implementation should include classes for Shop, Delivery Request and Driver.
     • For testing, purpose creates a Shop object, a delivery request and at least 5 driver objects.
     • For testing purposes send out a single delivery request and notify all drivers regarding the delivery request.

For this assignment, I had to choose one of design pattern and apply it in my project. I choose the Observer Pattern, because
The shop will need to send the delivery request to all the drivers when a new order is a request. Know that this means that I have to push the information from the subject(shop) to the observer(drivers), that was the reason why I choose observer pattern.

I decided to create 3 classes(DevileryRequest, Driver, and Shop) that will implement the respective Interfaces(observerDevileryRequest, observerDriver, and subjectShop) in the same order. To run the program a created an onlinShope class that will add or remove a driver, and also add or remove a delivery request.

The DeliveryRequest and Driver classes, basically receive the update/ notification from the Shop class when the delivery request is created.

It's in Shop class where I created all the methods to created or removed a new driver, or delivery request, plus the methods that will send the notification to the drivers when a new delivery request is created.

The program can be easily understandable by the intended audience with the inline comments that I used to explain what was my intention when a created new method or an ArrayList for example. I believe by using the observer pattern it helped me avoid to have some code duplication. 
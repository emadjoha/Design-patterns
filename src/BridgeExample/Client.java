package BridgeExample;

import BridgeExample.Abstraction.Bike;
import BridgeExample.Abstraction.Car;
import BridgeExample.Abstraction.Vehicle;
import BridgeExample.Implemention.Assemble;
import BridgeExample.Implemention.Produce;

public class Client {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car(new Produce(), new Assemble());
        vehicle1.manufacture();
        Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
        vehicle2.manufacture();

    }
}

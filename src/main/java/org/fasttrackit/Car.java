package org.fasttrackit;

public class Car extends AutoVehicle{

    int doorCount;


    public Car(Engine engine) {
        super(engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "doorCount=" + doorCount +
                ", running=" + running +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}

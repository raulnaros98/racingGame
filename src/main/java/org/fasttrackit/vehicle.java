package org.fasttrackit;

public class vehicle {
    public static int vehicleCount;
    String name;
    String color;
    double mileage;

    public vehicle() {
        vehicleCount++;
    }

    protected double accelarate(double speed, double durationInHours) {
        System.out.println(name + "has accelarated with" + speed + "km/h for" + durationInHours + "hours");
        double travelDistance = speed * durationInHours;
        System.out.println("Travelled distance " + travelDistance +"km/h");

        return travelDistance;
    }

}

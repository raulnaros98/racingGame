package org.fasttrackit;

public class vehicle {
    public static int vehicleCount;
    String name;
    String color;
    double mileage;

    public vehicle() {
        vehicleCount++;
    }

    public double accelerate(double speed, double durationInHours)
    {
        System.out.println(name + "has accelarated with" + speed + "km/h for" + durationInHours + "hours");
        double travelDistance = speed * durationInHours;
        System.out.println("Travelled distance " + travelDistance +"km/h");

        return travelDistance;
    }
    //example of method overloading
    public double accelerate (double speed) {
        return accelerate(speed, 1);
    }

    @Override
    public String toString() {
        return "vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}

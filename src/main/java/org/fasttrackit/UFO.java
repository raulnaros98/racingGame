package org.fasttrackit;
import org.fasttrackit.vehicle;
public class UFO extends vehicle {

        @Override
        public double accelerate (double speed, double durationInHours)
        {
            System.out.println("travelled as UFO");
            System.out.println(name + "has accelarated with" + speed + "km/h for" + durationInHours + "hours");
            double travelDistance = 2 * speed * durationInHours;
            System.out.println("Travelled distance " + travelDistance +"km/h");

            return travelDistance;
        }

}


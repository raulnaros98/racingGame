package org.fasttrackit;


public class App 
{
    public static void main( String[] args )
    {

        Engine engine = new Engine();
        engine.manufacturer ="Renault" ;
        engine.capacity = 1500;

        Car car =new Car(engine);
       car.name = "Dacia";
       car.color = "white";
       car.doorCount = 4;
       car.mileage = 7.5;
       car.running = true;



       engine = null;

       Car car2 = new Car(new Engine());
       car2.name = "BMW";

    }

}

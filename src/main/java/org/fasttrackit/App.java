package org.fasttrackit;

/**
 * Hello world!
 *
 */
//this is a comment
public class App 
{
    public static void main( String[] args )
    {

        Car car =new Car();
       car.name = "Dacia";
       car.color = "white";
       car.doorCount = 4;
       car.mileage = 7.5;
       car.running = true;


       Engine engine = new Engine();
       engine.manufacturer ="Renault" ;
       engine.capacity = 15900;

       car.engine = engine;
       engine = null;

       Car car2 = new Car();
       car2.name = "BMW";

    }

}

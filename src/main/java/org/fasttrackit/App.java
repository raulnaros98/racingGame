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
        System.out.println(car.toString());
//
//        double distance =car.accelarate(100,0.5);
        //example of static varables for the whole application
        vehicle vehicle1 = new vehicle();
       // vehicle1.vehicleCount++;

        vehicle vehicle2= new vehicle();
        //vehicle2.vehicleCount++;


        System.out.println( "Value from vehicle1 : "+ vehicle1.vehicleCount );
        System.out.println( "Value from vehicle2 : "+ vehicle2.vehicleCount);
        System.out.println( "Value from vehicle class : "+ vehicle.vehicleCount);

        new AutoVehicle();
        vehicle1.accelerate (34.12);
        vehicle2.accelerate(130, 0.8);
        new UFO().accelerate(130, 0.8);
        //polymorphism an object can take multiple forms
        vehicle ufo =new UFO();
        // the type of the variable does not determine the object's behaviour
        ufo.accelerate(200,2);
        //the type of the varable determines what methods can be invoked
        //we might need type casting, se below
        ((UFO) ufo).concealCheating(); //type casting



    }

}

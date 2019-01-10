package org.fasttrackit;


public class App 
{
    public static void main( String[] args )
    {

//        Engine engine = new Engine();
//        engine.manufacturer ="Renault" ;
//        engine.capacity = 1500;
//
//        Car car =new Car(engine);
//        car.name = "Dacia";
//        car.color = "white";
//        car.doorCount = 4;
//        car.mileage = 7.5;
//        car.running = true;
//
//        double distance =car.accelarate(100,0.5);
        //example of static varables for the whole application
        vehicle vehicle1 = new vehicle();
       // vehicle1.vehicleCount++;

        vehicle vehicle2= new vehicle();
        //vehicle2.vehicleCount++;


        System.out.println( "Value from vehicle1 : "+ vehicle1.vehicleCount);
        System.out.println( "Value from vehicle2 : "+ vehicle2.vehicleCount);
        System.out.println( "Value from vehicle class : "+ vehicle.vehicleCount);





    }

}

package org.fasttrackit;

public class AutoVehicle extends vehicle {

    boolean running;
    Engine engine;

    public AutoVehicle(Engine engine) {
        this.engine = engine;
    }

    public AutoVehicle()
    {
        //this.engine = new Engine();
        this(new Engine());
    }
}

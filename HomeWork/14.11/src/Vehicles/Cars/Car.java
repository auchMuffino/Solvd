package Vehicles.Cars;

import Components.*;
import Vehicles.Vehicle;

import java.util.Arrays;

public abstract class Car implements Vehicle {
    protected Integer topSpeed;
    protected Double weight;
    protected String title;
    protected Engine engine;
    protected Wheel[] wheels;
    protected Transmission transmission;
    protected CarBody carBody;
    protected Double tankCapacity;
    protected Double fuelConsumption;
    protected Double fuelLevel;

    protected static int numberOfCars=0;

    public Car(){
        numberOfCars++;
    }

    public Car(Integer topSpeed, Double weight, String title, Engine engine,
               Wheel[] wheels, Transmission transmission, CarBody carBody,
               Double tankCapacity, Double fuelConsumption, Double fuelLevel) {
        this.topSpeed = topSpeed;
        this.weight = weight;
        this.title = title;
        this.engine = engine;
        this.transmission = transmission;
        this.carBody = carBody;
        this.tankCapacity = tankCapacity;
        this.fuelConsumption = fuelConsumption;
        this.fuelLevel = fuelLevel;
        this.wheels = new Wheel[wheels.length];
        System.arraycopy(wheels, 0, this.wheels, 0, wheels.length);
        numberOfCars++;
    }

    public final void setTopSpeed(Integer topSpeed){
        if(topSpeed > 0)
            this.topSpeed = topSpeed;
    }

    public final void setTitle(String title){
        if(!title.isEmpty())
            this.title = title;
    }

    public final void setWeight(Double weight){
        if(weight > 0.d)
            this.weight = weight;
    }

    public final void setEngine(Engine engine){
        this.engine = engine;
    }

    public final void setWheels(Wheel[] wheels){
        System.arraycopy(wheels, 0, this.wheels, 0, wheels.length);
    }

    public final void setCarBody(CarBody carBody) {
        this.carBody = carBody;
    }

    public final void setTankCapacity(Double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public final void setFuelConsumption(Double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public final void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public final void setFuelLevel(double fuelLevel){
        this.fuelLevel = fuelLevel;
    }

    public final Integer getTopSpeed(){
        return this.topSpeed;
    }

    public final String getTitle(){
        return this.title;
    }

    public final Double getWeight(){
        return this.weight;
    }

    public final Transmission getTransmission() {
        return transmission;
    }

    public final CarBody getCarBody() {
        return carBody;
    }

    public final Double getFuelConsumption() {
        return fuelConsumption;
    }

    public final Double getTankCapacity() {
        return tankCapacity;
    }

    public final Engine getEngine() {
        return engine;
    }

    public final Wheel[] getWheels() {
        return wheels;
    }

    public final Double getFuelLevel() {
        return fuelLevel;
    }

    public abstract void go(int kms);

    @Override
    public String toString(){
        return "Car{\n" +
                "\tTitle: " + this.title + ",\n" +
                "\tTop Speed: " + this.topSpeed + ",\n" +
                "\tWeight: " + this.weight + ",\n" +
                "\tBody: " + this.carBody.name() + ",\n" +
                "\tTank Capacity: " + this.tankCapacity + ",\n" +
                "\tFuel Consumption" + this.fuelConsumption + ",\n" +
                "\tEngine: " + this.engine + ",\n" +
                "\tWheels{\n" + "\t" + Arrays.toString(this.wheels) + "\n}\n" +
                "\tTransmission: " +this.transmission+",\n" +
                "\tCurrent Fuel Level: "+ this.fuelLevel + "\n" +
                "}";
    }

}

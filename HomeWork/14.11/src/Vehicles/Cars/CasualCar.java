package Vehicles.Cars;

import Components.*;

public class CasualCar extends Car {

    private int numberOfSeats = 0;

    public CasualCar(){
        super();
    }
    public CasualCar(int numberOfSeats, Integer topSpeed, Double weight, String title, Engine engine,
                     Wheel[] wheels, Transmission transmission, CarBody carBody,
                     Double tankCapacity, Double fuelConsumption, Double fuelLevel){
        super(topSpeed, weight, title, engine, wheels, transmission, carBody, tankCapacity, fuelConsumption, fuelLevel);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void go(int kms) {
        if((fuelLevel - (kms * 0.01)*this.fuelConsumption) < 0){
            System.out.println("Not enough fuel, you should go to gestation first for this trip");
        } else{
            this.fuelLevel -= (kms * 0.01)*this.fuelConsumption;
            System.out.println("Great trip! Current fuel level: " + this.fuelLevel + "L");
        }
    }

    @Override
    public String toString() {
        return "CasualCar{\n"+"\tNumber of seats:"+ this.numberOfSeats + "\n" + super.toString() + "\n}";
    }
}

package Buildings;

import Components.FuelTypes;
import Excemptions.*;
import Vehicles.Cars.Car;

public final class GasStation {
    public static void refilling(Car car, double value) throws InterruptedException, CapacityExemption {
        if((car.getFuelLevel() + value) > car.getTankCapacity()){
            throw new CapacityExemption();
        } else{
            System.out.println("Perform filling ------------->");
            for(int i = 0; i<10; i++){
                System.out.println("<--***-->");
                Thread.sleep(100);
            }
            car.setFuelLevel(car.getFuelLevel() + value);
            System.out.println("Car filled");
        }
    }
    public static void refilling(Car car, double value, FuelTypes ftype) throws InterruptedException, CarExcemption {
        if((car.getFuelLevel() + value) > car.getTankCapacity()){
            throw new CapacityExemption();
        } else if(ftype != car.getEngine().getFuelType()){
            throw new WrongFuelTypeExcemption();
        }
        else{
            System.out.println("Perform filling ------------->");
            for(int i = 0; i<10; i++){
                System.out.println("<--***-->");
                Thread.sleep(100);
            }
            car.setFuelLevel(car.getFuelLevel() + value);
            System.out.println("Car filled");
        }
    }
}

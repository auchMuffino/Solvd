import Buildings.*;
import Components.*;
import Excemptions.CarExcemption;
import Vehicles.Cars.*;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Wheels> wheels = new MyLinikedList<Wheels>();
        wheels.add(new Wheel(28, Seasons.MID_SEASON, WheelTypes.UNIVERSAL));
        wheels.add(new Wheel(28, Seasons.MID_SEASON, WheelTypes.UNIVERSAL));
        wheels.add( new Wheel(28, Seasons.MID_SEASON, WheelTypes.UNIVERSAL));
        wheels.add(new Wheel(28, Seasons.MID_SEASON, WheelTypes.UNIVERSAL));
        Car BMW = new CasualCar(5,280,2300d,"BMW X5", new Engine("Cool", 240, 4.4d, FuelTypes.DIESEL),
                wheels,
                new Transmission(Transmissions.OFF_ROAD), CarBody.SUV, 70d, 7.5d, 55d);
        Car BMW1 = new CasualCar(5,280,2300d,"BMW X5", new Engine("Cool", 240, 4.4d, FuelTypes.DIESEL),
                wheels,
                new Transmission(Transmissions.OFF_ROAD), CarBody.SUV, 70d, 7.5d, 55d);

        List<Car> cars = new MyLinkedList<Car>();
        cars.add(BWM);
        cars.add(BMW1);

        try {
            BMW.go(735);
        } catch (CarExcemption e) {
            e.printStackTrace();
        }
        LinkedList
        Mechanik vova = new Mechanik();

        if(vova.isBroken(BMW.getEngine())){
            vova.repair(BMW.getEngine());
            System.out.println("1");
        } else if (vova.isBroken(BMW.getTransmission())) {
            vova.repair(BMW.getTransmission());
            System.out.println("2");
        } else {
            vova.say();
        }
        CarWash.cleanCar(BMW);
    }
}
import Buildings.*;
import Components.*;
import Vehicles.Cars.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Car BMW = new CasualCar(5,280,2300d,"BMW X5", new Engine("Cool", 240, 4.4d, FuelTypes.DIESEL),
                new Wheel[]{new Wheel(28, Seasons.MID_SEASON, WheelTypes.UNIVERSAL),
                        new Wheel(28, Seasons.MID_SEASON, WheelTypes.UNIVERSAL),
                        new Wheel(28, Seasons.MID_SEASON, WheelTypes.UNIVERSAL),
                        new Wheel(28, Seasons.MID_SEASON, WheelTypes.UNIVERSAL)},
                new Transmission(Transmissions.OFF_ROAD), CarBody.SUV, 70d, 7.5d, 55d);

        BMW.go(735);
        System.out.println(BMW.getFuelLevel());
        GasStation.refilling(BMW, 20);
        System.out.println(BMW.getFuelLevel());

        CarWash.cleanCar(BMW);
    }
}
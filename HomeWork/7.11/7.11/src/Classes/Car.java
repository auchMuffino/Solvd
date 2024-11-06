package Classes;

import java.util.Arrays;
import java.util.Objects;

public abstract class Car {

    protected String title;
    protected Transmission transmission;
    protected GearBox gearBox;
    protected Wheel[] wheels;
    protected Engine engine;

    public Car() {

    }

    public Car(String title,Transmission transmission, GearBox gearBox, Wheel[] wheels, Engine engine) {
        this.title = title;
        this.transmission = transmission;
        this.gearBox = gearBox;
        this.wheels = wheels;
        this.engine = engine;
    }


    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setGearBox(GearBox gearBox) {
        this.gearBox = gearBox;
    }

    public GearBox getGearBox() {
        return gearBox;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = new Wheel[wheels.length];
        System.arraycopy(wheels, 0, this.wheels, 0, wheels.length);
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    @Override
    public String toString(){
        return "This is a " + title + " with engine: " + engine.getEngineTitle() + "\n\thorse powers " + engine.getHorsePowers() +
                "\n\tcapacity " + engine.getCapacity() + "\n\tfuel type "+ engine.getFuelType() + "\non " +transmission.getTransmission().name() + " transmission\n" +
                "contains " + gearBox.getGearsCount() + " gears " + "with top momentum around " + gearBox.getMaxMomentum() + "\n" +
                "Wheels description:\n" + "\tfront right wheel ratio " + wheels[0].getRatio() + " season " + wheels[0].getSeason().name() +
                "\n\tback right wheel ratio " + wheels[1].getRatio() + " season " + wheels[1].getSeason() + "\n\tback left wheel ratio " +
                wheels[2].getRatio() + " season " + wheels[2].getSeason().name() + "\n\tfront left wheel ratio " + wheels[3].getRatio() +
                " season " + wheels[3].getSeason().name();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(gearBox, car.gearBox) && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, transmission, gearBox, Arrays.hashCode(wheels), engine);
    }
}

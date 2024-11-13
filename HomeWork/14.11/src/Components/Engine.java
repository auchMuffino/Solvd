package Components;

import java.util.Objects;

public class Engine {
    private String engineTitle = "";
    private int horsePowers = 0;
    private double capacity = 0.0d;
    private FuelTypes fuelType = FuelTypes.DIESEL;


    public Engine(String engineTitle, int horsePowers, double capacity, FuelTypes fuelType) {
        this.engineTitle = engineTitle;
        this.horsePowers = horsePowers;
        this.capacity = capacity;
        this.fuelType = fuelType;
    }


    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getHorsePowers() {
        return horsePowers;
    }

    public void setHorsePowers(int horsePowers) {
        this.horsePowers = horsePowers;
    }
    public void setHorsePowers(double horsePowers){}


    public String getEngineTitle() {
        return engineTitle;
    }

    public void setEngineTitle(String engineTitle) {
        this.engineTitle = engineTitle;
    }

    public void setFuelType(FuelTypes fuelType){
        this.fuelType = fuelType;
    }

    public FuelTypes getFuelType(){
        return fuelType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineTitle='" + engineTitle + '\'' +
                ", horsePowers=" + horsePowers +
                ", capacity=" + capacity +
                ", fuelType=" + fuelType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return horsePowers == engine.horsePowers && Double.compare(capacity, engine.capacity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineTitle, horsePowers, capacity, fuelType);
    }
}

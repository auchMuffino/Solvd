package Classes;

public class Engine {

    private String engineTitle = "";
    private int horsePowers = 0;
    private double capacity = 0.0d;
    private Fuels fuelType = Fuels.DIESEL;


    public Engine(String engineTitle, int horsePowers, double capacity, Fuels fuelType) {
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

    public String getEngineTitle() {
        return engineTitle;
    }

    public void setEngineTitle(String engineTitle) {
        this.engineTitle = engineTitle;
    }

    public void setFuelType(Fuels fuelType){
        this.fuelType = fuelType;
    }

    public Fuels getFuelType(){
        return fuelType;
    }
}

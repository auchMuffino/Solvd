package Vehicles;

public interface Vehicle {

    Integer topSpeed = null;
    String title = "Untitled";
    Double weight = null;

    void setTopSpeed(Integer topSpeed);

    void setTitle(String title);

    void setWeight(Double weight);

    Integer getTopSpeed();

    String getTitle();

    Double getWeight();

    void go(int kms);
}

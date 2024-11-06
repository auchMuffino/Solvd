package Classes;

import java.util.Arrays;

public class ArmyTruck extends Car{

    private String weapon;

    public ArmyTruck() {
        super();
    }

    public ArmyTruck(String title, Transmission transmission, GearBox gearBox, Wheel[] wheels, Engine engine, String weapon) {
        super(title, transmission, gearBox, wheels, engine);
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "ArmyTruck{" +
                "weapon='" + weapon + '\'' +
                ", title='" + title + '\'' +
                ", transmission=" + transmission +
                ", gearBox=" + gearBox +
                ", wheels=" + Arrays.toString(wheels) +
                ", engine=" + engine +
                '}';
    }
}

package Classes;

import java.util.Arrays;

public class Sedan extends Car{

    public Sedan() {
        super();
    }

    public Sedan(String title, Transmission transmission, GearBox gearBox, Wheel[] wheels, Engine engine) {
        super(title, transmission, gearBox, wheels, engine);
    }


    @Override
    public String toString() {
        return "Sedan{" +
                "title='" + title + '\'' +
                ", transmission=" + transmission +
                ", gearBox=" + gearBox +
                ", wheels=" + Arrays.toString(wheels) +
                ", engine=" + engine +
                '}';
    }
}

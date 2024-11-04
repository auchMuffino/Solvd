import Classes.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Car BMW = new Car(
                "X5", new Transmission(Transmissions.OFF_ROAD), new GearBox(6, 8000),
                new Wheel[]{new Wheel(24,Seasons.WINTER), new Wheel(26,Seasons.MID_SEASON), new Wheel(26,Seasons.MID_SEASON), new Wheel(24,Seasons.WINTER)},
                new Engine("M62",286,4.4d,Fuels.DIESEL)
        );

        System.out.println(BMW);
    }
}
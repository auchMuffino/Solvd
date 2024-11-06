import Classes.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Car bMW = new Sedan(
                "X5", new Transmission(Transmissions.OFF_ROAD), new GearBox(6, 8000),
                new Wheel[]{new Wheel(24,Seasons.WINTER), new Wheel(26,Seasons.MID_SEASON), new Wheel(26,Seasons.MID_SEASON), new Wheel(24,Seasons.WINTER)},
                new Engine("M62",286,4.4d,Fuels.DIESEL)
        );
        Car mercedes = new Sedan(
                "amg", new Transmission(Transmissions.OFF_ROAD), new GearBox(6, 8000),
                new Wheel[]{new Wheel(24,Seasons.WINTER), new Wheel(26,Seasons.MID_SEASON), new Wheel(26,Seasons.MID_SEASON), new Wheel(24,Seasons.WINTER)},
                new Engine("amg",286,4.4d,Fuels.DIESEL)
        );

        Car armyTruck = new ArmyTruck(
                "AMT235", new Transmission(Transmissions.OFF_ROAD), new GearBox(12, 5000),
                new Wheel[]{
                        new Wheel(30,Seasons.WINTER), new Wheel(30,Seasons.WINTER),
                        new Wheel(30,Seasons.WINTER), new Wheel(30,Seasons.WINTER),
                        new Wheel(30,Seasons.WINTER), new Wheel(30,Seasons.WINTER)
                },
                new Engine("U890",500,7.0d,Fuels.DIESEL), "pistol"
        );

        System.out.println(bMW);
        System.out.println("************************************");
        System.out.println(armyTruck);
        System.out.println("************************************");
        System.out.println(bMW.equals(mercedes));
    }
}
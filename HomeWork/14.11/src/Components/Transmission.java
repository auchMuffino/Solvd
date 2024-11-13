package Components;

public class Transmission {
    private Transmissions transmissionType = Transmissions.CASUAL;

    public Transmission(Transmissions transmissionType){
        this.transmissionType = transmissionType;
    }

    public void setTransmission(Transmissions transmissionType){
        this.transmissionType = transmissionType;
    }
    public Transmissions getTransmission(){
        return transmissionType;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "transmissionType=" + transmissionType.name() +
                '}';
    }
}

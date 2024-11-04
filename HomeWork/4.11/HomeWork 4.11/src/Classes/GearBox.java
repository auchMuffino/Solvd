package Classes;

public class GearBox {

    private int gearsCount = 6;
    private int maxMomentum = 0;


    public GearBox(int gearsCount, int maxMomentum) {
        this.gearsCount = gearsCount;
        this.maxMomentum = maxMomentum;
    }


    public int getGearsCount() {
        return gearsCount;
    }

    public void setGearsCount(int gearsCount) {
        this.gearsCount = gearsCount;
    }

    public int getMaxMomentum() {
        return maxMomentum;
    }

    public void setMaxMomentum(int maxMomentum) {
        this.maxMomentum = maxMomentum;
    }
}

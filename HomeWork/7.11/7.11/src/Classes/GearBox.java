package Classes;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "GearBox{" +
                "gearsCount=" + gearsCount +
                ", maxMomentum=" + maxMomentum +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GearBox gearBox = (GearBox) o;
        return gearsCount == gearBox.gearsCount && maxMomentum == gearBox.maxMomentum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gearsCount, maxMomentum);
    }
}

package Classes;

public class Wheel {

    private int ratio = 0;
    private Seasons season = Seasons.MID_SEASON;

    public Wheel(int ratio, Seasons season) {
        this.ratio = ratio;
        this.season = season;
    }


    public Seasons getSeason() {
        return season;
    }

    public void setSeason(Seasons season) {
        this.season = season;
    }

    public int getRatio() {
        return ratio;
    }

    public void setRatio(int ratio) {
        this.ratio = ratio;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "ratio=" + ratio +
                ", season=" + season.name() +
                '}';
    }
}

package bikeRental;

/**
 * Created by nicopaez on 18/04/2018.
 */
public class Rental {
    private final Bike bike;
    private int period;
    private boolean isDaily;

    public Rental(Bike aBike) {
        this.bike = aBike;
    }

    public boolean isDaily() {
        return isDaily;
    }

    public Bike getBike() {
        return bike;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public int getPeriod() {
        return period;
    }

    public void setIsDaily(boolean isDaily) {
        this.isDaily = isDaily;
    }
}
package bikeRental;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nicopaez on 18/04/2018.
 */
public class Customer {
    private List<Rental> rentals;

    public Customer() {
        this.rentals = new ArrayList<Rental>();
    }

    public void addRental(Rental rental) {
        this.rentals.add(rental);
    }

    public int amountToPay() {
        int result = 0;
        for (Rental r: this.rentals) {
            if (r.isDaily()) {
                result += r.getBike().getDailyPrice();
            }
            else {
                result += r.getBike().getPrice() * r.getPeriod();
            }
        }
        return result;
    }
}

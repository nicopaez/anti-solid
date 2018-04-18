package bikeRental;

import org.junit.Test;

/**
 * Created by nicopaez on 18/04/2018.
 */
public class IntegrationTest {

    @Test
    public void ejemplo1() {
        Bike aBike = new Bike();
        aBike.setPrice(3);
        Rental rental = new Rental(aBike);
        rental.setPeriod(5);
        Customer aCustomer = new Customer();
        aCustomer.addRental(rental);
        int amount = aCustomer.amountToPay();
    }

    @Test
    public void ejemplo2() {
        Bike aBike = new Bike();
        aBike.setDailyPrice(10);
        Rental rental = new Rental(aBike);
        rental.setIsDaily(true);
        Customer aCustomer = new Customer();
        aCustomer.addRental(rental);
        int amount = aCustomer.amountToPay();
    }
}

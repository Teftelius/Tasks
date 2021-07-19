import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AmountOfSundaysTest {

    @Test
    public void getAmountOfSundays() {
        AmountOfSundays sundays = new AmountOfSundays();

        sundays.setFirstDate("01-01-2021");
        sundays.setSecondDate("17-01-2021");

        Assert.assertEquals(3, sundays.getAmountOfSundays());

        sundays.setFirstDate("19-07-2021");
        sundays.setSecondDate("25-07-2021");

        Assert.assertEquals(1, sundays.getAmountOfSundays());

        sundays.setFirstDate("01-01-2020");
        sundays.setSecondDate("01-01-2022");

        Assert.assertEquals(105, sundays.getAmountOfSundays());

        sundays.setFirstDate("19-07-2021");
        sundays.setSecondDate("23-07-2021");

        Assert.assertEquals(0, sundays.getAmountOfSundays());
    }
}
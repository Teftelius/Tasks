import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SerialNumberTest {

    @Test
    public void getSerialNumber() {
        SerialNumber serialNumber = new SerialNumber();

        serialNumber.setNumber(1);
        Assert.assertEquals(serialNumber.getSerialNumber(), "1st");

        serialNumber.setNumber(2);
        Assert.assertEquals(serialNumber.getSerialNumber(), "2nd");

        serialNumber.setNumber(3);
        Assert.assertEquals(serialNumber.getSerialNumber(), "3rd");

        serialNumber.setNumber(27);
        Assert.assertEquals(serialNumber.getSerialNumber(), "27th");

        serialNumber.setNumber(101);
        Assert.assertEquals(serialNumber.getSerialNumber(), "101st");
    }
}
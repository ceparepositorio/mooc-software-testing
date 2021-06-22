package tudelft.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;




public class LeapYearTest2 {
    @Test
    public void leapYearsThatAreNonCenturialYears(){
    LeapYear ly = new LeapYear();
    boolean leap = ly.isLeapYear(2016);
    Assertions.assertTrue(leap);
    }

    @Test
    public void leapCenturialYears(){
        LeapYear ly = new LeapYear();

        boolean leap = ly.isLeapYear(2000);
        Assertions.assertTrue(leap);

    }

    @Test
    public void nonLeapCenturialYears(){
        LeapYear ly = new LeapYear();

        boolean leap = ly.isLeapYear(1500);

        Assertions.assertFalse(leap);
    }

    @Test
    public void nonLeapYears(){
        LeapYear ly = new LeapYear();

        boolean leap = ly.isLeapYear(2017);

        Assertions.assertFalse(leap);

    }
}

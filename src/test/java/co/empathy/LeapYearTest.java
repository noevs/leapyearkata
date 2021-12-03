package co.empathy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class LeapYearTest {

    @Test
    void givenAYear400_whenIsLeapYear_thenReturnTrue() {
        Year year = new Year(400);
        assertTrue(year.isLeapYear());
    }

    @Test
    void givenAYear800_whenIsLeapYear_thenReturnTrue() {
        Year year = new Year(800);
        assertTrue(year.isLeapYear());
    }

    @Test
    void givenAYear0_whenIsLeapYear_thenReturnTrue() {
        Year year = new Year(0);
        assertTrue(year.isLeapYear());
    }

    @Test
    void givenAYearMinus400_whenIsLeapYear_thenReturnTrue() {
        Year year = new Year(-400);
        assertTrue(year.isLeapYear());
    }

    @Test
    void givenAYear401_whenIsLeapYear_thenReturnFalse() {
        Year year = new Year(401);
        assertFalse(year.isLeapYear());
    }

    @Test
    void givenAYear399_whenIsLeapYear_thenReturnFalse() {
        Year year = new Year(399);
        assertFalse(year.isLeapYear());
    }

    @Test
    void givenAYear1_whenIsLeapYear_thenReturnFalse() {
        Year year = new Year(1);
        assertFalse(year.isLeapYear());
    }

    @Test
    void givenAYear100_whenIsLeapYear_thenReturnFalse() {
        Year year = new Year(100);
        assertFalse(year.isLeapYear());
    }

    @Test
    void givenAYear500_whenIsLeapYear_thenReturnFalse() {
        Year year = new Year(500);
        assertFalse(year.isLeapYear());
    }

    @Test
    void givenAYear300_whenIsLeapYear_thenReturnFalse() {
        Year year = new Year(300);
        assertFalse(year.isLeapYear());
    }

    @Test
    void givenAYearMinus100_whenIsLeapYear_thenReturnFalse() {
        Year year = new Year(-100);
        assertFalse(year.isLeapYear());
    }

    @Test
    void givenAYear4_whenIsLeapYear_thenReturnTrue() {
        Year year = new Year(4);
        assertTrue(year.isLeapYear());
    }

    @Test
    void givenAYear8_whenIsLeapYear_thenReturnTrue() {
        Year year = new Year(8);
        assertTrue(year.isLeapYear());
    }

    @Test
    void givenAYearMinus4_whenIsLeapYear_thenReturnTrue() {
        Year year = new Year(-4);
        assertTrue(year.isLeapYear());
    }

    @Test
    void givenAYear3_whenIsLeapYear_thenReturnFalse() {
        Year year = new Year(3);
        assertFalse(year.isLeapYear());
    }

    @Test
    void givenAYear1700_whenIsLeapYear_thenReturnFalse() {
        Year year = new Year(1700);
        assertFalse(year.isLeapYear());
    }

    @Test
    void givenAYear1800_whenIsLeapYear_thenReturnFalse() {
        Year year = new Year(1800);
        assertFalse(year.isLeapYear());
    }

    @Test
    void givenAYear1900_whenIsLeapYear_thenReturnFalse() {
        Year year = new Year(1900);
        assertFalse(year.isLeapYear());
    }

    @Test
    void givenAYear2100_whenIsLeapYear_thenReturnFalse() {
        Year year = new Year(2100);
        assertFalse(year.isLeapYear());
    }

    @Test
    void givenAYear2000_whenIsLeapYear_thenReturnTrue() {
        Year year = new Year(2000);
        assertTrue(year.isLeapYear());
    }

    @Test
    void givenAYear2016_whenIsLeapYear_thenReturnTrue() {
        Year year = new Year(2016);
        assertTrue(year.isLeapYear());
    }

    @Test
    void givenAYear2012_whenIsLeapYear_thenReturnTrue() {
        Year year = new Year(2012);
        assertTrue(year.isLeapYear());
    }

    @Test
    void givenAYear2017_whenIsLeapYear_thenReturnFalse() {
        Year year = new Year(2017);
        assertFalse(year.isLeapYear());
    }

    @Test
    void givenAYear2018_whenIsLeapYear_thenReturnFalse() {
        Year year = new Year(2018);
        assertFalse(year.isLeapYear());
    }

    @Test
    void givenAYear2019_whenIsLeapYear_thenReturnFalse() {
        Year year = new Year(2019);
        assertFalse(year.isLeapYear());
    }
}

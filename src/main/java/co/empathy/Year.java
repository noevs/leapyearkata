package co.empathy;

public class Year {

    private final int year;

    public Year(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}

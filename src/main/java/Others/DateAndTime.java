package Others;

import java.time.LocalDate;

public class DateAndTime {
    public static void main(String[] args) {
        System.out.println(findDay(05,10,2021));
    }
    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month,day);

        return date.getDayOfWeek().name();
    }

}


package pl.sda.javakrk25.day6.Ex_14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Ex_14_date_time {

    /**
     * Napisać metodę, która przyjmie "XX.XX.XXXX" i zamieni go na obiekty klasy LocalDate.
     * Napisać metodę, która przyjmie "XX.XX.XX" i zamieni go na obiekty klasy LocalTime.
     * Napisać metodę, która przyjmie "XXX_XX_XX, XX:XX:XX:XXX" i zamieni go na obiekty klasy LocalDateTime.
     * Napisać metodę, która przyjmuje za parametr LocslDate, a zwracs nam datę, będącą poniedziałkiem w tygodniu z
     * tej daty.
     */

    public static void main(String[] args) {

        String dateInput = "13.12.2019";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDate = LocalDate.parse(dateInput, formatter);
        System.out.println(localDate);


        String timeImput = "12.13.46";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HH.mm.ss");
        LocalTime localTime = LocalTime.parse(timeImput, formatter1);
        System.out.println(localTime);


        String dateTimeInput = "2019_11_07, 12:32:14:274";
        LocalDateTime localDateTime = parseDataTime(dateTimeInput);
        System.out.println();


        System.out.println(getDateOfMondayOfWeeke(LocalDate.now()));
    }

    private static LocalDateTime parseDataTime(String dateTimeInput) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd, HH:mm:ss:SSS");
        return LocalDateTime.parse(dateTimeInput, formatter);
    }

    private static LocalDate getDateOfMondayOfWeeke(LocalDate date) {
        return date.with(ChronoField.DAY_OF_WEEK, 1);
    }
}

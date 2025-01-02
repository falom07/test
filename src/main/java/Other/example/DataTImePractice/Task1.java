package Other.example.DataTImePractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Task1 {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.of(2020,06,25,19,47);
        LocalDateTime date2 = date.plusMonths(3);
        LocalDate d = date2.toLocalDate();
        LocalTime d2 = date2.toLocalTime();
        System.out.println(date);
        System.out.println(date2);
        System.out.println(d);
        System.out.println(d2);
    }
}

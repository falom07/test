package Other.example.DataTImePractice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(DateTimeFormatter.ofPattern("dd.MM.hh").format(today));
    }
}

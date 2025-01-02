package Other.example.DataTImePractice;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class PracticeTime {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);
        ZonedDateTime zdt2 = zdt.plusSeconds(10);
        ZonedDateTime zdt3 = zdt.plus(10, ChronoUnit.DAYS);
        System.out.println(zdt2);
        ZonedDateTime s = zdt2.truncatedTo(ChronoUnit.DAYS);
        System.out.println(s.getZone());
    }
}

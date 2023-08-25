package dateapijava8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Localex {
    public static void main(String[] args) {
        LocalDate d=LocalDate.now();
        System.out.println(d);
        System.out.println(d.getDayOfWeek());
        System.out.println(d.getMonth());
        System.out.println(d.getDayOfMonth());
        System.out.println(d.getYear());
        System.out.println(d.getDayOfYear());
        System.out.println(d.getMonthValue());
        System.out.println(d.isLeapYear());
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("My birthday");
        LocalDate d2=LocalDate.of(2003,6,17);
        System.out.println(d2.getDayOfWeek());
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Plus functions");
        LocalDate d3=d2.plusDays(1);
        System.out.println(d3);
        System.out.println(d2.plusMonths(2));
        System.out.println(d2.plusWeeks(3));
        System.out.println(d2.plusYears(3));
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("minus functions");
        System.out.println(d2.minusDays(1));
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("LocalTime");
        LocalTime t=LocalTime.now();
        System.out.println(t);
        System.out.println(t.getHour());
        System.out.println(t.getMinute());
        System.out.println(t.getSecond());
        System.out.println(t.plusHours(3));
        System.out.println(t.plusMinutes(15));
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("LocalDateTime methods same combination");
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt.toString());

    }
}

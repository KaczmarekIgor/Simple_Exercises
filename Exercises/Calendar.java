package Exercises;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calendar {
    public static void main(String[] args) {
        System.out.println(" Kalendarz 2020 ");
// Object
        LocalDate date = LocalDate.now();
// currently month and day
        int today = date.getDayOfMonth();
        int month = date.getMonthValue();

        date = date.minusDays(today - 1);
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();
        System.out.println(" Pn Wt Sr Czw Pt S N");
        for (int i = 0; i < value; i++) {
            System.out.println(" ");
            while (date.getMonthValue() == month) {
                System.out.printf("%3d", date.getDayOfMonth());
                if (date.getDayOfMonth() == today)
                    System.out.print("*");
                else
                    System.out.println(" ");
                date = date.plusDays(1);
                if (date.getDayOfWeek().getValue() == 1)
                    System.out.println();
            }
        }


    }


}

package basic.data.types;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MyDate {
    public static void main(String[] args) {
        Date date = new Date(92, 6, 25);

        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar1.set(98, 3, 18, 16, 23, 22);
        calendar2.set(2017, 1, 23);

        System.out.println(date.toString());
        System.out.println(calendar1.getTime());

        System.out.println(calendar1.compareTo(calendar2));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String input = args.length == 0 ? "1818-11-12" : args[0];

        try {
            date = simpleDateFormat.parse(input);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        try {
            System.out.println(new Date() + "\n");
            Thread.sleep(5 * 60 * 10);
            System.out.println(new Date() + "\n");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        try {
            long start = System.currentTimeMillis();
            System.out.println(new Date() + "\n");

            Thread.sleep(5 * 60 * 10);
            System.out.println(new Date() + "\n");

            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println("Difference is : " + diff);
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }


        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1997, 6, 25, 15, 22, 33);
        System.out.println(gregorianCalendar.getTime());
    }
}


class GregorianCalendarDemo {

    public static void main(String args[]) {
        String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep",
                "Oct", "Nov", "Dec"};

        int year;
        // Create a Gregorian calendar initialized
        // with the current date and time in the
        // default locale and timezone.

        GregorianCalendar gcalendar = new GregorianCalendar();

        // Display current time and date information.
        System.out.print("Date: ");
        System.out.print(months[gcalendar.get(Calendar.MONTH)]);
        System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
        System.out.println(year = gcalendar.get(Calendar.YEAR));
        System.out.print("Time: ");
        System.out.print(gcalendar.get(Calendar.HOUR) + ":");
        System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
        System.out.println(gcalendar.get(Calendar.SECOND));

        // Test if the current year is a leap year
        if (gcalendar.isLeapYear(year)) {
            System.out.println("The current year is a leap year");
        } else {
            System.out.println("The current year is not a leap year");
        }
    }
}
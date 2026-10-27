package com.pluralsight;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class app {
    public static void main(String[] args) {

        // Get the current date and time
        LocalDateTime currentDate = LocalDateTime.now();

        // Format: 04/22/2026
        System.out.println(currentDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));


        System.out.println(currentDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        System.out.println(currentDate.format(DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy")));
        System.out.println(currentDate.format(DateTimeFormatter.ofPattern("EEEE, d, yyyy")));
        System.out.println(currentDate.format(DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy, HH:mm")));

    }
}

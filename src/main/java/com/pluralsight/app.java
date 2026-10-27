package com.pluralsight;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class app {
    public static void main(String[] args) {

        // Get the current date and time
        LocalDateTime currentDate = LocalDateTime.now();

        // Format: 10/27/2026
        System.out.println(currentDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));

        // Format: 2026-10-27
        System.out.println(currentDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

        // Format: October27, 2026
        System.out.println(currentDate.format(DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy")));

        // Format: Tuesday, 27, 2026
        System.out.println(currentDate.format(DateTimeFormatter.ofPattern("EEEE, d, yyyy")));

        // Format: Tuesday, Oct 22, 2026  14:43
        System.out.println(currentDate.format(DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy, HH:mm")));

    }
}

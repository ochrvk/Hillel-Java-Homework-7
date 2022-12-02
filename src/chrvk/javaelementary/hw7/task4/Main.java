package chrvk.javaelementary.hw7.task4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static String getDate(String dateString) {
        String format = "dd.MM.yyyy HH:mm:ss";
        String newFormat = "dd MMM, h:mm a";
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
            LocalDateTime localDate = LocalDateTime.parse(dateString, formatter);
            formatter = DateTimeFormatter.ofPattern(newFormat, Locale.US);
            dateString = localDate.format(formatter);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return dateString;
    }

    public static void main(String[] args) {
        String dateString = "22.01.2019 19:15:00";
        dateString = getDate(dateString);
        System.out.println(dateString);
    }
}

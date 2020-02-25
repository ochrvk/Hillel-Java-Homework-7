/*  Задана строка с датой вида "22.01.2019 19:15:00".
    Написать метод который преобразовывает ее в формат "22 Jan, 7:15 PM".
    Предусмотреть обработку ситуации если входящая дата в недопустимом формате.
*/
package Task4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class main {
    public static String getDate(String dateString) {
        String format = "dd.MM.yyyy HH:mm:ss";
        String newFormat = "dd MMM, h:mm a";
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
            LocalDateTime localDate = LocalDateTime.parse(dateString, formatter);
            formatter = DateTimeFormatter.ofPattern(newFormat, Locale.US);
            dateString = localDate.format(formatter);
        } catch (Exception e) {
            System.out.println(e);
        }

        return dateString;
    }

    public static void main(String[] args) {
        String dateString = "22.01.2019 19:15:00";
        dateString = getDate(dateString);
        System.out.println(dateString);
    }
}

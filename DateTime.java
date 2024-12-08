import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    /**
     * Returns the current date and time formatted as "MM-dd-yyyy:mm:ss".
     *
     * @return A string representing the current date and time in the format "MM-dd-yyyy:mm:ss".
     */
    public static String getCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy:mm:ss");

        return now.format(formatter);

    }
}

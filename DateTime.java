import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static String getCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy:mm:ss");

        return now.format(formatter);

    }
}

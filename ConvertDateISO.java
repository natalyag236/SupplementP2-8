import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class ConvertDateISO {
    /**
     * Converts a given LocalDateTime to an ISO 8601 string format in UTC.
     *
     * @param dateTime The LocalDateTime to convert.
     * @return A string representing the date and time in ISO 8601 format with UTC timezone.
     */
    public static String convertISO(LocalDateTime dateTime){
        return dateTime.atZone(ZoneOffset.UTC).format(DateTimeFormatter.ISO_DATE_TIME);
    }
}

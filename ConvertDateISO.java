import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class ConvertDateISO {
    public static String convertISO(LocalDateTime dateTime){
        return dateTime.atZone(ZoneOffset.UTC).format(DateTimeFormatter.ISO_DATE_TIME);
    }
}

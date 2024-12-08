import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class NumDays2Dates {
    public static long getDaysBetween(LocalDate startDate, LocalDate endDate){
        return ChronoUnit.DAYS.between(startDate, endDate);
    }
}

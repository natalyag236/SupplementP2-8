import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class NumDays2Dates {
    /**
     * Calculates the number of days between two LocalDate instances.
     *
     * @param startDate The start date.
     * @param endDate The end date.
     * @return The number of days between the start date and end date.
     */

    public static long getDaysBetween(LocalDate startDate, LocalDate endDate){
        return ChronoUnit.DAYS.between(startDate, endDate);
    }
}

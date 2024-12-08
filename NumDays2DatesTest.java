import static org.junit.Assert.assertEquals;
import java.time.LocalDate;

import org.junit.Test;

public class NumDays2DatesTest {
    @Test
    public void testGetDayBetween(){
        LocalDate startDate = LocalDate.of(2024, 06, 1);
        LocalDate endDate = LocalDate.of(2024, 06, 10);

        long result = NumDays2Dates.getDaysBetween(startDate, endDate);

        long expected = 9;

        assertEquals("The number of  days between the two dates should be 9", expected, result);



    }
}

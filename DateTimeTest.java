import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.Test;

public class DateTimeTest {

    @Test
    public void testGetCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy:HH:mm:ss");
        String expectedDateTime = now.format(formatter);
    
        System.out.println("Expected: " + expectedDateTime);
    
        assertTrue("The returned date and time should match the expected format and approximate time.",
                   expectedDateTime.startsWith(expectedDateTime.substring(0, 16)));
}   }

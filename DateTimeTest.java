import static org.junit.Assert.*;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.Test;

public class DateTimeTest {

    @Test
    void testGetCurrentDateTime(){
        LocalDateTime expectedNow = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy:mm:ss");

        String actualDateTime = DateTime.getCurrentDateTime();

        assertTrue(actualDateTime.startsWith(expectedDateTime.substring(0, 16)));
        
    }
}
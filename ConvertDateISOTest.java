import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;

import org.junit.Test;

public class ConvertDateISOTest {
    @Test
    public void testConvertISO(){
        LocalDateTime sampleDateTime = LocalDateTime.of(2024, 12, 14, 9, 30, 5,0);

        String result = ConvertDateISO.convertISO(sampleDateTime);

        String expected = "2024-12-14T09:30:05Z";

        assertEquals("The converted date should match the ISO 8601 UTC time format", expected, result);
    }
}

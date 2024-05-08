import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    public void testFormatDate() {
        String inputString = "2023-03-01T13:00:00Z";
        String expected = "01 marzo 2023";

        OffsetDateTime dateTime = OffsetDateTime.parse(inputString);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String formattedDate = dateTime.format(formatter);

        assertEquals(expected, formattedDate);
    }
}

package converter.hour;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FiveHoursRowConverterTest {

    public void fiveHoursRow(int hour, String expected) {
        String res = FiveHoursRowConverter.INSTANCE.convert(hour);
        assertEquals(res, expected);
    }

    @Test
    public void fiveHoursRow_00() {
        fiveHoursRow(0, "OOOO");
    }

    @Test
    public void fiveHoursRow_23() {
        fiveHoursRow(23, "RRRR");
    }

    @Test
    public void fiveHoursRow_02() {
        fiveHoursRow(2, "OOOO");
    }

    @Test
    public void fiveHoursRow_08() {
        fiveHoursRow(8, "ROOO");
    }

    @Test
    public void fiveHoursRow_16() {
        fiveHoursRow(16, "RRRO");
    }
}
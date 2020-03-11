package converter.hour;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SingleHoursRowConverterTest {
    private void singleHoursRow(int hour, String expected) {
        String res = SingleHoursRowConverter.INSTANCE.convert(hour);
        assertEquals(expected, res);
    }

    @Test
    public void singleHoursRow_00() {
        singleHoursRow(0, "OOOO");
    }

    @Test
    public void singleHoursRow_23() {
        singleHoursRow(23, "RRRO");
    }

    @Test
    public void singleHoursRow_02() {
        singleHoursRow(2, "RROO");
    }

    @Test
    public void singleHoursRow_08() {
        singleHoursRow(8, "RRRO");
    }

    @Test
    public void singleHoursRow_14() {
        singleHoursRow(14, "RRRR");
    }

}
package converter.minute;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FiveMinutesRowConverterTest {
    private void fiveMinutesRow(int minute, String expected) {
        String res = FiveMinutesRowConverter.INSTANCE.convert(minute);
        assertEquals(expected, res);
    }

    @Test
    public void fiveMinutesRow_00() {
        fiveMinutesRow(00, "OOOOOOOOOOO");
    }

    @Test
    public void fiveMinutesRow_59() {
        fiveMinutesRow(59, "YYRYYRYYRYY");
    }

    @Test
    public void fiveMinutesRow_04() {
        fiveMinutesRow(00, "OOOOOOOOOOO");
    }

    @Test
    public void fiveMinutesRow_23() {
        fiveMinutesRow(23, "YYRYOOOOOOO");
    }

    @Test
    public void fiveMinutesRow_35() {
        fiveMinutesRow(35, "YYRYYRYOOOO");
    }

}
package converter.minute;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SingleMinutesRowConverterTest {
    private void singleMinutesRow(int minute, String expected) {
        String res = SingleMinutesRowConverter.INSTANCE.convert(minute);
        assertEquals(expected, res);
    }

    @Test
    public void singleMinutesRow_00() {
        singleMinutesRow(0, "OOOO");
    }

    @Test
    public void singleMinutesRow_59() {
        singleMinutesRow(59, "YYYY");
    }

    @Test
    public void singleMinutesRow_32() {
        singleMinutesRow(32, "YYOO");
    }

    @Test
    public void singleMinutesRow_34() {
        singleMinutesRow(34, "YYYY");
    }

    @Test
    public void singleMinutesRow_35() {
        singleMinutesRow(35, "OOOO");
    }

}
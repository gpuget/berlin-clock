package converter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SecondLampConverterTest {
    @Test
    public void convert_00() {
        String res = SecondLampConverter.INSTANCE.convert(0);
        assertEquals(res, "Y");
    }

    @Test
    public void convert_59() {
        String res = SecondLampConverter.INSTANCE.convert(59);
        assertEquals(res, "O");
    }
}
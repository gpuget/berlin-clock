package converter.minute;

import converter.Converter;
import light.DoubleSwitch;
import java.util.stream.IntStream;

public enum FiveMinutesRowConverter implements Converter, DoubleSwitch {
    INSTANCE;

    @Override
    public String convert(int minute) {
        int q = Math.floorDiv(minute, 5);
        return IntStream.rangeClosed(1, number())
                        .mapToObj(i -> turnOn(i <= q, (i % 3) == 0))
                        .reduce("", String::concat);
    }

    @Override
    public int number() {
        return 11;
    }

    @Override
    public Light second() {
        return Light.RED;
    }
}

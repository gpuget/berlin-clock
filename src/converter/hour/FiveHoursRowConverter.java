package converter.hour;

import converter.Converter;
import java.util.stream.IntStream;
import light.Switch;

public enum FiveHoursRowConverter implements Converter, Switch {
    INSTANCE;

    public String convert(int hour) {
        int q = Math.floorDiv(hour, 5);
        return IntStream.rangeClosed(1, number()).mapToObj(i -> turnOn(i <= q)).reduce("", String::concat);
    }

    @Override
    public Light on() {
        return Light.RED;
    }

    @Override
    public int number() {
        return 4;
    }
}

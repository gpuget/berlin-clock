package converter;

import java.util.stream.IntStream;
import light.Switch;

public interface SingleRowConverter extends Converter, Switch {
    @Override
    default String convert(int value) {
        StringBuilder sb = new StringBuilder();
        int r = value % 5;
        IntStream.rangeClosed(1, number()).forEach(i -> sb.append(turnOn(i <= r)));
        return sb.toString();
    }

    @Override
    default int number() {
        return 4;
    }
}

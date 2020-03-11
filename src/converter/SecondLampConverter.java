package converter;

import light.Switch;

public enum SecondLampConverter implements Converter, Switch {
    INSTANCE;

    @Override
    public String convert(int second) {
        return turnOn((second % 2) == 0);
    }
}

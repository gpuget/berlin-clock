package light;

public interface DoubleSwitch extends Switch {
    default String turnOn(boolean b1, boolean b2) {
        return b1
               ? (b2
                  ? second().toString()
                  : first().toString())
               : off().toString();
    }

    default Light first() {
        return on();
    }

    default Light second() {
        return on();
    }
}

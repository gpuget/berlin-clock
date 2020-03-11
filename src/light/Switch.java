package light;

public interface Switch {
    default String turnOn(boolean value) {
        return value
               ? on().toString()
               : off().toString();
    }

    default Light off() {
        return Light.OFF;
    }

    default Light on() {
        return Light.YELLOW;
    }

    default int number() {
        return 1;
    }

    enum Light {
        OFF("O"),
        YELLOW("Y"),
        RED("R");

        private final String string;

        Light(String string) {
            this.string = string;
        }

        @Override
        public String toString() {
            return string;
        }
    }
}

package converter.hour;

import converter.SingleRowConverter;

public enum SingleHoursRowConverter implements SingleRowConverter {
    INSTANCE;

    @Override
    public Light on() {
        return Light.RED;
    }
}

import converter.SecondLampConverter;
import converter.hour.FiveHoursRowConverter;
import converter.hour.SingleHoursRowConverter;
import converter.minute.FiveMinutesRowConverter;
import converter.minute.SingleMinutesRowConverter;
import java.time.LocalTime;
import java.util.StringJoiner;

public class BerlinClockConverter {
    public static final String DELIMITER = "";

    public static String toBerlinClock(LocalTime time) {
        return toBerlinClock(time.getHour(), time.getMinute(), time.getSecond());
    }

    private static String toBerlinClock(int hour, int minute, int second) {
        return new StringJoiner(DELIMITER).add(SecondLampConverter.INSTANCE.convert(second))
                                          .add(FiveHoursRowConverter.INSTANCE.convert(hour))
                                          .add(SingleHoursRowConverter.INSTANCE.convert(hour))
                                          .add(FiveMinutesRowConverter.INSTANCE.convert(minute))
                                          .add(SingleMinutesRowConverter.INSTANCE.convert(minute))
                                          .toString();
    }
}

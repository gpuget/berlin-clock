import static org.junit.Assert.assertEquals;

import java.time.LocalTime;
import org.junit.Test;

public class BerlinClockConverterTest {

    private void toBerlinClock(LocalTime time, String expected) {
        String res = BerlinClockConverter.toBerlinClock(time);
        assertEquals(res, expected);
    }

    @Test
    public void toBerlinClock_000000() {
        toBerlinClock(LocalTime.of(0, 0, 0), "YOOOOOOOOOOOOOOOOOOOOOOO");
    }

    @Test
    public void toBerlinClock_235959() {
        toBerlinClock(LocalTime.of(23, 59, 59), "ORRRRRRROYYRYYRYYRYYYYYY");
    }

    @Test
    public void toBerlinClock_165006() {
        toBerlinClock(LocalTime.of(16, 50, 06), "YRRROROOOYYRYYRYYRYOOOOO");
    }

    @Test
    public void toBerlinClock_113701() {
        toBerlinClock(LocalTime.of(11, 37, 1), "ORROOROOOYYRYYRYOOOOYYOO");
    }
}

package hometheater;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AmplifierTest {

    @Test
    void shouldAcceptValidVolume() {
        Amplifier amplifier = new Amplifier();
        amplifier.turnOn();

        assertDoesNotThrow(() -> amplifier.setVolume(50));
    }

    @Test
    void shouldRejectNegativeVolume() {
        Amplifier amplifier = new Amplifier();
        amplifier.turnOn();

        assertThrows(IllegalArgumentException.class,
                () -> amplifier.setVolume(-10));
    }

    @Test
    void shouldRejectVolumeAbove100() {
        Amplifier amplifier = new Amplifier();
        amplifier.turnOn();

        assertThrows(IllegalArgumentException.class,
                () -> amplifier.setVolume(150));
    }

    @Test
    void shouldRejectVolumeWhenTurnedOff() {
        Amplifier amplifier = new Amplifier();

        assertThrows(IllegalStateException.class,
                () -> amplifier.setVolume(50));
    }
}

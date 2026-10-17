
package hometheater;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HomeTheaterFacadeTest {

    @Test
    void shouldStartMovieSuccessfully() {
        HomeTheaterFacade theater = new HomeTheaterFacade();

        assertDoesNotThrow(() -> {
            theater.watchMovie("Interstellar");
            theater.endMovie();
        });
    }

    @Test
    void shouldRejectEmptyMovieName() {
        HomeTheaterFacade theater = new HomeTheaterFacade();

        assertThrows(IllegalArgumentException.class,
                () -> theater.watchMovie(""));
    }

    @Test
    void shouldRejectNullMovieName() {
        HomeTheaterFacade theater = new HomeTheaterFacade();

        assertThrows(IllegalArgumentException.class,
                () -> theater.watchMovie(null));
    }
}

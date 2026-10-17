
package hometheater;

public class HomeTheaterFacade {

    private final Projector projector;
    private final Amplifier amplifier;
    private final StreamingPlayer player;

    public HomeTheaterFacade() {
        projector = new Projector();
        amplifier = new Amplifier();
        player = new StreamingPlayer();
    }

    public void watchMovie(String movieName) {
        if (movieName == null || movieName.isBlank()) {
            throw new IllegalArgumentException(
                    "Movie name cannot be empty."
            );
        }

        System.out.println("Starting home theater...");

        try {
            projector.turnOn();
            projector.setInput("Streaming Player");

            amplifier.turnOn();
            amplifier.setVolume(50);

            player.turnOn();
            player.playMovie(movieName);

            System.out.println("Enjoy your movie!");

        } catch (RuntimeException e) {
            endMovie();
            throw new IllegalStateException(
                    "Failed to start the movie.", e
            );
        }
    }

    public void endMovie() {
        System.out.println("Shutting down home theater...");

        player.turnOff();
        amplifier.turnOff();
        projector.turnOff();

        System.out.println("Home theater is OFF.");
    }
}

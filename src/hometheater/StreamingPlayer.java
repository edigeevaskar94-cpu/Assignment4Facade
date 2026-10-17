
package hometheater;

public class StreamingPlayer {

    private boolean isOn = false;
    private String currentMovie;

    public void turnOn() {
        isOn = true;
        System.out.println("Streaming Player is ON.");
    }

    public void playMovie(String movie) {
        if (!isOn) {
            throw new IllegalStateException(
                    "Streaming Player is OFF."
            );
        }

        if (movie == null || movie.isBlank()) {
            throw new IllegalArgumentException(
                    "Movie name cannot be empty."
            );
        }

        currentMovie = movie;
        System.out.println("Playing movie: " + currentMovie);
    }

    public void stopMovie() {
        if (currentMovie != null) {
            System.out.println("Stopped movie: " + currentMovie);
            currentMovie = null;
        }
    }

    public void turnOff() {
        stopMovie();
        isOn = false;
        System.out.println("Streaming Player is OFF.");
    }
}

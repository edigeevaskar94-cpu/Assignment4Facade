
package hometheater;

public class Projector {

    private boolean isOn = false;

    public void turnOn() {
        if (isOn) {
            System.out.println("Projector is already on.");
            return;
        }

        isOn = true;
        System.out.println("Projector is ON.");
    }

    public void setInput(String input) {
        if (!isOn) {
            throw new IllegalStateException("Projector is OFF.");
        }

        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException("Input cannot be empty.");
        }

        System.out.println("Projector input: " + input);
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Projector is OFF.");
    }
}
    
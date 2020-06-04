package Day14.src;

public class Input {
    private boolean isEnabled = true;

    public Input(
    // boolean isEnabled
    ) {
        // System.out.println("Input");
        // this.isEnabled = isEnabled;
    }

    public void render() {
    }

    public void disable() {
        this.isEnabled = false;
    }

    public boolean isEnabled() {
        return this.isEnabled;
    }

    @Override
    public String toString() {
        return "Ini class Input";
    }

}
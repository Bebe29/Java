package Day14.src;

public class TextBox extends Input {
    private String text = "";

    public TextBox() {
        // super(true);
        // System.out.println("Text Box");
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        this.text = "";
    }

    public void render() {
        System.out.println("Render TextBox");
    }

    @Override
    public String toString() {
        return this.text;
    }
}
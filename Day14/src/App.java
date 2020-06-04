package Day14.src;

public class App {
    public static void main(String[] args) throws Exception {
        TextBox textbox = new TextBox();
        Input input = new Input();

        // TextBox textBox = new TextBox(false, "Ini Text");

        // System.out.println(textbox.isEnabled());

        // TextBox textbox = new TextBox();
        // textbox.setText("Hello World");
        // System.out.println(textbox);

        // Point point1 = new Point(1, 2);
        // Point point2 = new Point(1, 2);

        // // System.out.println(point1.equals(point2));
        // System.out.println(point1.hashCode());
        // System.out.println(point2.hashCode());

        show(textbox);

        // Input[] inputs = { new TextBox(), new CheckBox() };

        // for (int i = 0; i < inputs.length; i++) {
        // inputs[i].render();
        // }
    }

    public static void show(Input input) {
        if (input instanceof TextBox) {
            TextBox textBox = (TextBox) input;
            textBox.setText("Text sudah diganti");
        }
        System.out.println(input);
    }
}

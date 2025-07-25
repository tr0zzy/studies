package homeWork7._ex3;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.addPlugin(new UpperCasePlugin());
        editor.addPlugin(new WordCountPlugin());
        editor.addPlugin(new RemoveSpacesPlugin());

        String input = "Hello World";
        editor.run(input);
    }
}

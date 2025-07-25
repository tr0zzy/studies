package homeWork7._ex3;

public class UpperCasePlugin implements Plugin{                                           //Делает текст заглавным
    @Override
    public void apply(String text) {
        System.out.println("[" + getName() + "]: " + text.toUpperCase());
    }

    @Override
    public String getName() {
        return "UpperCase";
    }
}

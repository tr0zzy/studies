package homeWork7._ex3;

public class WordCountPlugin implements Plugin{                                  //Считает количество слов
    @Override
    public void apply(String text) {
        int wordCount = text.trim().isEmpty() ? 0 : text.trim().split("\\s+").length;
        System.out.println("[" + getName() + "]: Word count = " + wordCount);
    }

    @Override
    public String getName() {
        return "WordCountPlagin";
    }
}

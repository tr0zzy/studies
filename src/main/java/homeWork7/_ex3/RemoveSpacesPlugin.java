package homeWork7._ex3;


public class RemoveSpacesPlugin implements Plugin{                                                 //Удаляет все пробелы
    @Override
    public void apply(String text) {
        System.out.println("[" + getName() + "]: "+ text.replace(" ", ""));
    } 

    @Override
    public String getName() {
        return "RemoveSpacesPlugin";
    }
}

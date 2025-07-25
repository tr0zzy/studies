package homeWork5._ex1._ex2;

public class Main {
    public static void main(String[] args) {
        Employ[] employ = new Employ[3];
        employ[0] = new Manager("Victor", 100, 36);
        employ[1] = new Developer("Artur", 150, 3);
        employ[2] = new Designer("Sergei", 130, 20);
        for (Employ employ1 : employ){
            System.out.println(employ1.getInfo());
        }
    }
}

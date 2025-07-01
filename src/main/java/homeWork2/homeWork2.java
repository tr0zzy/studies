package homeWork2;

public class homeWork2 {
    public static void main(String[] args) {
        String name= "Maxim";
        int age= 16;
        boolean rights= false;
        double height= 1.81D;
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Has driving license? "+rights);
        System.out.println("Height: "+height+" m");

        System.out.println();

        double distance= 180.5D;
        double speed= 90.0D;
        double time= distance/speed;
        System.out.println("Время в пути "+ time);

        System.out.println();

        double money= 100.0D;
        double price= 35.80;
        int bought= 2;
        double spent= price*bought;
        double left= money-spent;
        System.out.println("Потратил "+spent+" лей");
        System.out.println("Осталось "+left+" лей");


    }
}

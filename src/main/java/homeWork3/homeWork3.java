package homeWork3;

public class homeWork3 {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int month = 11;
        switch (month){
            case 12, 1, 2:
                System.out.println("Winter");
                break;
            case 3, 4, 5:
                System.out.println("Spring");
                break;
            case 6, 7, 8:
                System.out.println("Summer");
                break;
            case 9, 10, 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Invalid month");
        }
        System.out.println();

        System.out.println("Задача 2");
        for(int i = 1; i < 500; i++){
            if(i % 3 == 0 && i % 7 == 0){
                System.out.println(i);
            }
        }
        System.out.println();

        System.out.println("Задача 3");
        double sum = 0.0;
        for (int i = 1; i <= 90; i++) {
            sum += (double) i / ( i + 1);
        }
        System.out.println("Итоговая сумма: "+sum);

        System.out.println();

        System.out.println("Задача 4");
        for (int i = 1; i <= 10; i++ ){
            for(int j = 1; j <= 10; j++){
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}

package homeWork11._ex1;

public class Main {
    public static void main(String[] args) {
      int x = 10;
      int y = 0;

        System.out.println(divideLBYL( x , y));
        System.out.println(divideEAFP( x , y));
        System.out.println("Ошибка: деления на ноль ");
    }
    public static int divideLBYL (int x, int y){
        if(y == 0){
            return 0;
        } else
            return x / y;

    }
    public static int divideEAFP(int x, int y){
        try {
            return x / y;
        } catch (ArithmeticException e){
            return 0;
        } finally {
            System.out.println("Программа завершена");
        }
    }
}

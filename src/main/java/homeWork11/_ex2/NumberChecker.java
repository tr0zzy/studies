package homeWork11._ex2;

public class NumberChecker {
    public static void checkNumber( int number ) throws NegativeNumberException{
        if ( number <= 0){
            throw new NegativeNumberException("Отрицательные числа запрещены");
        } else
            System.out.println("Число положительное "  + number);
    }
}

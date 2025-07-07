package homeWork4;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add( 3, 3));
        System.out.println(cal.subtract( 3, 3));
        System.out.println(cal.multiply( 3, 3));
        System.out.println(cal.divide( 3, 3));
        System.out.println();
        Person person1 = new Person("Tom", 19 );
        Person person2 = new Person("Dima", 16);
        person1.sayHello();
        person2.sayHello();
        System.out.println();
        BankAccount bank = new BankAccount("Maria", 100);
        bank.deposit(50);
        bank.withdraw(200);
        bank.withdraw(100);
       bank.getBalance();
    }
}

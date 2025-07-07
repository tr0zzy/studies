package homeWork4;

public class BankAccount {
    String owner;
    double balance;

    public BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }
    //Пополнение счета
    public void deposit(double amount){
         if (amount > 0){
             balance += amount;
             System.out.println("Пополнил(ла) счет на "+ amount );
         } else{
             System.out.println("Ошибка так как число должно быть положительным");
         }
    }
    //Снятие средств
    public void withdraw(double amount){
        if (amount < balance){
            System.out.println("Не хватает средств для снятия "+amount);
        } else if (amount <= 0) {
            System.out.println("Сумма должна быть положительной и больше 0");
        } else {
            balance -= amount;
            System.out.println(owner + " снял(ла) "+ amount);
        }
        }
        //Текущий баланс
        public void getBalance(){
            System.out.println("Текущий баланс "+ owner + ": "+ balance);
    }

}

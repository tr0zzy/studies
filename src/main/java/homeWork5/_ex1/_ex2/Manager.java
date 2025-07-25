package homeWork5._ex1._ex2;

public class Manager extends Employ{

   private int bonus;

    public Manager(String name, double baseSalary, int bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}

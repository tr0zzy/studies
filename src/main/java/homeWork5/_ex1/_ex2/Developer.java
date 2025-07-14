package homeWork5._ex1._ex2;

public class Developer extends Employ{
    private int colProect;

    public Developer(String name, double baseSalary, int colproect) {
        super(name, baseSalary);
        this.colProect = colproect;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + colProect * 300;
    }
}

package homeWork5._ex1._ex2;

public class Designer extends Employ{
    private int premia;

    public Designer(String name, double baseSalary, int premia) {
        super(name, baseSalary);
        this.premia = premia;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + premia;
    }
}

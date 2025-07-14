package homeWork5._ex1._ex2;

public abstract class Employ {
    String name;
    double baseSalary;

    public Employ(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getInfo(){
        return "Name: " + name + ", Salary: " + calculateSalary();
    }
    public abstract double calculateSalary();
}

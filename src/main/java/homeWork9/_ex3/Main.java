package homeWork9._ex3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

                List<Employee> employees = Arrays.asList(
                        new Employee("Иван", "IT", 1000),
                        new Employee("Мария", "HR", 800),
                        new Employee("Пётр", "IT", 1200),
                        new Employee("Анна", "HR", 950),
                        new Employee("Дмитрий", "Finance", 1100)
                );

                // Группировка и расчет средней зарплаты
                Map<String, Double> avgSalaryByDept = employees.stream()
                        .collect(Collectors.groupingBy(
                                e -> e.department, // группировка по отделу
                                Collectors.averagingDouble(e -> e.salary) // средняя зарплата
                        ));

                // Вывод результата
                avgSalaryByDept.forEach((dept, avgSalary) ->
                        System.out.println("Отдел: " + dept + " — Средняя зарплата: " + avgSalary)
                );
    }
}

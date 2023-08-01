package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    //Basic Salary <= 10000: taxes - 15%.
    // 10000 < Basic Salary <= 20000: taxes - 18% Basic Salary > 20000 : taxes - 20% Basic salary < 0 -> "wrong input!"
    public void calculateSalary(int salary) {
        double input = 0.0;
        if (salary < 0) {
            System.out.println("wrong input!");
            return;
        }
        if (salary <= 10000) {
            input = (double) salary / 100.0 * 15;
        } else if (salary > 10000 && salary <= 20000) {
            input = (double) salary / 100.0 * 18;
        } else if (salary > 20000) {
            input = (double) salary / 100.0 * 20;
        }
        input = (double) salary - input;
        System.out.println(input);
    }
}

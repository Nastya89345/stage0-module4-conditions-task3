package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double resultSalary;
        if(salary >= 0 && salary <= 10000){
            resultSalary = salary - salary * 0.15;
            System.out.println(resultSalary);
        }else if (salary > 10000 && salary <= 20000){
            resultSalary = salary - salary * 0.18;
            System.out.println(resultSalary);
        }else if (salary > 20000){
            resultSalary = salary - salary * 0.20;
            System.out.println(resultSalary);
        }else {
            System.out.println("wrong input!");
        }
    }
}

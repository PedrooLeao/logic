package oo.employee;

import java.math.BigDecimal;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Pedro Leao", "Manager", new BigDecimal("1000.00"));

        e1.printEmployeeDetails();

        e1.raiseSalary(new BigDecimal("0.1"));

        e1.printEmployeeDetails();
    }
}

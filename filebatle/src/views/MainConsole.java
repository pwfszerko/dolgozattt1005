package views;

import java.util.List;

import models.Employee;

public class MainConsole {
    public void showData(List<Employee>employeeList) {
        for (Employee employee :employeeList) {
            System.out.println("Név: " + employee.getName() + ", Kor: " + employee.getAge() + ", Fizetés: " + employee.getSalary());
        }
    }
}

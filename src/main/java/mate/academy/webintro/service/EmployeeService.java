package mate.academy.webintro.service;

import mate.academy.webintro.model.Employee;
import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);

    List<Employee> findAll();
}

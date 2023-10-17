package mate.academy.webintro.repository;

import java.util.List;
import mate.academy.webintro.model.Employee;

public interface EmployeeRepository {
    Employee save(Employee employee);

    List<Employee> findAll();
}

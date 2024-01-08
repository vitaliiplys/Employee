package mate.academy.webintro.repository;

import java.util.List;
import mate.academy.webintro.model.Employee;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @EntityGraph(attributePaths = "skills")
    List<Employee> findAll();
}

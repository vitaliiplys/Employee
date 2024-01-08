package mate.academy.webintro.dto;

import java.util.List;
import lombok.Data;
import mate.academy.webintro.model.Department;

@Data
public class EmployeeRequestDto {
    private String name;
    private String email;
    private Long departmentId;
    private List<Long> skills;
}

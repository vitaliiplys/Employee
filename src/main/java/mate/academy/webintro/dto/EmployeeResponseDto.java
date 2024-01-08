package mate.academy.webintro.dto;

import java.util.List;
import lombok.Data;

@Data
public class EmployeeResponseDto {
    private Long id;
    private String name;
    private String email;
    private Long departmentId;
    private List<Long> skillIds;
}

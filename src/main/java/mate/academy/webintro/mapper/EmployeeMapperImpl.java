/*package mate.academy.webintro.mapper;

import java.util.ArrayList;
import java.util.List;
import mate.academy.webintro.dto.EmployeeRequestDto;
import mate.academy.webintro.dto.EmployeeResponseDto;
import mate.academy.webintro.dto.EmployeeWithoutSkillsDto;
import mate.academy.webintro.model.Employee;
import mate.academy.webintro.model.Skill;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapperImpl implements EmployeeMapper {
    private final DepartmentMapper departmentMapper;

    public EmployeeMapperImpl(DepartmentMapper departmentMapper) {
        this.departmentMapper = departmentMapper;
    }

    @Override
    public EmployeeResponseDto toDto(Employee employee) {
        if (employee == null) {
            return null;
        }

        EmployeeResponseDto employeeResponseDto = new EmployeeResponseDto();
        employeeResponseDto.setId(employee.getId());
        employeeResponseDto.setName(employee.getName());
        employeeResponseDto.setEmail(employee.getEmail());
        if (employee.getDepartment() != null) {
            employeeResponseDto.setDepartmentId(employee.getDepartment().getId());
        }

        setSkillIds(employeeResponseDto, employee);
        return employeeResponseDto;
    }

    private void setSkillIds(EmployeeResponseDto employeeResponseDto, Employee employee) {
        List<Long> skillIds = employee.getSkills().stream()
                .map(Skill::getId)
                .toList();
        employeeResponseDto.setSkills(skillIds);
    }

    public EmployeeWithoutSkillsDto toemployeeWithoutSkillsDto(Employee employee) {
        if (employee == null) {
            return null;
        }

        EmployeeWithoutSkillsDto employeeDto = new EmployeeWithoutSkillsDto();
        employeeDto.setId(employee.getId());
        employeeDto.setName(employee.getName());
        employeeDto.setEmail(employee.getEmail());
        if (employee.getDepartment() != null) {
            employeeDto.setDepartmentId(employee.getDepartment().getId());
        }
        return employeeDto;
    }

    @Override
    public Employee toModel(EmployeeRequestDto requestDto) {
        if ( requestDto == null ) {
            return null;
        }

        Employee employee = new Employee();
        employee.setName(requestDto.getName());
        employee.setEmail(requestDto.getEmail());
        employee.setDepartment(departmentMapper.departmentById(requestDto.getDepartmentId()));

        setSkills(requestDto.getSkills(), employee);

        return employee;
    }
    private void setSkills(List<Long> skillIds, Employee employee) {
        List<Skill> skills = skillIds.stream()
                .map(Skill::new)
                .toList();
        employee.setSkills(skills);
    }
}

 */

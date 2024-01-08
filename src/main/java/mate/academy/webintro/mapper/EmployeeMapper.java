package mate.academy.webintro.mapper;

import java.util.List;
import mate.academy.webintro.config.MapperConfig;
import mate.academy.webintro.dto.EmployeeRequestDto;
import mate.academy.webintro.dto.EmployeeResponseDto;
import mate.academy.webintro.dto.EmployeeWithoutSkillsDto;
import mate.academy.webintro.model.Employee;
import mate.academy.webintro.model.Skill;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;

@Mapper(config = MapperConfig.class, uses = DepartmentMapper.class)
public interface EmployeeMapper {
   // source = "department.id беремо поле department в обєкта employee и сетомо його в детеошку
    // у відповідне поле target = "departmentId"
   // тут ми конвертуємо дані з DTO в ентеті
    @Mapping(source = "department.id", target = "departmentId")
    @Mapping(target = "skillIds", ignore = true)
    EmployeeResponseDto toDto(Employee employee);

    @AfterMapping
    default void setSkillIds(@MappingTarget EmployeeResponseDto employeeResponseDto, Employee employee) {
    List<Long> skillIds = employee.getSkills().stream()
          .map(Skill::getId)
          .toList();
    employeeResponseDto.setSkillIds(skillIds);
    }

    EmployeeWithoutSkillsDto toEmployeeWithoutSkillsDto(Employee employee);

    //target = "department" назва поля куди ми хочемо засетити
    //source = "departmentId" назва поля з якого хочемо витягувати значення
    // qualifiedByName = "departmentById" імя методу в нашому мапері
    // uses = DepartmentMapper.class звідки буде викликатись метод
 // а тут конвертуємо дані з з ентеті в DTO
    @Mapping(target = "department", source = "departmentId", qualifiedByName = "departmentById")
    @Mapping(target = "skills", ignore = true)
    Employee toModel(EmployeeRequestDto requestDto);

    @AfterMapping
    default void setSkills(@MappingTarget Employee employee, EmployeeRequestDto requestDto) {
     List<Skill> skills = requestDto.getSkills().stream()
          .map(Skill::new)
          .toList();
     employee.setSkills(skills);
    }
}

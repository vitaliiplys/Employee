package mate.academy.webintro.service;

import lombok.RequiredArgsConstructor;
import mate.academy.webintro.dto.EmployeeRequestDto;
import mate.academy.webintro.dto.EmployeeResponseDto;
import mate.academy.webintro.dto.EmployeeWithoutSkillsDto;
import mate.academy.webintro.mapper.EmployeeMapper;
import mate.academy.webintro.model.Employee;
import mate.academy.webintro.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;
    @Override
    public EmployeeResponseDto save(EmployeeRequestDto requestDto) {
        Employee employee = employeeMapper.toModel(requestDto);
        return employeeMapper.toDto(employeeRepository.save(employee));
    }

    @Override
    public List<EmployeeResponseDto> findAll() {
        return employeeRepository.findAll().stream()
                .map(employeeMapper::toDto)
                .toList();
    }
}

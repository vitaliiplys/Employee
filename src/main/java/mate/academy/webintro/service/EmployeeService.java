package mate.academy.webintro.service;

import mate.academy.webintro.dto.EmployeeRequestDto;
import mate.academy.webintro.dto.EmployeeResponseDto;
import java.util.List;

public interface EmployeeService {
    EmployeeResponseDto save(EmployeeRequestDto requestDto);

    List<EmployeeResponseDto> findAll();
}

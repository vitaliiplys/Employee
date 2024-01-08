package mate.academy.webintro.service;

import java.util.List;
import mate.academy.webintro.dto.DepartmentRequestDto;
import mate.academy.webintro.dto.DepartmentResponseDto;

public interface DepartmentService {
    List<DepartmentResponseDto> findAll();

    DepartmentResponseDto save(DepartmentRequestDto requestDto);
}

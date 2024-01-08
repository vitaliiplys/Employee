package mate.academy.webintro.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import mate.academy.webintro.dto.DepartmentRequestDto;
import mate.academy.webintro.dto.DepartmentResponseDto;
import mate.academy.webintro.mapper.DepartmentMapper;
import mate.academy.webintro.model.Department;
import mate.academy.webintro.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;
    private final DepartmentMapper departmentMapper;

    @Override
    public DepartmentResponseDto save(DepartmentRequestDto requestDto) {
        Department department = departmentMapper.toModel(requestDto);
        return departmentMapper.toDto(departmentRepository.save(department));
    }
    @Override
    public List<DepartmentResponseDto> findAll() {
        return departmentRepository.findAll().stream()
                .map(departmentMapper::toDto)
                .toList();
    }
}

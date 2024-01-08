package mate.academy.webintro.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import mate.academy.webintro.dto.DepartmentRequestDto;
import mate.academy.webintro.dto.DepartmentResponseDto;
import mate.academy.webintro.service.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {
    private final DepartmentService departmentService;

    @GetMapping
    public List<DepartmentResponseDto> findAll() {
        return departmentService.findAll();
    }

    @PostMapping
    public DepartmentResponseDto save(@RequestBody DepartmentRequestDto requestDto) {
        return departmentService.save(requestDto);
    }
}

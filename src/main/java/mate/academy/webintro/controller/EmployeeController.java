package mate.academy.webintro.controller;

import lombok.RequiredArgsConstructor;
import mate.academy.webintro.dto.EmployeeRequestDto;
import mate.academy.webintro.dto.EmployeeResponseDto;
import mate.academy.webintro.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping
    public List<EmployeeResponseDto> findAll() {
        return employeeService.findAll();
    }

    @PostMapping
    public EmployeeResponseDto save(@RequestBody EmployeeRequestDto requestDto) {
        return employeeService.save(requestDto);
    }
}

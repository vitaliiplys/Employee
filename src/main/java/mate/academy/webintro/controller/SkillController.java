package mate.academy.webintro.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import mate.academy.webintro.dto.SkillDtoRequest;
import mate.academy.webintro.dto.SkillDtoResponse;
import mate.academy.webintro.service.SkillService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "skills")
public class SkillController {
    private final SkillService skillService;

    @GetMapping
    public List<SkillDtoResponse> findAll() {
        return skillService.findAll();
    }

    @PostMapping
    public SkillDtoResponse save(@RequestBody SkillDtoRequest skillDtoRequest) {
        return skillService.save(skillDtoRequest);
    }
}

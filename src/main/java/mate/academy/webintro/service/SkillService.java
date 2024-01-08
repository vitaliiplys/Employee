package mate.academy.webintro.service;

import java.util.List;
import mate.academy.webintro.dto.SkillDtoRequest;
import mate.academy.webintro.dto.SkillDtoResponse;

public interface SkillService {
    List<SkillDtoResponse> findAll();

    SkillDtoResponse save(SkillDtoRequest skillDtoRequest);
}

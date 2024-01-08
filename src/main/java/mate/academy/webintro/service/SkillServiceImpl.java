package mate.academy.webintro.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import mate.academy.webintro.dto.SkillDtoRequest;
import mate.academy.webintro.dto.SkillDtoResponse;
import mate.academy.webintro.mapper.SkillMapper;
import mate.academy.webintro.model.Skill;
import mate.academy.webintro.repository.SkillRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SkillServiceImpl implements SkillService {
    private final SkillMapper skillMapper;
    private final SkillRepository skillRepository;

    @Override
    public List<SkillDtoResponse> findAll() {
        return skillRepository.findAll().stream()
                .map(skillMapper::toDto)
                .toList();
    }

    @Override
    public SkillDtoResponse save(SkillDtoRequest skillDtoRequest) {
        Skill skill = skillMapper.toModel(skillDtoRequest);
        return skillMapper.toDto(skillRepository.save(skill));
    }
}

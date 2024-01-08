package mate.academy.webintro.mapper;

import mate.academy.webintro.config.MapperConfig;
import mate.academy.webintro.dto.SkillDtoRequest;
import mate.academy.webintro.dto.SkillDtoResponse;
import mate.academy.webintro.model.Skill;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface SkillMapper {
    SkillDtoResponse toDto(Skill skill);

    Skill toModel(SkillDtoRequest skillDtoRequest);
}

package com.fse.skill.service;

import com.fse.skill.model.Skill;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface SkillService {
    public List<Skill> getAllSkills();

    public List<Skill> getSkillsByUserId(Long id);

    public Optional<Skill> getSkillById(Long id);
    public Skill saveSkill(Skill skill);
    public void deleteSkill(Long id);
}

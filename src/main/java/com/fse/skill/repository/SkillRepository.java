package com.fse.skill.repository;

import com.fse.skill.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SkillRepository extends JpaRepository<Skill,Long> {
    public List<Skill> getUserSkillsByUserId(Long id);
}

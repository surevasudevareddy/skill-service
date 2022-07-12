package com.fse.skill.controller;

import com.fse.skill.model.Skill;
import com.fse.skill.service.SkillServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/skillService")
public class SkillController {
    @Autowired
    @Qualifier("skillServiceImpl")
    SkillServiceImpl skillService;

    @GetMapping(value = "/skill/{id}")
    public Optional<Skill> getSkillById(@PathVariable Long id){
        return skillService.getSkillById(id);
    }
    @GetMapping(value = "/skillsByUserId/{userId}")
    public List<Skill> getSkillByUserId(@PathVariable Long userId){
        return skillService.getSkillsByUserId(userId);
    }
    @GetMapping(value = "/skills")
    public List<Skill> getAllSkills(){
        return skillService.getAllSkills();
    }
    @PostMapping(value = "/saveSkill")
    public void saveSkill(@RequestBody Skill userSkill){
        skillService.saveSkill(userSkill);
    }
    @DeleteMapping(value = "/delete/{id}")
    public void deleteSkill(@PathVariable Long id){
        skillService.deleteSkill(id);
    }

}

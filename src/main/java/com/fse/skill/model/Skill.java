package com.fse.skill.model;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "skill", schema = "skilltracker")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "skill_name",nullable = false)
    private String skillName;
    @Column(name = "skill_type",nullable = false)
    private String skillType;
    @Column(name = "expertise_level",nullable = false)
    private int expertiseLevel;
    @Column(name = "user_id",nullable = false)
    private Long userId;
}

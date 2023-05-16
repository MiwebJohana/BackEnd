package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.interfaz.ISkillsService;
import com.portfolio.SpringBoot.models.Skills;
import com.portfolio.SpringBoot.repository.SkillsRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SkillsService implements ISkillsService {

    @Autowired
    private SkillsRepo skillsRepo;

    @Override
    public List<Skills> getSkills() {
        List<Skills> listaskills = skillsRepo.findAll();
        return listaskills;
    }

    @Override
    public void saveSkills(Skills skills) {
        skillsRepo.save(skills);
    }

    @Override
    public void deleteSkills(int id) {
        skillsRepo.deleteById(id);
    }

    @Override
    public Skills findSkills(int id) {
        Skills skills = skillsRepo.findById(id).orElse(null);
        return skills;
    }
}

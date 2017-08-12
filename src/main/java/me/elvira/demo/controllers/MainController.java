package me.elvira.demo.controllers;

import me.elvira.demo.Educations;
import me.elvira.demo.Experiences;
import me.elvira.demo.Skills;
import me.elvira.demo.User;
import me.elvira.demo.repositories.EduRepository;
import me.elvira.demo.repositories.ExpRepository;
import me.elvira.demo.repositories.SkillsRepository;
import me.elvira.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @Autowired
    UserRepository userRepository;
    @Autowired
    EduRepository eduRepository;
    @Autowired
    ExpRepository expRepository;
    @Autowired
    SkillsRepository skillsRepository;

    @GetMapping("/")
    public String index()
    {
        return "index";
    }
    @GetMapping("/home")
    public String home()
    {
        return "index";
    }
    @GetMapping("/getstarted")
    public String getStarted()
    {
        return "index";
    }
    @GetMapping("/adduser")
    public String addUser(Model model)
    {
        model.addAttribute("adduser", new User());
        return "adduser";
    }
    @GetMapping("/addeducation")

    public String addEducation(Model model)
    {
        model.addAttribute("addeducation", new Educations());
        return "addeducation";
    }
    @GetMapping("/addexperience")
    public String addExperience(Model model)
    {
        model.addAttribute("addexperience", new Experiences());
        return "addexperience";
    }
    @GetMapping("/addskill")
    public String addSkill(Model model)
    {
        model.addAttribute("addskill", new Skills());
        return "addskill";
    }
    @PostMapping("/adduser")
    public String userSubmit(@ModelAttribute("adduser") User user, BindingResult bindingResult) {
        if(bindingResult.hasErrors())
        {
            return "adduser";
        }
        //userRepository.save(user);
        return "addeducation";
    }
    @PostMapping("/addeducation")
    public String educationSubmit(@ModelAttribute("addeducation") Educations education, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "addeducation";
        }
        eduRepository.save(education);
        return "showeducation";
    }
    @PostMapping("/addexperience")
    public String experienceSubmit(@ModelAttribute("addexperience") Experiences experience, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "addexperience";
        }
        expRepository.save(experience);
        return "showexperience";
    }
    @PostMapping("/addskill")
    public String skillSubmit(@ModelAttribute("addskill") Skills skill, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "addskill";
        }
        skillsRepository.save(skill);
        return "showskill";
    }
    public void showAllEducations(Model model)
    {
        Iterable <Educations> educationsList = eduRepository.findAll();
        model.addAttribute("educationsList", educationsList);
    }
    public void showAllExperiences(Model model)
    {
        Iterable <Experiences> experiencesList = expRepository.findAll();
        model.addAttribute("experiencesList", experiencesList);
    }
    public void showAllSkills(Model model)
    {
        Iterable <Skills> skillsList = skillsRepository.findAll();
        model.addAttribute("skillsList", skillsList);
    }
}
package pl.coderslab.spring01hibernatekrkw04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.spring01hibernatekrkw04.model.Student;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @RequestMapping("/student/form")
    public String form(Model model){
        model.addAttribute(new Student());
        return "student/formBind";
    }

    @ModelAttribute("allCountry")
    public List<String> checkOptions() {
        List<String> strings = new ArrayList<>();
        strings.add("PL");
        strings.add("UK");
        strings.add("UA");
        strings.add("CK");
        return strings;
    }
    @ModelAttribute("mailList")
    public List<String> mailList() {
        List<String> strings = new ArrayList<>();
        strings.add("@PL");
        strings.add("@UK");
        strings.add("@UA");
        strings.add("@CK");
        return strings;
    }
}

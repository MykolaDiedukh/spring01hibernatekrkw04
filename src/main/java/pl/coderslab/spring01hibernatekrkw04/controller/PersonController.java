package pl.coderslab.spring01hibernatekrkw04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.spring01hibernatekrkw04.dao.PersonDao;
import pl.coderslab.spring01hibernatekrkw04.entity.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class PersonController {
    private final PersonDao personDao;

    public PersonController(PersonDao personDao) {
        this.personDao = personDao;
    }

    //    - zapis encji
    @RequestMapping("/person/add")
    @ResponseBody
    public String hello() {
        Person person = new Person();
        person.setLogin("Test");
        person.setEmail("test");
        person.setPassword("tes");
        personDao.savePerson(person);
        return "Id dodanej książki to:"
                + person.getId();
    }

    //    - edycja encji
    @RequestMapping("/person/update/{id}/{mail}")
    @ResponseBody
    public String updatePublisher(@PathVariable long id, @PathVariable String mail) {
        Person person = personDao.findById(id);
        person.setEmail(mail);
        personDao.update(person);
        return person.toString();
    }

    //- pobieranie
    @RequestMapping("/person/get/{id}")
    @ResponseBody
    public String getPerson(@PathVariable long id) {
        Person person = personDao.findById(id);
        return person.toString();
    }

    //- usuwanie
    @RequestMapping("/person/delete/{id}")
    @ResponseBody
    public String deletePerson(@PathVariable long id) {
        Person person = personDao.findById(id);
        personDao.delete(person);
        return "deleted";
    }

    @RequestMapping("/form")
    public String form (){
        return "person/form";
    }

    @PostMapping("/form")
    @ResponseBody
    public Person formPost (@RequestParam String login,
                          @RequestParam String email,
                          @RequestParam String password){
        Person person= new Person().setLogin(login).setEmail(email).setPassword(password);
        personDao.savePerson(person);
        return person;
    }

    @RequestMapping("/formBind")
    public String formBind (Model model){

        model.addAttribute(new Person().setLogin("example"));
//        model.addAttribute("contrys", strings);
        return "person/formBind";
    }



    @PostMapping("/formBind")
    @ResponseBody
    public Person formBindPost (@ModelAttribute Person person){
        personDao.savePerson(person);
        return person;
    }
}

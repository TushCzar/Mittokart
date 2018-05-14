package com.mittokart.controllers;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mittokart.entities.Todo;
import com.mittokart.util.EMFService;

@Controller  
public class HelloWorldController {  
    @RequestMapping("/hello")  
    public ModelAndView helloWorld() {  
        String message = "HELLO SPRING MVC HOW R U";  
        EntityManager em = EMFService.get().createEntityManager();
        Todo todo = new Todo("userId", "summary", "description", "url");
        em.persist(todo);
        em.close();
        return new ModelAndView("hellopage", "message", message);
    }  
}  
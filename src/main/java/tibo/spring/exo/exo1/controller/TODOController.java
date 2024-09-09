package tibo.spring.exo.exo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import tibo.spring.exo.exo1.service.TODOService;

@Controller
public class TODOController {
    private final TODOService todoService;

    @Autowired
    public TODOController(TODOService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("TODOs", todoService.getAllTODOs());
        return "home";
    }

    @RequestMapping("/{name}")
    public String todo(Model model, @PathVariable String name) {
        model.addAttribute("todo", todoService.getOneTODO(name));
        return "detail";
    }
}

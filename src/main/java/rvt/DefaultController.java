package rvt;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
    
   @GetMapping(value = "/")
    String index(@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
        return "index";
    }
    @GetMapping(value = "/students")
    public ModelAndView students(){
        ModelAndView modelisUnSkats = new ModelAndView("students");
        String name = "Peter";
        return modelisUnSkats;
        
    }
    @GetMapping(value = "/about")
    public ModelAndView about(){
        ModelAndView modelisUnSkats = new ModelAndView("about");
        String name = "Peter";
        return modelisUnSkats;
        
    }
    @GetMapping(value = "/test")
    ModelAndView testAction(){
        Money wallet1 = new Money(10,10);
        Money wallet2 = new Money(20,16);
        ModelAndView modelAndView = new ModelAndView();
        HashMap<String, String> map = new HashMap<>();
        map.put("brand", "Ford");
        map.put("model", "Mustang");
        map.put("year", "1950");
        map.get("brand");
        modelAndView.addObject("wallet1", wallet1);
        modelAndView.addObject("wallet2", wallet2);
        modelAndView.addObject("brand", "Ford");
        return modelAndView;
    }
}

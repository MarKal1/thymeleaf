package pl.bykowski.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {


    @GetMapping("/car")
    public String getCar (Model model) {
       Car car1 = new Car ("Volvo", "i8");
       model.addAttribute("car", car1);
        return "index";
    }
}

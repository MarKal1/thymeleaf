package pl.bykowski.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {


    @GetMapping("/car")
    public String getCar (Model model) {

       Car car1 = new Car ("Ford", "Focus");
       Car car2 = new Car ("Toyota", "Avensis");
       Car car3 = new Car ("Suzuki", "Swift");
       Car car4 = new Car ("Dacia", "Duster");
       List<Car> cars = Arrays.asList(car1,car2,car3,car4);
       model.addAttribute("cars", cars);
        return "index";
    }
}

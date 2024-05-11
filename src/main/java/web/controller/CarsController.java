package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.servise.CarsServise;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @Autowired
    private CarsServise carsServise;

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam (value = "count", required = false) Integer count, Model model) {

        model.addAttribute("count", count);

        if (count == null) {
            model.addAttribute("count", carsServise.getCars());
            return "cars";
        } else if (count > 0 && count < 5) {
            List<Car> extractedCars = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                extractedCars.add(carsServise.getCars().get(i));
            }
            model.addAttribute("count", extractedCars);
            return "cars";
        } else {
            model.addAttribute("count", carsServise.getCars());
            return "cars";
        }
    }
}

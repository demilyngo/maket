package com.example.maket;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


@Controller
public class greetingController {

    @GetMapping("/")
    public String greeting(Model model) {
        ArrayList<stationController> station = new ArrayList<>();
        station.add(new stationController(State.SORTING, Control.FIELD, 3, "Сургутская"));
        model.addAttribute("station", station);

        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Москва", "Казань", "Нижневартовск", "Воркута"));
        model.addAttribute("cities", cities);

        ArrayList<wagonModel> counter = new ArrayList<>();
        for(int i=1; i!=15; i++) {
            counter.add(new wagonModel(i, cities.get((int) (Math.random() * 4))));
        }
        model.addAttribute("counter", counter);

        return "index";
    }
}

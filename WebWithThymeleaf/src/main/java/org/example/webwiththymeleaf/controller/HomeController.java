package org.example.webwiththymeleaf.controller;

import org.example.webwiththymeleaf.models.Product;
import org.example.webwiththymeleaf.models.Teachers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String index(Model model){

        Product product = new Product("Service 1", "math.jpg","Math", 129);
        Product product2 = new Product("Service 2", "biology.jpg","Bio", 234);
        Product product3 = new Product("Service 3","historyimage.jpg", "History", 231);

        ArrayList<Product> productArrayList = new ArrayList<>();
        productArrayList.add(product);
        productArrayList.add(product2);
        productArrayList.add(product3);
        model.addAttribute("producstArray", productArrayList);

















        return "home";
    }

    @GetMapping("/about")
    public String Test2() {
        return "about";
    }
    @GetMapping("/news")
    public String Test3() {
        return "news";
    }

    @GetMapping("/contact")
    public String Test4() {
        return "contact";
    }

    @GetMapping("/teachers")
    public String Test5(Model model) {
        Teachers teacher = new Teachers("Adam Azmaa", "bioteacher.jpg", "Bachelor",234);
        Teachers teacher2 = new Teachers("Alfonso Hitinhayur", "ht.jpg","Master", 231);
        Teachers teacher3 = new Teachers("Jake Mallman","mt.jpg", "PhD", 890);


        ArrayList<Teachers> teachersArrayList = new ArrayList<>();
        teachersArrayList.add(teacher);
        teachersArrayList.add(teacher2);
        teachersArrayList.add(teacher3);
        model.addAttribute("teachersArray", teachersArrayList);

        return "teachers";
    }

    @GetMapping("/resources")
    public String Test6() {
        return "resources";
    }

    @GetMapping("/events")
    public String Test7() {
        return "events";
    }
}

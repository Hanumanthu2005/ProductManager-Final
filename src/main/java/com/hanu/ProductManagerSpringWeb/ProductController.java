package com.hanu.ProductManagerSpringWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    @Autowired
    ProductService service;
    @RequestMapping("/")
    public String home()
    {
        return "home";
    }


    @GetMapping("/add")
    public String showForm(Model model)
    {
        model.addAttribute("product", new Product());
        return "add";
    }

    @PostMapping("/add")
    public String addProduct(@ModelAttribute Product product)
    {
        service.addProduct(product);
        return "redirect:/";
    }

    @GetMapping("/getAll")
    public String showAll(Model model)
    {
        model.addAttribute("products", service.getAll());
        return "getAll";
    }

    @GetMapping("/filter")
    public String filter(@RequestParam("filterType") String filter, @RequestParam(value = "searchValue", required = false) String value, Model model)
    {
        model.addAttribute("products", service.getProductsByFilter(filter, value));
        model.addAttribute("filter", filter);
        return "filteredProducts";

    }


}

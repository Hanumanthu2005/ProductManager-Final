package com.hanu.ProductManagerSpringWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductService {

    @Autowired
    ProductDao dao;

    public void addProduct(Product product)
    {
        dao.save(product);
    }

    public List<Product> getAll()
    {
        return dao.findAll();
    }

    public Object getProductsByFilter(String filter, String value) {

        List<Product> result = new ArrayList<>();
        switch (filter)
        {
            case "name":
                result = dao.findByNameContainingIgnoreCase(value);
                break;
            case "place":
                result = dao.findByPlaceContainingIgnoreCase(value);
                break;
            case "word":
                result = dao.findByNameContainingIgnoreCaseOrTypeContainingIgnoreCaseOrPlaceContainingIgnoreCase(value, value, value);
                break;
            case "warranty":
                result = dao.findByWarrantyLessThan(Integer.parseInt(value));
                break;
        }

        return result;

    }

}

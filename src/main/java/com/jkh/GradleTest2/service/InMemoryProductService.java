package com.jkh.GradleTest2.service;

import com.jkh.GradleTest2.model.product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InMemoryProductService {
    public List<product> getProductList() {
        product p1 = new product("gray", "t-shirt", 5000);
        product p2 = new product("white", "Air-pod", 230000);
        product p3 = new product("black", "coupleT", 30000);
        product p4 = new product("green", "sandle", 20000);
        product p5 = new product("blue", "veloster", 20000000);

        ArrayList<product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);

        return products;
    }
}

package com.ssg.boot.pharmafinderboot.controller;

import com.ssg.boot.pharmafinderboot.dto.Pagination;
import com.ssg.boot.pharmafinderboot.dto.PaginationParam;
import com.ssg.boot.pharmafinderboot.dto.ProductDto;
import com.ssg.boot.pharmafinderboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/getproducts")
    public ResponseEntity<Map<String, Object>> getProducts(PaginationParam paginationParam) {
        List<ProductDto> products = productService.getProducts(paginationParam);
        int count = productService.countProducts(paginationParam);
        Pagination pagination = new Pagination(count, paginationParam);
        return ResponseEntity.ok(Map.of("products", products, "pagination", pagination));
    }

}

package com.ssg.boot.pharmafinderboot.service;

import com.ssg.boot.pharmafinderboot.dto.PaginationParam;
import com.ssg.boot.pharmafinderboot.dto.ProductDto;
import com.ssg.boot.pharmafinderboot.dto.ProductQty;
import com.ssg.boot.pharmafinderboot.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductMapper productMapper;

    public List<ProductDto> getProducts(PaginationParam paginationParam) {
        return productMapper.getProducts(paginationParam);
    }

    public int countProducts(PaginationParam paginationParam) {
        return productMapper.cntProducts(paginationParam);
    }

    public ProductDto getProductById(Integer productId) {
        return productMapper.getProductById(productId);
    }

    public List<ProductQty> getProductQty(Integer productId) {
        return productMapper.getProductQty(productId);
    }
}

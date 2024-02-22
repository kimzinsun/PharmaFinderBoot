package com.ssg.boot.pharmafinderboot.service;

import com.ssg.boot.pharmafinderboot.dto.PaginationParam;
import com.ssg.boot.pharmafinderboot.dto.ProductDto;
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

}

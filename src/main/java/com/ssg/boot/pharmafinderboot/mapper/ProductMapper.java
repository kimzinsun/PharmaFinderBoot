package com.ssg.boot.pharmafinderboot.mapper;

import com.ssg.boot.pharmafinderboot.dto.PaginationParam;
import com.ssg.boot.pharmafinderboot.dto.ProductDto;
import com.ssg.boot.pharmafinderboot.dto.ProductQty;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProductMapper {
    int cntProducts(PaginationParam paginationParam);
    List<ProductDto> getProducts(PaginationParam paginationParam);

    ProductDto getProductById(Integer productId);
    List<ProductQty> getProductQty(Integer productId);

}

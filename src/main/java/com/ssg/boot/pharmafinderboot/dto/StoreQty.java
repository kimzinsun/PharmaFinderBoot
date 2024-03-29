package com.ssg.boot.pharmafinderboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class StoreQty extends ProductDto {
    private Integer quantity;
    private Integer price;

}

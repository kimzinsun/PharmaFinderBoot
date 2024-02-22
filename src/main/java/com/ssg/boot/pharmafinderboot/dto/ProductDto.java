package com.ssg.boot.pharmafinderboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class ProductDto {
    private Integer id;
    private String entpName;
    private String itemName;
    private String efcyQes;
    private String useMethodQes;
    private String atpnWarnQes;
    private String atpnQes;
    private String intrcQes;
    private String seQes;
    private String depositMethodQes;
    private String itemImage;
}

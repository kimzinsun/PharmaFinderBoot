package com.ssg.boot.pharmafinderboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class StoreParam extends PaginationParam {
    private String dutyAddr1;
    private String dutyAddr2;
    private String dutyName;
    private String id;

    public StoreParam() {
        this.dutyAddr1 = "부산";
        this.dutyAddr2 = "해운대구";
    }
}

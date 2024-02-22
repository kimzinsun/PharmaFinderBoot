package com.ssg.boot.pharmafinderboot.controller;

import com.ssg.boot.pharmafinderboot.dto.Pagination;
import com.ssg.boot.pharmafinderboot.dto.StoreDto;
import com.ssg.boot.pharmafinderboot.dto.StoreParam;
import com.ssg.boot.pharmafinderboot.dto.StoreQty;
import com.ssg.boot.pharmafinderboot.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class StoreController {
    @Autowired
    StoreService storeService;

    @GetMapping("/pharmacies")
    public ResponseEntity<Map<String, Object>> getPharmacies(StoreParam storeParam) {
        int count = storeService.countPharmacies(storeParam);
        List<StoreDto> pharmacies = storeService.getPharmacies(storeParam);
        Pagination pagination = new Pagination(count, storeParam);

        return ResponseEntity.ok(Map.of("pagination", pagination, "pharmacies", pharmacies));
    }

    @GetMapping("/pharmacy")
    public ResponseEntity<Map<String, Object>> getPharmacy(int storeId) {
        List<StoreQty> storeQty = storeService.getStoreQty(storeId);
        StoreDto pharmacy = storeService.getPharmacy(storeId);

        return ResponseEntity.ok(Map.of("pharmacy", pharmacy, "storeQty", storeQty));

    }

}

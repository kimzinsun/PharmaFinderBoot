package com.ssg.boot.pharmafinderboot.service;

import com.ssg.boot.pharmafinderboot.dto.StoreDto;
import com.ssg.boot.pharmafinderboot.dto.StoreParam;
import com.ssg.boot.pharmafinderboot.dto.StoreQty;
import com.ssg.boot.pharmafinderboot.mapper.StoreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

    @Autowired
    StoreMapper storeMapper;

    public List<StoreDto> getPharmacies(StoreParam storeParam) {
        return storeMapper.getPharmacies(storeParam);
    }

    public int countPharmacies(StoreParam storeParam) {
        return storeMapper.countPharmacies(storeParam);
    }

    public StoreDto getPharmacy(Integer storeId) {
        return storeMapper.getPharmacy(storeId);
    }

    public List<StoreQty> getStoreQty(Integer storeId) {
        return storeMapper.getStoreQty(storeId);
    }
}

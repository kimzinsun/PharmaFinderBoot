package com.ssg.boot.pharmafinderboot.mapper;

import com.ssg.boot.pharmafinderboot.dto.StoreDto;
import com.ssg.boot.pharmafinderboot.dto.StoreParam;
import com.ssg.boot.pharmafinderboot.dto.StoreQty;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface StoreMapper {
    List<StoreDto> getPharmacies(StoreParam storeParam);
    int countPharmacies(StoreParam storeParam);
    StoreDto getPharmacy(Integer id);
    List<StoreQty> getStoreQty(Integer id);

}

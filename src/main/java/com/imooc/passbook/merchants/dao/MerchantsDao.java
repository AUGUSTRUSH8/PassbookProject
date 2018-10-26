package com.imooc.passbook.merchants.dao;

import com.imooc.passbook.merchants.entity.Merchants;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantsDao extends JpaRepository<Merchants,Integer>{
    Merchants findById(Integer integer);

    Merchants findByName(String name);
}

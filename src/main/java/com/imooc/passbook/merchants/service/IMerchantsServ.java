package com.imooc.passbook.merchants.service;

import com.imooc.passbook.merchants.vo.CreateMerchantsRequest;
import com.imooc.passbook.merchants.vo.PassTemplate;
import com.imooc.passbook.merchants.vo.Response;

public interface IMerchantsServ {
    Response createMerchants(CreateMerchantsRequest request);
    Response buildMerchantsInfoById(Integer id);
    Response dropPassTemplate(PassTemplate passTemplate);
}

package com.imooc.passbook.merchants.service;

import com.alibaba.fastjson.JSON;
import com.imooc.passbook.merchants.vo.CreateMerchantsRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class MerchantsServTest {
    @Autowired
    private IMerchantsServ merchantsServ;
    @Test
    @Transactional
    public void testCreateMerchantServ(){
        CreateMerchantsRequest request=new CreateMerchantsRequest();
        request.setName("rush");
        request.setLogoUrl("www.cqu.com");
        request.setBusinessLicenseUrl("www.hello.com");
        request.setAddress("重庆");
        request.setPhone("1255523521");
        System.out.println(JSON.toJSONString(merchantsServ.createMerchants(request)));
    }
}

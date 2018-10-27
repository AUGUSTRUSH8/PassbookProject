package com.imooc.passbook.merchants.service;

import com.alibaba.fastjson.JSON;
import com.imooc.passbook.merchants.vo.CreateMerchantsRequest;
import com.imooc.passbook.merchants.vo.PassTemplate;
import org.apache.commons.lang.time.DateUtils;
import org.assertj.core.util.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class MerchantsServTest {
    @Autowired
    private IMerchantsServ merchantsServ;
    @Test
    //@Transactional
    public void testCreateMerchantServ(){
        CreateMerchantsRequest request=new CreateMerchantsRequest();
        request.setName("rush");
        request.setLogoUrl("www.cqu.com");
        request.setBusinessLicenseUrl("www.hello.com");
        request.setAddress("重庆");
        request.setPhone("1255523521");
        System.out.println(JSON.toJSONString(merchantsServ.createMerchants(request)));
    }

    @Test
    public void  testBuildMerchantsInfoById(){
        System.out.println(JSON.toJSONString(merchantsServ.buildMerchantsInfoById(17)));
    }

    @Test
    public void testDropPasstemplate(){
        PassTemplate passTemplate=new PassTemplate();
        passTemplate.setId(17);
        passTemplate.setTitle("title:重庆大学");
        passTemplate.setSummary("简介：重庆大学");
        passTemplate.setDesc("详情：重庆大学");
        passTemplate.setLimit(10000L);
        passTemplate.setHasToken(false);
        passTemplate.setBackground(2);
        passTemplate.setStart(new Date());
        passTemplate.setEnd(DateUtils.addDays(new Date(),10));
        System.out.println(JSON.toJSONString(merchantsServ.dropPassTemplate(passTemplate)));
    }
}

package com.imooc.passbook.merchants.vo;

import com.imooc.passbook.merchants.constant.ErrorCode;
import com.imooc.passbook.merchants.dao.MerchantsDao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassTemplate {
    //商户ID
    private Integer id;

    private String title;
    private String summary;
    private String desc;
    private String limit;
    private Boolean hasToken;//存储于redis set中
    private Integer background;
    private Date start;
    private Date end;
    public ErrorCode validate(MerchantsDao merchantsDao){
        if(null==merchantsDao.findById(id)){
            return ErrorCode.MERCHANTS_NOT_EXIST;
        }
        return ErrorCode.SUCCESS;
    }

}

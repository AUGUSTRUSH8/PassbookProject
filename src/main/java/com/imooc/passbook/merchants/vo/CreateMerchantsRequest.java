package com.imooc.passbook.merchants.vo;

import com.imooc.passbook.merchants.constant.ErrorCode;
import com.imooc.passbook.merchants.dao.MerchantsDao;
import com.imooc.passbook.merchants.entity.Merchants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateMerchantsRequest {
    private String name;
    private String logoUrl;
    private String businessLicenseUrl;
    private String phone;
    private String address;
    public ErrorCode validate(MerchantsDao merchantsDao){
        if(merchantsDao.findByName(this.name)!=null){
            return ErrorCode.DUPLICATE_NAME;
        }
        if(null==this.logoUrl){
            return ErrorCode.EMPTY_LOGO;
        }
        if(null==this.businessLicenseUrl){
            return ErrorCode.EMPTY_BUSINESS_LICENSE;
        }
        if(null==this.address){
            return ErrorCode.EMPTY_ADDRESS;
        }
        if(null==this.phone){
            return ErrorCode.ERROR_PHONE;
        }
        return ErrorCode.SUCCESS;
    }
    public Merchants toMerchants() {

        Merchants merchants = new Merchants();

        merchants.setName(name);
        merchants.setLogoUrl(logoUrl);
        merchants.setBusinessLicenseUrl(businessLicenseUrl);
        merchants.setPhone(phone);
        merchants.setAddress(address);

        return merchants;
    }
}

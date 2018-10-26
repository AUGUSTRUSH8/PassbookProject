package com.imooc.passbook.merchants.constant;

public enum TemplateColor {
    RED(1,"红色"),GREEN(2,"绿色"),BLUE(3,"蓝色");
    private int code;
    private String color;
    TemplateColor(Integer code,String color){
        this.code=code;
        this.color=color;
    }
    public Integer getCode(){
        return this.code;
    }
    public String getColor(){
        return this.color;
    }
}

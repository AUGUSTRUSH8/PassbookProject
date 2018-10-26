CREATE TABLE 'merchants'(
  'id' int(10) not null AUTO_INCREMENT,
  'name' varchar(64) COLLATE utf8_bin not null COMMENT '商户名称',
  'logo_url' VARCHAR(256) COLLATE utf8_bin not null COMMENT '商户logo',
  'business_license_url' VARCHAR (256) COLLATE utf8_bin not null COMMENT '商户营业执照',
  'phone' VARCHAR (64) COLLATE utf8_bin not null COMMENT '商户联系电话',
  'address' VARCHAR (64) COLLATE utf8_bin not null COMMENT '商户联系地址',
  'is_audit' BOOLEAN not null comment '是否通过审核',
  PRIMARY KEY ('id'),
)ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARACTER=utf8;
# bootdemo
springbootdemo

数据库脚本
-- Create table
create table XX_USER
(
  id   NUMBER,
  name NVARCHAR2(20),
  age  NUMBER
)
tablespace GLG_HIMP
  pctfree 10
  initrans 1
  maxtrans 255;
-- Add comments to the table 
comment on table XX_USER
  is '测试用';

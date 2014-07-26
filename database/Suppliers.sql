prompt Importing table Suppliers...
set feedback off
set define off
insert into Suppliers (SupplierID, AdministratorID, UserName, Address, Phone, Type, LoginTime, PostalCode, Remark, groupactivity)
values ('1', '1', '味道江湖', '友谊西路1', '884034', '半小时快递', to_date('24-07-2014', 'dd-mm-yyyy'), '710070', '免运费', '0');

insert into Suppliers (SupplierID, AdministratorID, UserName, Address, Phone, Type, LoginTime, PostalCode, Remark, groupactivity)
values ('2', '2', '风味小吃', '劳动南路2', '886728', '速达快递', to_date('25-07-2014', 'dd-mm-yyyy'), '710072', '免运费', '0');

insert into Suppliers (SupplierID, AdministratorID, UserName, Address, Phone, Type, LoginTime, PostalCode, Remark, groupactivity)
values ('3', '3', '天府美味', '太白路3', '886287', '半小时快递', to_date('25-07-2014', 'dd-mm-yyyy'), '710073', '免运费', '0');

prompt Done.

prompt Importing table Customers...
set feedback off
set define off
insert into Customers (CustomerID, CustomerName, RealName, Password, Sex, Question, Answer, Email, Address, PostalCode, Phone, Fax, RegisterDate, Integral)
values ('1', '张三', '张三', '123', '男', '你是？', '张三', '12341234@qq.com', '北京市五环', '100000', '138xxxxxxxx', '222222', to_date('13-06-2013', 'dd-mm-yyyy'), 0);

insert into Customers (CustomerID, CustomerName, RealName, Password, Sex, Question, Answer, Email, Address, PostalCode, Phone, Fax, RegisterDate, Integral)
values ('2', '李四', '李四', '123', '男', '你是？', '李四', '23452345@qq.com', '上海市镇府', '200000', '138xxxxxxxx', '222222', to_date('09-06-2013', 'dd-mm-yyyy'), 0);

prompt Done.

prompt Importing table Customers...
set feedback off
set define off
insert into Customers (CustomerID, CustomerName, RealName, Password, Sex, Question, Answer, Email, Address, PostalCode, Phone, Fax, RegisterDate, Integral)
values ('1', '����', '����', '123', '��', '���ǣ�', '����', '12341234@qq.com', '�������廷', '100000', '138xxxxxxxx', '222222', to_date('13-06-2013', 'dd-mm-yyyy'), 0);

insert into Customers (CustomerID, CustomerName, RealName, Password, Sex, Question, Answer, Email, Address, PostalCode, Phone, Fax, RegisterDate, Integral)
values ('2', '����', '����', '123', '��', '���ǣ�', '����', '23452345@qq.com', '�Ϻ�����', '200000', '138xxxxxxxx', '222222', to_date('09-06-2013', 'dd-mm-yyyy'), 0);

prompt Done.

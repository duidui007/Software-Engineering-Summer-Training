prompt Importing table Orders...
set feedback off
set define off
insert into Orders (OrderID, CustomerID, OrderDate, PayMethod, Postage, TotalMoney, DeliveryDate, DeliveryMethod, ConsigneeName, ConsigneeAddress, ConsigneePostalCode, Status)
values ('1', '1', to_date('10-07-2014', 'dd-mm-yyyy'), '���֧��', 5, 105, to_date('26-07-2014', 'dd-mm-yyyy'), '���', '�Ŵ�', '�������廷', '100000', '1');

insert into Orders (OrderID, CustomerID, OrderDate, PayMethod, Postage, TotalMoney, DeliveryDate, DeliveryMethod, ConsigneeName, ConsigneeAddress, ConsigneePostalCode, Status)
values ('2', '2', to_date('22-07-2013', 'dd-mm-yyyy'), '���֧��', 5, 105, to_date('26-07-2014', 'dd-mm-yyyy'), '���', '�Ŷ�', '�������Ļ�', '100000', '1');

insert into Orders (OrderID, CustomerID, OrderDate, PayMethod, Postage, TotalMoney, DeliveryDate, DeliveryMethod, ConsigneeName, ConsigneeAddress, ConsigneePostalCode, Status)
values ('3', '3', to_date('01-07-2013', 'dd-mm-yyyy'), '���֧��', 5, 105, to_date('26-07-2014', 'dd-mm-yyyy'), '���', '����', '�����ж���', '100000', '1');

insert into Orders (OrderID, CustomerID, OrderDate, PayMethod, Postage, TotalMoney, DeliveryDate, DeliveryMethod, ConsigneeName, ConsigneeAddress, ConsigneePostalCode, Status)
values ('4', '4', to_date('09-07-2013', 'dd-mm-yyyy'), '���֧��', 5, 105, to_date('26-07-2014', 'dd-mm-yyyy'), '���', '����', '����������', '100000', '1');

insert into Orders (OrderID, CustomerID, OrderDate, PayMethod, Postage, TotalMoney, DeliveryDate, DeliveryMethod, ConsigneeName, ConsigneeAddress, ConsigneePostalCode, Status)
values ('5', '5', to_date('15-07-2014', 'dd-mm-yyyy'), '���֧��', 5, 105, to_date('26-07-2014', 'dd-mm-yyyy'), '���', '����', '�������廷', '100000', '1');

prompt Done.

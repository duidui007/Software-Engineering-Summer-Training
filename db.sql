/*==============================================================*/
/* DBMS name:      ORACLE Version 10g                           */
/* Created on:     2014/7/24 16:10:32                           */
/*==============================================================*/


alter table "OrderProduct"
   drop constraint FK_ORDERPRO_RELATIONS_ORDERS;

alter table "OrderProduct"
   drop constraint FK_ORDERPRO_RELATIONS_PRODUCTS;

alter table "Orders"
   drop constraint FK_ORDERS_RELATIONS_CUSTOMER;

alter table "Products"
   drop constraint FK_PRODUCTS_RELATIONS_CATEGORI;

alter table "SupplierProduct"
   drop constraint FK_SUPPLIER_RELATIONS_SUPPLIER;

alter table "SupplierProduct"
   drop constraint FK_SUPPLIER_RELATIONS_PRODUCTS;

alter table "Suppliers"
   drop constraint FK_SUPPLIER_RELATIONS_ADMINIST;

drop table "Administrator" cascade constraints;

drop table "Categories" cascade constraints;

drop table "Customers" cascade constraints;

drop table "OrderProduct" cascade constraints;

drop table "Orders" cascade constraints;

drop table "Products" cascade constraints;

drop table "SupplierProduct" cascade constraints;

drop table "Suppliers" cascade constraints;

/*==============================================================*/
/* Table: "Administrator"                                       */
/*==============================================================*/
create table "Administrator"  (
   "AdministratorID"    VARCHAR2(20)                    not null,
   "AdministratorName"  VARCHAR2(50),
   "Password"           VARCHAR2(50),
   "Privilege"          VARCHAR2(20),
   constraint PK_ADMINISTRATOR primary key ("AdministratorID")
);

/*==============================================================*/
/* Table: "Categories"                                          */
/*==============================================================*/
create table "Categories"  (
   "CategoryID"         VARCHAR2(20)                    not null,
   "CategoryName"       VARCHAR2(50),
   "Picture"            BLOB,
   constraint PK_CATEGORIES primary key ("CategoryID")
);

/*==============================================================*/
/* Table: "Customers"                                           */
/*==============================================================*/
create table "Customers"  (
   "CustomerID"         VARCHAR2(20)                    not null,
   "CustomerName"       VARCHAR2(50),
   "RealName"           VARCHAR2(50),
   "Password"           VARCHAR2(50),
   "Sex"                CHAR(2),
   "Question"           VARCHAR2(50),
   "Answer"             VARCHAR2(50),
   "Email"              VARCHAR2(50),
   "Address"            VARCHAR2(100),
   "PostalCode"         VARCHAR2(20),
   "Phone"              VARCHAR2(20),
   "Fax"                VARCHAR2(20),
   "RegisterDate"       DATE,
   "Integral"           INTEGER,
   constraint PK_CUSTOMERS primary key ("CustomerID")
);

/*==============================================================*/
/* Table: "OrderProduct"                                        */
/*==============================================================*/
create table "OrderProduct"  (
   "ProductID"          VARCHAR2(20)                    not null,
   "OrderID"            VARCHAR2(20)                    not null,
   constraint PK_ORDERPRODUCT primary key ("ProductID", "OrderID")
);

/*==============================================================*/
/* Table: "Orders"                                              */
/*==============================================================*/
create table "Orders"  (
   "OrderID"            VARCHAR2(20)                    not null,
   "CustomerID"         VARCHAR2(20),
   "OrderDate"          DATE,
   "PayMethod"          VARCHAR2(50),
   "Postage"            NUMBER(9),
   "TotalMoney"         NUMBER(8),
   "DeliveryDate"       DATE,
   "DeliveryMethod"     VARCHAR2(100),
   "ConsigneeName"      VARCHAR2(100),
   "ConsigneeAddress"   VARCHAR2(100),
   "ConsigneePostalCode" VARCHAR2(20),
   "Status"             VARCHAR2(50),
   constraint PK_ORDERS primary key ("OrderID")
);

/*==============================================================*/
/* Table: "Products"                                            */
/*==============================================================*/
create table "Products"  (
   "ProductID"          VARCHAR2(20)                    not null,
   "CategoryID"         VARCHAR2(20),
   "ProductName"        VARCHAR2(50),
   "MarketPrice"        NUMBER(6,2),
   "Picture"            BLOB,
   "activity"           VARCHAR2(50),
   "discount"           INTEGER(10),
   "Integral"           INTEGER(10),
   constraint PK_PRODUCTS primary key ("ProductID")
);

comment on table "Products" is
'存储产品的基本信息';

/*==============================================================*/
/* Table: "SupplierProduct"                                     */
/*==============================================================*/
create table "SupplierProduct"  (
   "SupplierID"         VARCHAR2(20)                    not null,
   "ProductID"          VARCHAR2(20)                    not null,
   constraint PK_SUPPLIERPRODUCT primary key ("SupplierID", "ProductID")
);

/*==============================================================*/
/* Table: "Suppliers"                                           */
/*==============================================================*/
create table "Suppliers"  (
   "SupplierID"         VARCHAR2(20)                    not null,
   "AdministratorID"    VARCHAR2(20),
   "UserName"           VARCHAR2(50),
   "Address"            VARCHAR2(100),
   "Phone"              VARCHAR2(100),
   "Type"               VARCHAR2(50),
   "LoginTime"          DATE,
   "PostalCode"         VARCHAR2(20),
   "Remark"             VARCHAR2(100),
   "groupactivity"      VARCHAR2(50),
   constraint PK_SUPPLIERS primary key ("SupplierID")
);

alter table "OrderProduct"
   add constraint FK_ORDERPRO_RELATIONS_ORDERS foreign key ("OrderID")
      references "Orders" ("OrderID");

alter table "OrderProduct"
   add constraint FK_ORDERPRO_RELATIONS_PRODUCTS foreign key ("ProductID")
      references "Products" ("ProductID");

alter table "Orders"
   add constraint FK_ORDERS_RELATIONS_CUSTOMER foreign key ("CustomerID")
      references "Customers" ("CustomerID");

alter table "Products"
   add constraint FK_PRODUCTS_RELATIONS_CATEGORI foreign key ("CategoryID")
      references "Categories" ("CategoryID");

alter table "SupplierProduct"
   add constraint FK_SUPPLIER_RELATIONS_SUPPLIER foreign key ("SupplierID")
      references "Suppliers" ("SupplierID");

alter table "SupplierProduct"
   add constraint FK_SUPPLIER_RELATIONS_PRODUCTS foreign key ("ProductID")
      references "Products" ("ProductID");

alter table "Suppliers"
   add constraint FK_SUPPLIER_RELATIONS_ADMINIST foreign key ("AdministratorID")
      references "Administrator" ("AdministratorID");


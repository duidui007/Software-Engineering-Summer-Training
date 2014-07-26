/*==============================================================*/
/* DBMS name:      Microsoft SQL Server 2005                    */
/* Created on:     2014/7/26 10:43:42                           */
/*==============================================================*/


if exists (select 1
            from  sysobjects
           where  id = object_id('Administrator')
            and   type = 'U')
   drop table Administrator
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Categories')
            and   type = 'U')
   drop table Categories
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Customers')
            and   type = 'U')
   drop table Customers
go

if exists (select 1
            from  sysobjects
           where  id = object_id('OrderProduct')
            and   type = 'U')
   drop table OrderProduct
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Orders')
            and   type = 'U')
   drop table Orders
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Products')
            and   type = 'U')
   drop table Products
go

if exists (select 1
            from  sysobjects
           where  id = object_id('SupplierProduct')
            and   type = 'U')
   drop table SupplierProduct
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Suppliers')
            and   type = 'U')
   drop table Suppliers
go

/*==============================================================*/
/* Table: Administrator                                         */
/*==============================================================*/
create table Administrator (
   AdministratorID      varchar(20)          not null,
   AdministratorName    varchar(50)          null,
   Password             varchar(50)          null,
   Privilege            varchar(20)          null,
   constraint PK_ADMINISTRATOR primary key nonclustered (AdministratorID)
)
go

/*==============================================================*/
/* Table: Categories                                            */
/*==============================================================*/
create table Categories (
   CategoryID           varchar(20)          not null,
   CategoryName         varchar(50)          null,
   Picture              image                null,
   constraint PK_CATEGORIES primary key nonclustered (CategoryID)
)
go

/*==============================================================*/
/* Table: Customers                                             */
/*==============================================================*/
create table Customers (
   CustomerID           varchar(20)          not null,
   CustomerName         varchar(50)          null,
   RealName             varchar(50)          null,
   Password             varchar(50)          null,
   Sex                  char(2)              null,
   Question             varchar(50)          null,
   Answer               varchar(50)          null,
   Email                varchar(50)          null,
   Address              varchar(100)         null,
   PostalCode           varchar(20)          null,
   Phone                varchar(20)          null,
   Fax                  varchar(20)          null,
   RegisterDate         datetime             null,
   Integral             int                  null,
   constraint PK_CUSTOMERS primary key nonclustered (CustomerID)
)
go

/*==============================================================*/
/* Table: OrderProduct                                          */
/*==============================================================*/
create table OrderProduct (
   ProductID            varchar(20)          not null,
   OrderID              varchar(20)          not null,
   constraint PK_ORDERPRODUCT primary key nonclustered (ProductID, OrderID)
)
go

/*==============================================================*/
/* Table: Orders                                                */
/*==============================================================*/
create table Orders (
   OrderID              varchar(20)          not null,
   CustomerID           varchar(20)          null,
   OrderDate            datetime             null,
   PayMethod            varchar(50)          null,
   Postage              decimal(9)           null,
   TotalMoney           money                null,
   DeliveryDate         datetime             null,
   DeliveryMethod       varchar(100)         null,
   ConsigneeName        varchar(100)         null,
   ConsigneeAddress     varchar(100)         null,
   ConsigneePostalCode  varchar(20)          null,
   Status               varchar(50)          null,
   constraint PK_ORDERS primary key nonclustered (OrderID)
)
go

/*==============================================================*/
/* Table: Products                                              */
/*==============================================================*/
create table Products (
   ProductID            varchar(20)          not null,
   CategoryID           varchar(20)          null,
   ProductName          varchar(50)          null,
   MarketPrice          numeric(6,2)         null,
   Picture              image                null,
   activity             varchar(50)          null,
   constraint PK_PRODUCTS primary key nonclustered (ProductID)
)
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   '存储产品的基本信息',
   'user', @CurrentUser, 'table', 'Products'
go

/*==============================================================*/
/* Table: SupplierProduct                                       */
/*==============================================================*/
create table SupplierProduct (
   SupplierID           varchar(20)          not null,
   ProductID            varchar(20)          not null,
   constraint PK_SUPPLIERPRODUCT primary key nonclustered (SupplierID, ProductID)
)
go

/*==============================================================*/
/* Table: Suppliers                                             */
/*==============================================================*/
create table Suppliers (
   SupplierID           varchar(20)          not null,
   AdministratorID      varchar(20)          null,
   UserName             varchar(50)          null,
   Address              varchar(100)         null,
   Phone                varchar(100)         null,
   Type                 varchar(50)          null,
   LoginTime            datetime             null,
   PostalCode           varchar(20)          null,
   Remark               varchar(100)         null,
   groupactivity        varchar(50)          null,
   constraint PK_SUPPLIERS primary key nonclustered (SupplierID)
)
go


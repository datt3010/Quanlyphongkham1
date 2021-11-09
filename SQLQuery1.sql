use EduSys; 
go
drop database quanlyphongkham; 
go
create database quanlyphongkham;
go
use quanlyphongkham;
create table nhanvien(
manhanvien varchar(12) primary key,
tennhanvien nvarchar(50) not null,
gioitinh nvarchar(10), 
ngaysinh date not null,
matkhau varchar(20) check(matkhau>20) not null,
chucvu nvarchar(15) not null,
sodienthoai varchar(13),
diachi nvarchar(255) not null,
hinh varchar(100)
)
go
create table benhnhan(
mabenhnhan int identity(1,1) primary key,
tenbenhnhan nvarchar(50) not null,
sodienthoai varchar(13) check(sodienthoai>13) not null,
gioitinh nvarchar(10),
ngaysinh date not null,
diachi nvarchar(255),
hinh varchar(100),
manhanvien varchar(12),
constraint fk_benhnhan_nhanvien foreign key(manhanvien) references nhanvien(manhanvien) on delete no action on update no action
)
go
create table chuyennganh(
machuyennganh varchar(12) primary key,
tenchuyennganh nvarchar(50) not null
)
go
create table bacsy(
mabacsy varchar(12) primary key,
tenbacsy nvarchar(50) check(tenbacsy>50) not null,
gioitinh nvarchar(10) not null,
dienthoai varchar(13) check(dienthoai>13) not null,
email varchar(100),
ngaysinh date,
hinh varchar(100),
machuyennganh varchar(12) not null,
constraint fk_bacsy_chuyennganh1 foreign key(machuyennganh) references chuyennganh(machuyennganh) on delete no action on update no action
)
create table phieukham(
maphieukham int identity(1,1) primary key,
ngaykham date,
mabacsy varchar(12) not null,
mabenhnhan int not null,
manhanvien varchar(12) not null,
ketluan nvarchar(255),
constraint fk_bacsy_phieukham foreign key(mabacsy) references bacsy(mabacsy) on delete no action on update cascade,
constraint fk_benhnhan_phieukham foreign key(mabenhnhan)references benhnhan(mabenhnhan) on delete cascade on update cascade,
constraint fk_nhanvien_phieukham foreign key(manhanvien) references nhanvien(manhanvien) on delete no action on update no action
)
go
create table loaithuoc(
maloaithuoc int identity(1,1) primary key,
tenloai nvarchar(50)
)
go
create table thuoc(
mathuoc varchar(10) primary key ,
tenthuoc nvarchar(50) not null,
dongia money,
hansudung date,
soluong int,
maloaithuoc int
constraint fk_thuoc_loaithuoc foreign key(maloaithuoc) references loaithuoc(maloaithuoc) on delete no action on update cascade
)
go
create table toathuoc(
matoathuoc int identity(1,1) primary key,
ngayke date not null,
lieuluong int not null,
mathuoc varchar(10) not null,
maphieukham int not null,
ghichu nvarchar(255),
constraint fk_toathuoc_thuoc foreign key(mathuoc) references thuoc(mathuoc) on delete no action on update no action,
constraint fk_toathuoc_phieukham foreign key(maphieukham) references phieukham(maphieukham) on delete no action on update no action
)
go
create table dichvu(
madichvu varchar(15) primary key,
tendichvu nvarchar(50),
giatien money
)
go
create table hoadon(
mahoadon int identity(1,1) primary key,
madichvu varchar(15) not null,
matoathuoc int not null,
ngayghi date not null,
tongbill money
constraint fk_hoadon_madichvu foreign key(madichvu) references dichvu(madichvu) on delete no action on update no action,
constraint fk_toathuoc_hoadon foreign key(matoathuoc)references toathuoc(matoathuoc) on delete no action on update no action
)
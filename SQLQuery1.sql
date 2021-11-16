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
matkhau varchar(20) check(matkhau>=3) not null,
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
manhanvien varchar(12),
trangthai nvarchar(50),
constraint fk_benhnhan_nhanvien foreign key(manhanvien) references nhanvien(manhanvien) on delete no action on update cascade
)
go
create table chuyennganh(
machuyennganh varchar(12) primary key,
tenchuyennganh nvarchar(100) not null
)
go
create table bacsy(
mabacsy varchar(12) primary key,
tenbacsy nvarchar(50) not null,
gioitinh nvarchar(10) not null,
dienthoai varchar(13) not null,
email varchar(100) not null,
ngaysinh date not null,
hinh varchar(100) not null,
machuyennganh varchar(12) not null,
constraint fk_bacsy_chuyennganh1 foreign key(machuyennganh) references chuyennganh(machuyennganh) on delete no action on update cascade
)
go
create table phieukham(
maphieukham int identity(1,1) primary key,
ngaykham date not null,
mabacsy varchar(12) not null,
mabenhnhan int not null,
manhanvien varchar(12) not null,
ketluan nvarchar(255),
constraint fk_bacsy_phieukham foreign key(mabacsy) references bacsy(mabacsy) on update cascade,
constraint fk_benhnhan_phieukham foreign key(mabenhnhan)references benhnhan(mabenhnhan) on delete no action on update cascade,
constraint fk_nhanvien_phieukham foreign key(manhanvien) references nhanvien(manhanvien) on delete no action
)
go
create table loaithuoc(
maloaithuoc int identity(1,1) primary key,
tenloai nvarchar(50) not null
)
go
create table thuoc(
mathuoc varchar(10) primary key ,
tenthuoc nvarchar(50) not null,
donvitinh nvarchar(20) not null,
dongia money not null,
cachdung nvarchar(100) not null,
hansudung date,
maloaithuoc int not null,
constraint fk_thuoc_loaithuoc foreign key(maloaithuoc) references loaithuoc(maloaithuoc) on delete no action on update cascade
)
go
create table dichvu(
madichvu varchar(15) primary key,
tendichvu nvarchar(50) not null,
giatien money not null
)
go
create table toathuoc(
maphieukham int,
mathuoc varchar(10),
madichvu varchar(15),
primary key(maphieukham,mathuoc,madichvu),
soluong int not null,
tongtienthuoc money not null,
ghichu nvarchar(255),
constraint fk_toathuoc_phieukham foreign key(maphieukham) references phieukham(maphieukham) on delete no action on update cascade,
constraint fk_toathuoc_thuoc foreign key(mathuoc)references thuoc(mathuoc) on delete no action on update cascade,
constraint fk_toathuoc_dichvu foreign key(madichvu) references dichvu(madichvu) on delete no action on update cascade
)
GO
INSERT INTO nhanvien(manhanvien,tennhanvien,gioitinh,ngaysinh,matkhau,chucvu,sodienthoai,diachi,hinh) values
('AnhLN',N'Lê Ngọc Anh',N'Nam','2002-11-20','123',N'Quản Lý','0346064484',N'Quảng Ngãi','anh1.png'),
('AnNT',N'Nguyễn Thành An',N'Nam','2002-11-20','123',N'Quản Lý','0346064484',N'Vũng Tàu','anh2.png'),
('DatHT',N'Huỳnh Tấn Đạt',N'Nam','2002-11-20','123',N'Quản Lý','0346064484',N'TPHCM','anh3.png'),
('DangPH',N'Phạm Hải Đăng',N'Nam','2002-11-20','123',N'Quản Lý','0346064484',N'Long An','anh4.png'),
('BinhTT',N'Trương Thanh Bình',N'Nữ','2002-11-20','123',N'Quản Lý','0346064484',N'Thái Bình','anh5.png'),
('BaoCT',N'Cao Thuận Bảo',N'Khác','2002-11-20','123',N'Nhân Viên','0346064484',N'Cần Thơ','anh6.png'),
('MinhNQ',N'Nguyễn Quốc Minh',N'Khác','2002-11-20','123',N'Nhân Viên','0346064484',N'Bình Định','anh7.png');
GO
INSERT INTO benhnhan(tenbenhnhan,sodienthoai,gioitinh,ngaysinh,diachi,manhanvien,trangthai) values
(N'Nguyễn Hoài Bảo','0123562451',N'Nam','2002-11-21',N'Quảng Ngãi','AnNT'),
(N'Lê Quốc Bảo','0123562451',N'Nam','2002-11-21',N'Quảng Ngãi','AnNT'),
(N'Nguyễn Thành Nam','0123562451',N'Nam','2002-11-21',N'Quảng Ngãi','AnNT'),
(N'Đỗ Huyền Trân','0123562451',N'Nữ','2002-11-21',N'Quảng Ngãi','AnNT'),
(N'Nguyễn Thị Bích','0123562451',N'Nữ','2002-11-21',N'Quảng Ngãi','AnNT'),
(N'Nguyễn Khắc Tâm','0123562451',N'Nữ','2002-11-21',N'Quảng Ngãi','AnNT'),
(N'Phạm Hồng Diễm','0123562451',N'Nữ','2002-11-21',N'Quảng Ngãi','AnNT'),
(N'Nguyễn Hoài Nghi','0123562451',N'Khác','2002-11-21',N'Quảng Ngãi','AnNT'),
(N'Nguyễn Trường','0123562451',N'Khác','2002-11-21',N'Quảng Ngãi','AnNT'),
(N'Nguyễn Vipp','0123562451',N'Khác','2002-11-21',N'Quảng Ngãi','AnNT');
GO
INSERT INTO chuyennganh(machuyennganh,tenchuyennganh) values
('CN01','Chuyên Khoa Nhi'),
('CN02','Chuyên Khoa Mắt'),
('CN03','Chuyên Khoa Tiêu Hoá'),
('CN04','Chuyên Khoa Tim mạch'),
('CN05','Chuyên Khoa Răng Miệng'),
('CN06','Chuyên Khoa Thần Kinh'),
('CN07','Chuyên Khoa Tiêu Hoá'),
('CN08','Chuyên Khoa Cơ Xương Khớp'),
('CN09','Chuyên Khoa Tai Mũi Họng'),
('CN10','Chuyên Khoa Gan Mật');
GO
INSERT INTO bacsy(mabacsy,tenbacsy,gioitinh,dienthoai,email,ngaysinh,hinh,machuyennganh) values
('BS01',N'Phạm Xuân Mai',N'Nữ','0326541256','maipham@gmail.com','1990-10-20','bacsi1.png','CN01'),
('BS02',N'Phạm Hoài Nữ',N'Nữ','0326541256','maipham@gmail.com','1990-10-20','bacsi2.png','CN01'),
('BS03',N'Phạm Bắc Kinh',N'Nữ','0326541256','maipham@gmail.com','1990-10-20','bacsi3.png','CN01'),
('BS04',N'Phạm Xuân Bắc',N'Nữ','0326541256','maipham@gmail.com','1990-10-20','bacsi4.png','CN02'),
('BS05',N'Phạm Xuân Minh',N'Nam','0326541256','maipham@gmail.com','1990-10-20','bacsi5.png','CN02'),
('BS06',N'Nguyễn Minh Mẫn',N'Nam','0326541256','maipham@gmail.com','1990-10-20','bacsi6.png','CN03'),
('BS07',N'Đặng Phú Thịnh',N'Nam','0326541256','maipham@gmail.com','1990-10-20','bacsi7.png','CN03'),
('BS08',N'Vũ Đức Thiện',N'Nam','0326541256','maipham@gmail.com','1990-10-20','bacsi8.png','CN04'),
('BS09',N'Dương Hoàng Quân',N'Nam','0326541256','maipham@gmail.com','1990-10-20','bacsi9.png','CN04'),
('BS10',N'Phạm Xuân Bạch',N'Nữ','0326541256','maipham@gmail.com','1990-10-20','bacsi10.png','CN05'),
('BS11',N'Lê Thị Nữ',N'Nữ','0326541256','maipham@gmail.com','1990-10-20','bacsi11.png','CN05'),
('BS12',N'Võ Đình Việt',N'Nam','0326541256','maipham@gmail.com','1990-10-20','bacsi12.png','CN06'),
('BS13',N'Nguyễn Thanh Tùng',N'Nam','0326541256','maipham@gmail.com','1990-10-20','bacsi13.png','CN06'),
('BS14',N'Nguyễn Thanh Hậu',N'Nam','0326541256','maipham@gmail.com','1990-10-20','bacsi14.png','CN07'),
('BS15',N'Nguyễn Thanh Vương',N'Nam','0326541256','maipham@gmail.com','1990-10-20','bacsi15.png','CN07'),
('BS16',N'Võ Đình Hưng',N'Nam','0326541256','maipham@gmail.com','1990-10-20','bacsi16.png','CN08'),
('BS17',N'Lê Thuý Hoa',N'Nữ','0326541256','maipham@gmail.com','1990-10-20','bacsi17.png','CN08'),
('BS18',N'Nguyễn Nhật Lệ',N'Nữ','0326541256','maipham@gmail.com','1990-10-20','bacsi18.png','CN09'),
('BS19',N'Nguyễn Gia Thy',N'Nữ','0326541256','maipham@gmail.com','1990-10-20','bacsi19.png','CN09'),
('BS20',N'Phạm Xuân',N'Nam','0326541256','maipham@gmail.com','1990-10-20','bacsi20.png','CN09')
GO
INSERT INTO loaithuoc(tenloai) values(N'Cơ Xương Khớp'),
(N'Dị ỨNG'),
(N'Hạ sốt, Giam đau'),
(N'Hô hấp'),
(N'Kháng Sinh'),
(N'Kháng Viêm'),
(N'Nhỏ Mắt'),
(N'Nội Tiết'),
(N'Thần Kinh'),
(N'Tim Mạch'),
(N'Vitamin');
GO
insert into thuoc(mathuoc,tenthuoc,donvitinh,dongia,cachdung,hansudung,maloaithuoc) values
('TH000','Null',N'Null',0,N'Null','2023-10-12',1),
('TH001',N'ACEMUC 100 mg gói',N'Gói',10000,N'Ngày 1 gói','2023-10-12',2),
('TH002',N'ACEMUC gói 200 mg(2)',N'Viên',20000,N'Ngày 1v x 2 lần','2023-10-12',3),
('TH003',N'ACEMUC viên 200 mg',N'Viên',20000,N'Ngày 1v x 2 lần','2023-10-12',1),
('TH004',N'AcetylCystein Boston 100mg',N'Gói',20000,N'Ngày 1v x 2 lần','2023-10-12',4),
('TH005',N'Acid Ascorbic 500 mg',N'Viên',20000,N'Ngày 1v x 2 lần','2023-10-12',5),
('TH006',N'Alphachoay (HGiang)',N'Gói',20000,N'Ngày 1v x 2 lần','2023-10-12',6),
('TH007',N'ALUMAG-S',N'Viên',20000,N'Ngày 1v x 2 lần','2023-10-12',1),
('TH008',N'Amitriptiline 25mg',N'Viên',20000,N'Ngày 1v x 2 lần','2023-10-12',3),
('TH009',N'Amlodipin 5mg',N'Viên',20000,N'Ngày 1v x 2 lần','2023-10-12',6),
('TH010',N'AMOXICILIN  250MG',N'Gói',20000,N'Ngày 1v x 2 lần','2023-10-12',11),
('TH011',N'Amoxicilin 500mg',N'Viên',20000,N'Ngày 1v x 2 lần','2023-10-12',11),
('TH012',N'ANGELA GOLD LỌ/6OV',N'Gói',20000,N'Ngày 1v x 2 lần','2023-10-12',11),
('TH013',N'ALIPAS',N'Viên',20000,N'Ngày 1v x 2 lần','2023-10-12',10),
('TH014',N'Allerfor 4mg',N'Viên',20000,N'Ngày 1v x 2 lần','2023-10-12',10),
('TH015',N'ZINNAT 500 mg',N'Viên',20000,N'Ngày 1v x 2 lần','2023-10-12',10),
('TH016',N'Zengesic',N'Viên',20000,N'Ngày 1v x 2 lần','2023-10-12',10),
('TH017',N'Zinmax 250mg',N'Viên',20000,N'Ngày 1v x 2 lần','2023-10-12',10),
('TH018',N'PANAGIN',N'Viên',20000,N'Ngày 1v x 2 lần','2023-10-12',10),
('TH019',N'PANTOPRAZOL 40 mg',N'Viên',20000,N'Ngày 1v x 2 lần','2023-10-12',2),
('TH020',N'PESANCORT 15g',N'Viên',20000,N'Ngày 1v x 2 lần','2023-10-12',2),
('TH021',N'ACTAPULGITE gói',N'Gói',20000,N'Ngày 1v x 2 lần','2023-10-12',2),
('TH022',N'ALBENDAZOL 0.2',N'Viên',20000,N'Ngày 1v x 2 lần','2023-10-12',2),
('TH023',N'ACYCLOVIR 800',N'Viên',20000,N'Ngày 1v x 2 lần','2023-10-12',2),
('TH024',N'Allupurinol 300mg',N'Gói',20000,N'Ngày 1v x 2 lần','2023-10-12',2),
('TH025',N'ZITROMAX 200ml',N'Viên',20000,N'Ngày 1v x 2 lần','2023-10-12',2),
('TH026',N'PANTHENOL ',N'Viên',20000,N'Ngày 1v x 2 lần','2023-10-12',2),
('TH027',N'Partamol 325mg',N'Viên',20000,N'Ngày 1v x 2 lần','2023-10-12',2),
('TH028',N'PESANCORT 15g',N'Viên',20000,N'Ngày 1v x 2 lần','2023-10-12',2),
('TH029',N'Zedcal 200ml',N'Viên',20000,N'Ngày 1v x 2 lần','2023-10-12',2),
('TH030',N'TANGANIL 500mg(pháp)',N'Viên',20000,N'Ngày 1v x 2 lần','2023-10-12',2),
('TH031',N'Apesone 50mg',N'Viên',20000,N'Ngày 1v x 2 lần','2023-10-12',2),
('TH032',N'Apesone 50mg',N'Gói',20000,N'Ngày 1v x 2 lần','2023-10-12',2),
('TH033',N'Apesone 50mg',N'Viên',20000,N'Ngày 1v x 2 lần','2023-10-12',2),
('TH034',N'Apesone 50mg',N'Gói',20000,N'Ngày 1v x 2 lần','2023-10-12',2),
('TH035',N'Apesone 50mg',N'Gói',20000,N'Ngày 1v x 2 lần','2023-10-12',2),
('TH036',N'Apesone 50mg',N'Viên',20000,N'Ngày 1v x 2 lần','2023-10-12',2);
GO
INSERT INTO dichvu(madichvu,tendichvu,giatien) values('DV000',N'Null',0),
('DV001',N'Khám Mắt',11000),
('DV002',N'Khám Chân',12000),
('DV003',N'Khám Tay',10000),
('DV004',N'Bó Bột',15000),
('DV005',N'Nệp Xương',20000),
('DV006',N'Phẫu Thuât',100000),
('DV007',N'Chup X',50000),
('DV008',N'Cắt Kính',10000),
('DV009',N'Massage',12000);
GO




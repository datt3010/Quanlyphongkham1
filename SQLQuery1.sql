use Duanmau; 
go
drop database quanlyphongkham; 
go
create database quanlyphongkham;
go
use quanlyphongkham;
create table dichvu(
madichvu varchar(15) primary key,
tendichvu nvarchar(50) not null,
giatien money not null
)
go
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
mabenhnhan varchar(15) primary key,
tenbenhnhan nvarchar(50) not null,
sodienthoai varchar(13) check(sodienthoai>13) not null,
gioitinh nvarchar(10),
ngaysinh date not null,
diachi nvarchar(255),
trangthai nvarchar(50),
manhanvien varchar(12),
constraint fk_benhnhan_nhanvien foreign key(manhanvien) references nhanvien(manhanvien) on delete no action
)
go
create table chuyennganh(
machuyennganh varchar(12) primary key,
tenchuyennganh nvarchar(100) not null
)
go
create table bacsy(
mabacsy varchar(12) primary key,
matkhau varchar(50) not null,
tenbacsy nvarchar(50) not null,
gioitinh nvarchar(10) not null,
dienthoai varchar(13) not null,
email varchar(100) not null,
ngaysinh date not null,
hinh varchar(100) not null,
machuyennganh varchar(12) not null,
constraint fk_bacsy_chuyennganh1 foreign key(machuyennganh) references chuyennganh(machuyennganh) on delete no action
)
go
create table phieukham(
maphieukham int identity(1,1) primary key,
ngaykham date not null,
mabacsy varchar(12) not null,
mabenhnhan varchar(15) not null,
manhanvien varchar(12) not null,
ketluan nvarchar(255),
constraint fk_bacsy_phieukham foreign key(mabacsy) references bacsy(mabacsy) on update cascade,
constraint fk_benhnhan_phieukham foreign key(mabenhnhan)references benhnhan(mabenhnhan) on delete no action on update cascade,
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
maloaithuoc int not null,
constraint fk_thuoc_loaithuoc foreign key(maloaithuoc) references loaithuoc(maloaithuoc) on delete no action on update cascade
)
go

create table toathuoc(
maphieukham int,
mathuoc varchar(10),
primary key(maphieukham,mathuoc),
soluong int not null,
cachdung nvarchar(255),
constraint fk_toathuoc_phieukham foreign key(maphieukham) references phieukham(maphieukham) on delete no action on update cascade,
constraint fk_toathuoc_thuoc foreign key(mathuoc)references thuoc(mathuoc) on delete no action on update cascade,
)
go
create table phieudichvu(
maphieudichvu int identity(1,1) primary key,
mabenhnhan varchar(15) not null,
constraint fk_benhnhan_phieudichvu foreign key(mabenhnhan) references benhnhan(mabenhnhan)
)
create table chitietphieudichvu(
maphieudichvu int,
madichvu varchar(15),
dongia money,
primary key(madichvu,maphieudichvu),
constraint fk_chitietphieudichvu_madichvu foreign key(madichvu) references dichvu(madichvu),
constraint fk_maphieudichvu foreign key(maphieudichvu) references phieudichvu(maphieudichvu)
)
go
select * from benhnhan
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
INSERT INTO benhnhan(mabenhnhan,tenbenhnhan,sodienthoai,gioitinh,ngaysinh,diachi,trangthai,manhanvien) values
('BN01',N'Nguyễn Hoài Bảo','0123562451',N'Nam','2002-11-21',N'Quảng Ngãi',N'Đang điều trị','AnNT'),
('BN02',N'Lê Quốc Bảo','0123562451',N'Nam','2002-11-21',N'Quảng Ngãi',N'Đang điều trị','AnNT'),
('BN03',N'Nguyễn Thành Nam','0123562451',N'Nam','2002-11-21',N'Quảng Ngãi',N'Đang điều trị','AnNT'),
('BM04',N'Đỗ Huyền Trân','0123562451',N'Nữ','2002-11-21',N'Quảng Ngãi',N'Đang điều trị','AnNT'),
('BN05',N'Nguyễn Thị Bích','0123562451',N'Nữ','2002-11-21',N'Quảng Ngãi',N'Đang điều trị','AnNT'),
('BM06',N'Nguyễn Khắc Tâm','0123562451',N'Nữ','2002-11-21',N'Quảng Ngãi',N'Đang điều trị','AnNT'),
('BN11',N'Phạm Hồng Diễm','0123562451',N'Nữ','2002-11-21',N'Quảng Ngãi',N'Đang điều trị','AnNT'),
('BN08',N'Nguyễn Hoài Nghi','0123562451',N'Khác','2002-11-21',N'Quảng Ngãi',N'Đang điều trị','AnNT'),
('BN09',N'Nguyễn Trường','0123562451',N'Khác','2002-11-21',N'Quảng Ngãi',N'Đang điều trị','AnNT'),
('BN10',N'Nguyễn Vipp','0123562451',N'Khác','2002-11-21',N'Quảng Ngãi',N'Đang điều trị','AnNT');
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
INSERT INTO bacsy(mabacsy,matkhau,tenbacsy,gioitinh,dienthoai,email,ngaysinh,hinh,machuyennganh) values
('BS01','123',N'Phạm Xuân Mai',N'Nữ','0326541256','maipham@gmail.com','1990-10-20','bacsi1.png','CN01'),
('BS02','123',N'Phạm Hoài Nữ',N'Nữ','0326541256','maipham@gmail.com','1990-10-20','bacsi2.png','CN01'),
('BS03','123',N'Phạm Bắc Kinh',N'Nữ','0326541256','maipham@gmail.com','1990-10-20','bacsi3.png','CN01'),
('BS04','123',N'Phạm Xuân Bắc',N'Nữ','0326541256','maipham@gmail.com','1990-10-20','bacsi4.png','CN02'),
('BS05','123',N'Phạm Xuân Minh',N'Nam','0326541256','maipham@gmail.com','1990-10-20','bacsi5.png','CN02'),
('BS06','123',N'Nguyễn Minh Mẫn',N'Nam','0326541256','maipham@gmail.com','1990-10-20','bacsi6.png','CN03'),
('BS07','123',N'Đặng Phú Thịnh',N'Nam','0326541256','maipham@gmail.com','1990-10-20','bacsi7.png','CN03'),
('BS08','123',N'Vũ Đức Thiện',N'Nam','0326541256','maipham@gmail.com','1990-10-20','bacsi8.png','CN04'),
('BS09','123',N'Dương Hoàng Quân',N'Nam','0326541256','maipham@gmail.com','1990-10-20','bacsi9.png','CN04'),
('BS10','123',N'Phạm Xuân Bạch',N'Nữ','0326541256','maipham@gmail.com','1990-10-20','bacsi10.png','CN05'),
('BS11','123',N'Lê Thị Nữ',N'Nữ','0326541256','maipham@gmail.com','1990-10-20','bacsi11.png','CN05'),
('BS12','123',N'Võ Đình Việt',N'Nam','0326541256','maipham@gmail.com','1990-10-20','bacsi12.png','CN06'),
('BS13','123',N'Nguyễn Thanh Tùng',N'Nam','0326541256','maipham@gmail.com','1990-10-20','bacsi13.png','CN06'),
('BS14','123',N'Nguyễn Thanh Hậu',N'Nam','0326541256','maipham@gmail.com','1990-10-20','bacsi14.png','CN07'),
('BS15','123',N'Nguyễn Thanh Vương',N'Nam','0326541256','maipham@gmail.com','1990-10-20','bacsi15.png','CN07'),
('BS16','123',N'Võ Đình Hưng',N'Nam','0326541256','maipham@gmail.com','1990-10-20','bacsi16.png','CN08'),
('BS17','123',N'Lê Thuý Hoa',N'Nữ','0326541256','maipham@gmail.com','1990-10-20','bacsi17.png','CN08'),
('BS18','123',N'Nguyễn Nhật Lệ',N'Nữ','0326541256','maipham@gmail.com','1990-10-20','bacsi18.png','CN09'),
('BS19','123',N'Nguyễn Gia Thy',N'Nữ','0326541256','maipham@gmail.com','1990-10-20','bacsi19.png','CN09'),
('BS20','123',N'Phạm Xuân',N'Nam','0326541256','maipham@gmail.com','1990-10-20','bacsi20.png','CN09')
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

INSERT INTO thuoc(mathuoc,tenthuoc,donvitinh,maloaithuoc) values
('TH000','Null',N'Null',1),
('TH001',N'ACEMUC 100 mg gói',N'Gói',1),
('TH002',N'ACEMUC gói 200 mg(2)',N'Viên',1),
('TH003',N'ACEMUC viên 200 mg',N'Viên',1),
('TH004',N'AcetylCystein Boston 100mg',N'Gói',2),
('TH005',N'Acid Ascorbic 500 mg',N'Viên',2),
('TH007',N'Amlodipin 5mg Nang',N'Hộp',2),
('TH008',N'Betadine SK 125ml',N'Gói',2),
('TH009',N'Betadine SK 30ml',N'Gói',3),
('TH010',N'Intima VSPN 200ml Đỏ',N'Gói',3),
('TH011',N'Intima VSPN 200ml Trắng',N'Gói',3),
('TH012',N'Intima VSPN 200ml Xanh',N'Gói',3),
('TH013',N'Neotergynan Đặt Pháp',N'Hộp',4),
('TH014',N'Newchoice',N'Hộp',4),
('TH015',N'Orgamentril 5mg Viên',N'Viên',4),
('TH016',N'Polygynax',N'Gói',4),
('TH017',N'Rotunda Viên TW2',N'Hộp',4),
('TH018',N'Tanganil 500mg Viên Pháp',N'Gói',5),
('TH019',N'Cebraton Hộp 5 Vỉ TPC',N'Gói',5),
('TH020',N'Cinarizin 25mg Hà nội',N'Hộp',5),
('TH021',N'Digoxin Lọ 50v Hungary',N'Gói',5),
('TH022',N'Kaleorid 600mg Đan Mạch',N'Hộp',6),
('TH023',N'Lipanthyl 200mg Viên Pháp',N'Gói',6),
('TH024',N'Lipitor 10mg Nén Mỹ',N'Hộp',6),
('TH025',N'Micardis 40mg Viên Đức',N'Gói',6),
('TH026',N'Serapid 5mg Viên HQ',N'Hộp',6),
('TH027',N'Azi 200mg Bột Hậu Giang',N'Gói',7),
('TH028',N'Azi 250mg Viên Z120',N'Viên',7),
('TH029',N'Azi 500mg Viên Ấn Độ',N'Viên',7),
('TH030',N'Ery 500mg Viên Vidipha',N'Gói',8),
('TH031',N'Flagyl 250mg Viên Sanofi',N'Gói',8),
('TH032',N'Furosemid 40mg Viên MKP',N'Hộp',8),
('TH033',N'Genta Tiêm HD',N'Gói',8),
('TH034',N'Heptamyl 187,8mg Pháp',N'Hộp',8),
('TH035',N'Roxi 150mg Viên Ấn',N'Gói',9),
('TH036',N'Sulfaguanidin 500mg Viên MKP',N'Gói',9),
('TH037',N'Telfast 180mg Viên Sanofi',N'Gói',9),
('TH038',N'Telfast 60mg Viên Sanofi',N'Viên',9),
('TH039',N'inidazol 500mg Viên Ấn Độ',N'Gói',9),
('TH040',N'Cefpo 100mg Gói Ngọt USP',N'Hộp',9)
GO
INSERT INTO dichvu(madichvu,tendichvu,giatien) values('DV000',N'Khám Bình thường', 10000),
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
INSERT INTO phieukham(ngaykham,mabacsy,mabenhnhan,manhanvien,ketluan) values('2021-11-16','BS01',N'BN01',N'AnNT',N'Tiêu chảy'),
('2021-11-16','BS02',N'BN02',N'AnNT',N'Ung thư'),
('2021-11-16','BS03',N'BN03',N'AnNT',N'Sốt'),
('2021-11-16','BS04',N'BM04',N'AnNT',N'Viêm ACD'),
('2021-11-16','BS05',N'BN03',N'AnNT',N'Gãy Chân');
go
insert into phieudichvu(mabenhnhan) values
(N'BN02'),
(N'BN03')
GO
insert into chitietphieudichvu(madichvu,maphieudichvu,dongia) values
('DV000',3,1200);
if OBJECT_ID('trigger_benhnhan') is not null
drop trigger trigger_benhnhan
go
/*tạo trigger cho bệnh nhân để tự tăng cho phiếu dịch vụ*/
create trigger trigger_benhnhan on benhnhan 
after insert 
as
begin
set nocount on
declare @mabenhnhan varchar(15)
select @mabenhnhan=benhnhan.mabenhnhan
from benhnhan
insert into phieudichvu values(@mabenhnhan) 
end
select * from phieudichvu
select * from bacsy
select * from nhanvien
select * from benhnhan
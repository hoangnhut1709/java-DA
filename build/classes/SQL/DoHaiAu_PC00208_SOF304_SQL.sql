USE [master]
GO
/****** Object:  Database [DA1_QLKho]    Script Date: 06/01/2020 09:13:23 ******/
CREATE DATABASE [DA1_QLKho] ON  PRIMARY 
( NAME = N'DA1_QLKho', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL10_50.MSSQLEXRESS\MSSQL\DATA\DA1_QLKho.mdf' , SIZE = 2304KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'DA1_QLKho_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL10_50.MSSQLEXRESS\MSSQL\DATA\DA1_QLKho_log.LDF' , SIZE = 768KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [DA1_QLKho] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [DA1_QLKho].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [DA1_QLKho] SET ANSI_NULL_DEFAULT OFF
GO
ALTER DATABASE [DA1_QLKho] SET ANSI_NULLS OFF
GO
ALTER DATABASE [DA1_QLKho] SET ANSI_PADDING OFF
GO
ALTER DATABASE [DA1_QLKho] SET ANSI_WARNINGS OFF
GO
ALTER DATABASE [DA1_QLKho] SET ARITHABORT OFF
GO
ALTER DATABASE [DA1_QLKho] SET AUTO_CLOSE ON
GO
ALTER DATABASE [DA1_QLKho] SET AUTO_CREATE_STATISTICS ON
GO
ALTER DATABASE [DA1_QLKho] SET AUTO_SHRINK OFF
GO
ALTER DATABASE [DA1_QLKho] SET AUTO_UPDATE_STATISTICS ON
GO
ALTER DATABASE [DA1_QLKho] SET CURSOR_CLOSE_ON_COMMIT OFF
GO
ALTER DATABASE [DA1_QLKho] SET CURSOR_DEFAULT  GLOBAL
GO
ALTER DATABASE [DA1_QLKho] SET CONCAT_NULL_YIELDS_NULL OFF
GO
ALTER DATABASE [DA1_QLKho] SET NUMERIC_ROUNDABORT OFF
GO
ALTER DATABASE [DA1_QLKho] SET QUOTED_IDENTIFIER OFF
GO
ALTER DATABASE [DA1_QLKho] SET RECURSIVE_TRIGGERS OFF
GO
ALTER DATABASE [DA1_QLKho] SET  ENABLE_BROKER
GO
ALTER DATABASE [DA1_QLKho] SET AUTO_UPDATE_STATISTICS_ASYNC OFF
GO
ALTER DATABASE [DA1_QLKho] SET DATE_CORRELATION_OPTIMIZATION OFF
GO
ALTER DATABASE [DA1_QLKho] SET TRUSTWORTHY OFF
GO
ALTER DATABASE [DA1_QLKho] SET ALLOW_SNAPSHOT_ISOLATION OFF
GO
ALTER DATABASE [DA1_QLKho] SET PARAMETERIZATION SIMPLE
GO
ALTER DATABASE [DA1_QLKho] SET READ_COMMITTED_SNAPSHOT OFF
GO
ALTER DATABASE [DA1_QLKho] SET HONOR_BROKER_PRIORITY OFF
GO
ALTER DATABASE [DA1_QLKho] SET  READ_WRITE
GO
ALTER DATABASE [DA1_QLKho] SET RECOVERY SIMPLE
GO
ALTER DATABASE [DA1_QLKho] SET  MULTI_USER
GO
ALTER DATABASE [DA1_QLKho] SET PAGE_VERIFY CHECKSUM
GO
ALTER DATABASE [DA1_QLKho] SET DB_CHAINING OFF
GO
USE [DA1_QLKho]
GO
/****** Object:  Table [dbo].[ThongTinKho]    Script Date: 06/01/2020 09:13:24 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ThongTinKho](
	[MaKho] [nvarchar](50) NOT NULL,
	[TenKho] [nvarchar](50) NULL,
	[DiaChiKho] [nvarchar](150) NULL,
 CONSTRAINT [PK_ThongTinKho] PRIMARY KEY CLUSTERED 
(
	[MaKho] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[ThongTinKho] ([MaKho], [TenKho], [DiaChiKho]) VALUES (N'K01', N'Kho A', N'Cần Thơ')
INSERT [dbo].[ThongTinKho] ([MaKho], [TenKho], [DiaChiKho]) VALUES (N'K02', N'Kho B', N'HCM')
INSERT [dbo].[ThongTinKho] ([MaKho], [TenKho], [DiaChiKho]) VALUES (N'K03', N'Kho C', N'Đà Nẵng')
INSERT [dbo].[ThongTinKho] ([MaKho], [TenKho], [DiaChiKho]) VALUES (N'K04', N'Kho D', N'Huế')
INSERT [dbo].[ThongTinKho] ([MaKho], [TenKho], [DiaChiKho]) VALUES (N'K05', N'Kho E', N'Đồng Tháp')
INSERT [dbo].[ThongTinKho] ([MaKho], [TenKho], [DiaChiKho]) VALUES (N'K06', N'Kho F', N'Hồ Chí Minh')
/****** Object:  Table [dbo].[LoaiSP]    Script Date: 06/01/2020 09:13:24 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiSP](
	[MaLoai] [nvarchar](50) NOT NULL,
	[TenLoai] [nvarchar](50) NULL,
 CONSTRAINT [PK_LoaiSP] PRIMARY KEY CLUSTERED 
(
	[MaLoai] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[LoaiSP] ([MaLoai], [TenLoai]) VALUES (N'ML01', N'Điệ Gia Dùng')
INSERT [dbo].[LoaiSP] ([MaLoai], [TenLoai]) VALUES (N'ML02', N'Điện Tử')
INSERT [dbo].[LoaiSP] ([MaLoai], [TenLoai]) VALUES (N'ML03', N'Thực Phẩm')
/****** Object:  Table [dbo].[LoaiNhaCC]    Script Date: 06/01/2020 09:13:24 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiNhaCC](
	[MaLoaiCC] [nvarchar](50) NOT NULL,
	[QuocGiaCC] [nvarchar](50) NULL,
 CONSTRAINT [PK_LoaiNhaCC] PRIMARY KEY CLUSTERED 
(
	[MaLoaiCC] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[LoaiNhaCC] ([MaLoaiCC], [QuocGiaCC]) VALUES (N'MLCC01', N'Việt Nam')
INSERT [dbo].[LoaiNhaCC] ([MaLoaiCC], [QuocGiaCC]) VALUES (N'MLCC02', N'Trung Quốc')
INSERT [dbo].[LoaiNhaCC] ([MaLoaiCC], [QuocGiaCC]) VALUES (N'MLCC03', N'Mĩ')
INSERT [dbo].[LoaiNhaCC] ([MaLoaiCC], [QuocGiaCC]) VALUES (N'MLCC04', N'Pháp')
INSERT [dbo].[LoaiNhaCC] ([MaLoaiCC], [QuocGiaCC]) VALUES (N'MLCC05', N'Nhật Bản')
/****** Object:  Table [dbo].[NhomNguoiDung]    Script Date: 06/01/2020 09:13:24 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhomNguoiDung](
	[MaNhom] [nvarchar](50) NOT NULL,
	[TenNhom] [nvarchar](50) NULL,
 CONSTRAINT [PK_NhomNguoiDung] PRIMARY KEY CLUSTERED 
(
	[MaNhom] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[NhomNguoiDung] ([MaNhom], [TenNhom]) VALUES (N'N01', N'Quan Ly Kho')
INSERT [dbo].[NhomNguoiDung] ([MaNhom], [TenNhom]) VALUES (N'N02', N'Nhan Vien')
INSERT [dbo].[NhomNguoiDung] ([MaNhom], [TenNhom]) VALUES (N'N03', N'Nhân Viên')
INSERT [dbo].[NhomNguoiDung] ([MaNhom], [TenNhom]) VALUES (N'N04', N'Nhân Viên')
INSERT [dbo].[NhomNguoiDung] ([MaNhom], [TenNhom]) VALUES (N'N05', N'Nhân Viên')
/****** Object:  Table [dbo].[NhaCungCap]    Script Date: 06/01/2020 09:13:24 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhaCungCap](
	[MaNhaCC] [nvarchar](50) NOT NULL,
	[MaLoaiCC] [nvarchar](50) NULL,
	[TenNhaCC] [nvarchar](50) NULL,
	[DiaChiCC] [nvarchar](150) NULL,
 CONSTRAINT [PK_NhaCungCap] PRIMARY KEY CLUSTERED 
(
	[MaNhaCC] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[NhaCungCap] ([MaNhaCC], [MaLoaiCC], [TenNhaCC], [DiaChiCC]) VALUES (N'MNCC01', N'MLCC01', N'Cong ty A', N'Cần Thơ')
INSERT [dbo].[NhaCungCap] ([MaNhaCC], [MaLoaiCC], [TenNhaCC], [DiaChiCC]) VALUES (N'MNCC02', N'MLCC02', N'Cong ty B', N'HCM')
INSERT [dbo].[NhaCungCap] ([MaNhaCC], [MaLoaiCC], [TenNhaCC], [DiaChiCC]) VALUES (N'MNCC03', N'MLCC03', N'Cong ty C', N'Đà Nẵng')
INSERT [dbo].[NhaCungCap] ([MaNhaCC], [MaLoaiCC], [TenNhaCC], [DiaChiCC]) VALUES (N'MNCC04', N'MLCC04', N'Cong ty D', N'Huế')
INSERT [dbo].[NhaCungCap] ([MaNhaCC], [MaLoaiCC], [TenNhaCC], [DiaChiCC]) VALUES (N'MNCC05', N'MLCC05', N'Cong ty E', N'Đồng Tháp')
/****** Object:  Table [dbo].[NguoiDung]    Script Date: 06/01/2020 09:13:24 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NguoiDung](
	[MaND] [nvarchar](50) NOT NULL,
	[TenND] [nvarchar](50) NULL,
	[Password] [nvarchar](50) NULL,
	[MaNhom] [nvarchar](50) NULL,
 CONSTRAINT [PK_NguoiDung] PRIMARY KEY CLUSTERED 
(
	[MaND] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[NguoiDung] ([MaND], [TenND], [Password], [MaNhom]) VALUES (N'ND1', N'Thien', N'123', N'N01')
INSERT [dbo].[NguoiDung] ([MaND], [TenND], [Password], [MaNhom]) VALUES (N'ND2', N'Di', N'123', N'N01')
INSERT [dbo].[NguoiDung] ([MaND], [TenND], [Password], [MaNhom]) VALUES (N'ND3', N'Thuan', N'123', N'N02')
INSERT [dbo].[NguoiDung] ([MaND], [TenND], [Password], [MaNhom]) VALUES (N'ND4', N'Bang', N'123', N'N03')
INSERT [dbo].[NguoiDung] ([MaND], [TenND], [Password], [MaNhom]) VALUES (N'ND5', N'Nhut', N'123', N'N03')
/****** Object:  Table [dbo].[PhieuNhap]    Script Date: 06/01/2020 09:13:24 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuNhap](
	[MaNhap] [nvarchar](50) NOT NULL,
	[MaSP] [nvarchar](50) NULL,
	[MaKho] [nvarchar](50) NULL,
	[Gia] [money] NULL,
	[SoLuong] [int] NULL,
	[NgayNhap] [date] NULL,
	[MaND] [nvarchar](50) NULL,
 CONSTRAINT [PK_PhieuNhap] PRIMARY KEY CLUSTERED 
(
	[MaNhap] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[PhieuNhap] ([MaNhap], [MaSP], [MaKho], [Gia], [SoLuong], [NgayNhap], [MaND]) VALUES (N'N01', N'SP1', N'K03', 200.0000, 10, CAST(0x2A3F0B00 AS Date), N'ND1')
INSERT [dbo].[PhieuNhap] ([MaNhap], [MaSP], [MaKho], [Gia], [SoLuong], [NgayNhap], [MaND]) VALUES (N'N010', N'SP10', N'K01', 220.0000, 14, CAST(0x053E0B00 AS Date), N'ND1')
INSERT [dbo].[PhieuNhap] ([MaNhap], [MaSP], [MaKho], [Gia], [SoLuong], [NgayNhap], [MaND]) VALUES (N'N011', N'SP11', N'K02', 350.0000, 18, CAST(0x6C3F0B00 AS Date), N'ND2')
INSERT [dbo].[PhieuNhap] ([MaNhap], [MaSP], [MaKho], [Gia], [SoLuong], [NgayNhap], [MaND]) VALUES (N'N012', N'SP12', N'K03', 115.0000, 25, CAST(0x0A3E0B00 AS Date), N'ND4')
INSERT [dbo].[PhieuNhap] ([MaNhap], [MaSP], [MaKho], [Gia], [SoLuong], [NgayNhap], [MaND]) VALUES (N'N02', N'SP2', N'K03', 1.0000, 50, CAST(0xD93D0B00 AS Date), N'ND2')
INSERT [dbo].[PhieuNhap] ([MaNhap], [MaSP], [MaKho], [Gia], [SoLuong], [NgayNhap], [MaND]) VALUES (N'N03', N'SP3', N'K02', 50.0000, 20, CAST(0x233F0B00 AS Date), N'ND3')
INSERT [dbo].[PhieuNhap] ([MaNhap], [MaSP], [MaKho], [Gia], [SoLuong], [NgayNhap], [MaND]) VALUES (N'N04', N'SP4', N'K01', 100.0000, 40, CAST(0x433F0B00 AS Date), N'ND4')
INSERT [dbo].[PhieuNhap] ([MaNhap], [MaSP], [MaKho], [Gia], [SoLuong], [NgayNhap], [MaND]) VALUES (N'N05', N'SP5', N'K02', 10.0000, 60, CAST(0xF33D0B00 AS Date), N'ND5')
INSERT [dbo].[PhieuNhap] ([MaNhap], [MaSP], [MaKho], [Gia], [SoLuong], [NgayNhap], [MaND]) VALUES (N'N06', N'SP6', N'K03', 12.0000, 25, CAST(0x4B3F0B00 AS Date), N'ND3')
INSERT [dbo].[PhieuNhap] ([MaNhap], [MaSP], [MaKho], [Gia], [SoLuong], [NgayNhap], [MaND]) VALUES (N'N07', N'SP7', N'K04', 255.0000, 15, CAST(0x043E0B00 AS Date), N'ND1')
INSERT [dbo].[PhieuNhap] ([MaNhap], [MaSP], [MaKho], [Gia], [SoLuong], [NgayNhap], [MaND]) VALUES (N'N08', N'SP8', N'K04', 175.0000, 23, CAST(0x523F0B00 AS Date), N'ND1')
INSERT [dbo].[PhieuNhap] ([MaNhap], [MaSP], [MaKho], [Gia], [SoLuong], [NgayNhap], [MaND]) VALUES (N'N09', N'SP9', N'K05', 550.0000, 12, CAST(0xE13D0B00 AS Date), N'ND3')
/****** Object:  Table [dbo].[SanPham]    Script Date: 06/01/2020 09:13:24 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPham](
	[MaSP] [nvarchar](50) NOT NULL,
	[TenSP] [nvarchar](50) NULL,
	[MaLoai] [nvarchar](50) NULL,
	[MaNhap] [nvarchar](50) NULL,
	[MaNhaCC] [nvarchar](50) NULL,
	[NSX] [date] NULL,
	[HSD] [date] NULL,
 CONSTRAINT [PK_SanPham] PRIMARY KEY CLUSTERED 
(
	[MaSP] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoai], [MaNhap], [MaNhaCC], [NSX], [HSD]) VALUES (N'SP1', N'Sua', N'ML03', N'N01', N'MNCC03', CAST(0x2C3F0B00 AS Date), CAST(0x07420B00 AS Date))
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoai], [MaNhap], [MaNhaCC], [NSX], [HSD]) VALUES (N'SP10', N'Bia', N'ML03', N'N010', N'MNCC04', CAST(0x073E0B00 AS Date), CAST(0x01410B00 AS Date))
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoai], [MaNhap], [MaNhaCC], [NSX], [HSD]) VALUES (N'SP11', N'Bin sạc dự phòng', N'ML02', N'N011', N'MNCC03', CAST(0x6F3F0B00 AS Date), CAST(0xDD400B00 AS Date))
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoai], [MaNhap], [MaNhaCC], [NSX], [HSD]) VALUES (N'SP12', N'Ổ điện', N'ML01', N'N012', N'MNCC01', CAST(0x0D3E0B00 AS Date), CAST(0x55420B00 AS Date))
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoai], [MaNhap], [MaNhaCC], [NSX], [HSD]) VALUES (N'SP2', N'Pepsi', N'ML03', N'N02', N'MNCC03', CAST(0xDB3D0B00 AS Date), CAST(0x90430B00 AS Date))
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoai], [MaNhap], [MaNhaCC], [NSX], [HSD]) VALUES (N'SP3', N'Điện Thoại', N'ML02', N'N03', N'MNCC02', CAST(0x233F0B00 AS Date), CAST(0x90400B00 AS Date))
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoai], [MaNhap], [MaNhaCC], [NSX], [HSD]) VALUES (N'SP4', N'Nồi cơm điện', N'ML01', N'N04', N'MNCC01', CAST(0x433F0B00 AS Date), CAST(0xB0400B00 AS Date))
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoai], [MaNhap], [MaNhaCC], [NSX], [HSD]) VALUES (N'SP5', N'Laptop', N'ML02', N'N05', N'MNCC02', CAST(0xF33D0B00 AS Date), CAST(0xCE400B00 AS Date))
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoai], [MaNhap], [MaNhaCC], [NSX], [HSD]) VALUES (N'SP6', N'Đậu hủ', N'ML03', N'N06', N'MNCC05', CAST(0x4D3F0B00 AS Date), CAST(0xBA400B00 AS Date))
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoai], [MaNhap], [MaNhaCC], [NSX], [HSD]) VALUES (N'SP7', N'Quật gió', N'ML01', N'N07', N'MNCC01', CAST(0x063E0B00 AS Date), CAST(0xE1400B00 AS Date))
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoai], [MaNhap], [MaNhaCC], [NSX], [HSD]) VALUES (N'SP8', N'Bóng đèn', N'ML01', N'N08', N'MNCC01', CAST(0x583F0B00 AS Date), CAST(0xC5400B00 AS Date))
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoai], [MaNhap], [MaNhaCC], [NSX], [HSD]) VALUES (N'SP9', N'Loa', N'ML02', N'N09', N'MNCC02', CAST(0xE33D0B00 AS Date), CAST(0xBD400B00 AS Date))
/****** Object:  StoredProcedure [dbo].[sp_ThongKeNhapKho]    Script Date: 06/01/2020 09:13:27 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create Proc [dbo].[sp_ThongKeNhapKho]
(@Year int)
AS
Begin
	select sp.TenSP,
	lsp.TenLoai,
	pn.SoLuong,
	(pn.Gia)*(pn.SoLuong) as VonNhap		
	FROM SanPham sp
		left JOIN LoaiSP lsp ON lsp.MaLoai=sp.MaLoai
		left join PhieuNhap pn ON pn.MaSP= sp.MaSP
		WHERE YEAR(NgayNhap) = @Year
	--GROUP BY TenSP
End
GO
/****** Object:  Table [dbo].[PhieuXuat]    Script Date: 06/01/2020 09:13:27 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuXuat](
	[MaXuat] [nvarchar](50) NOT NULL,
	[MaSP] [nvarchar](50) NULL,
	[MaKho] [nvarchar](50) NULL,
	[Gia] [float] NULL,
	[SoLuong] [int] NULL,
	[DiaChiXuat] [nvarchar](150) NULL,
	[NgayXuat] [date] NULL,
	[MaND] [nvarchar](50) NULL,
 CONSTRAINT [PK_PhieuXuat] PRIMARY KEY CLUSTERED 
(
	[MaXuat] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[PhieuXuat] ([MaXuat], [MaSP], [MaKho], [Gia], [SoLuong], [DiaChiXuat], [NgayXuat], [MaND]) VALUES (N'X01', N'SP1', N'K01', 30000, 50, N'Soc Trang', CAST(0xA43F0B00 AS Date), N'ND2')
INSERT [dbo].[PhieuXuat] ([MaXuat], [MaSP], [MaKho], [Gia], [SoLuong], [DiaChiXuat], [NgayXuat], [MaND]) VALUES (N'X02', N'SP2', N'K03', 50000, 30, N'Cần Thơ', CAST(0x753E0B00 AS Date), N'ND1')
INSERT [dbo].[PhieuXuat] ([MaXuat], [MaSP], [MaKho], [Gia], [SoLuong], [DiaChiXuat], [NgayXuat], [MaND]) VALUES (N'X03', N'SP2', N'K02', 10000, 10, N'Huế', CAST(0x40400B00 AS Date), N'ND3')
INSERT [dbo].[PhieuXuat] ([MaXuat], [MaSP], [MaKho], [Gia], [SoLuong], [DiaChiXuat], [NgayXuat], [MaND]) VALUES (N'X04', N'SP3', N'K04', 1000000, 40, N'Đà Nẵng', CAST(0x233F0B00 AS Date), N'ND4')
INSERT [dbo].[PhieuXuat] ([MaXuat], [MaSP], [MaKho], [Gia], [SoLuong], [DiaChiXuat], [NgayXuat], [MaND]) VALUES (N'X05', N'SP5', N'K05', 2000000, 60, N'HCM', CAST(0xD63D0B00 AS Date), N'ND5')
/****** Object:  StoredProcedure [dbo].[sp_ThongKeXuatKho]    Script Date: 06/01/2020 09:13:27 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create Proc [dbo].[sp_ThongKeXuatKho]
(@Year int)
AS
Begin
	select sp.TenSP,
	lsp.TenLoai,
	px.SoLuong,
	(px.Gia)*(px.SoLuong) as VonXuat		
	FROM SanPham sp
		left JOIN LoaiSP lsp ON lsp.MaLoai=sp.MaLoai
		left join PhieuXuat px ON px.MaSP= sp.MaSP
		WHERE YEAR(NgayXuat) = @Year
	--GROUP BY TenSP
End
GO
/****** Object:  ForeignKey [FK_NhaCungCap_LoaiNhaCC]    Script Date: 06/01/2020 09:13:24 ******/
ALTER TABLE [dbo].[NhaCungCap]  WITH CHECK ADD  CONSTRAINT [FK_NhaCungCap_LoaiNhaCC] FOREIGN KEY([MaLoaiCC])
REFERENCES [dbo].[LoaiNhaCC] ([MaLoaiCC])
GO
ALTER TABLE [dbo].[NhaCungCap] CHECK CONSTRAINT [FK_NhaCungCap_LoaiNhaCC]
GO
/****** Object:  ForeignKey [FK_NguoiDung_NhomNguoiDung]    Script Date: 06/01/2020 09:13:24 ******/
ALTER TABLE [dbo].[NguoiDung]  WITH CHECK ADD  CONSTRAINT [FK_NguoiDung_NhomNguoiDung] FOREIGN KEY([MaNhom])
REFERENCES [dbo].[NhomNguoiDung] ([MaNhom])
GO
ALTER TABLE [dbo].[NguoiDung] CHECK CONSTRAINT [FK_NguoiDung_NhomNguoiDung]
GO
/****** Object:  ForeignKey [FK_PhieuNhap_NguoiDung]    Script Date: 06/01/2020 09:13:24 ******/
ALTER TABLE [dbo].[PhieuNhap]  WITH CHECK ADD  CONSTRAINT [FK_PhieuNhap_NguoiDung] FOREIGN KEY([MaND])
REFERENCES [dbo].[NguoiDung] ([MaND])
GO
ALTER TABLE [dbo].[PhieuNhap] CHECK CONSTRAINT [FK_PhieuNhap_NguoiDung]
GO
/****** Object:  ForeignKey [FK_PhieuNhap_ThongTinKho]    Script Date: 06/01/2020 09:13:24 ******/
ALTER TABLE [dbo].[PhieuNhap]  WITH CHECK ADD  CONSTRAINT [FK_PhieuNhap_ThongTinKho] FOREIGN KEY([MaKho])
REFERENCES [dbo].[ThongTinKho] ([MaKho])
GO
ALTER TABLE [dbo].[PhieuNhap] CHECK CONSTRAINT [FK_PhieuNhap_ThongTinKho]
GO
/****** Object:  ForeignKey [FK_SanPham_LoaiSP]    Script Date: 06/01/2020 09:13:24 ******/
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_SanPham_LoaiSP] FOREIGN KEY([MaLoai])
REFERENCES [dbo].[LoaiSP] ([MaLoai])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK_SanPham_LoaiSP]
GO
/****** Object:  ForeignKey [FK_SanPham_NhaCungCap]    Script Date: 06/01/2020 09:13:24 ******/
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_SanPham_NhaCungCap] FOREIGN KEY([MaNhaCC])
REFERENCES [dbo].[NhaCungCap] ([MaNhaCC])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK_SanPham_NhaCungCap]
GO
/****** Object:  ForeignKey [FK_SanPham_SanPham]    Script Date: 06/01/2020 09:13:24 ******/
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_SanPham_SanPham] FOREIGN KEY([MaNhap])
REFERENCES [dbo].[PhieuNhap] ([MaNhap])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK_SanPham_SanPham]
GO
/****** Object:  ForeignKey [FK_PhieuXuat_NguoiDung]    Script Date: 06/01/2020 09:13:27 ******/
ALTER TABLE [dbo].[PhieuXuat]  WITH CHECK ADD  CONSTRAINT [FK_PhieuXuat_NguoiDung] FOREIGN KEY([MaND])
REFERENCES [dbo].[NguoiDung] ([MaND])
GO
ALTER TABLE [dbo].[PhieuXuat] CHECK CONSTRAINT [FK_PhieuXuat_NguoiDung]
GO
/****** Object:  ForeignKey [FK_PhieuXuat_SanPham]    Script Date: 06/01/2020 09:13:27 ******/
ALTER TABLE [dbo].[PhieuXuat]  WITH CHECK ADD  CONSTRAINT [FK_PhieuXuat_SanPham] FOREIGN KEY([MaSP])
REFERENCES [dbo].[SanPham] ([MaSP])
GO
ALTER TABLE [dbo].[PhieuXuat] CHECK CONSTRAINT [FK_PhieuXuat_SanPham]
GO
/****** Object:  ForeignKey [FK_PhieuXuat_ThongTinKho]    Script Date: 06/01/2020 09:13:27 ******/
ALTER TABLE [dbo].[PhieuXuat]  WITH CHECK ADD  CONSTRAINT [FK_PhieuXuat_ThongTinKho] FOREIGN KEY([MaKho])
REFERENCES [dbo].[ThongTinKho] ([MaKho])
GO
ALTER TABLE [dbo].[PhieuXuat] CHECK CONSTRAINT [FK_PhieuXuat_ThongTinKho]
GO

-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Nov 15, 2018 at 05:05 PM
-- Server version: 5.7.23-0ubuntu0.16.04.1-log
-- PHP Version: 7.0.32-0ubuntu0.16.04.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `database_master`
--

-- --------------------------------------------------------

--
-- Table structure for table `detail_permintaan_pembelian`
--

CREATE TABLE `detail_permintaan_pembelian` (
  `nomor_bon` int(10) NOT NULL,
  `kode_barang` varchar(100) NOT NULL,
  `jumlah_dipesan` double NOT NULL,
  `unit` text NOT NULL,
  `jumlah_total` double NOT NULL,
  `unit_stok` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `detail_permintaan_pembelian`
--

INSERT INTO `detail_permintaan_pembelian` (`nomor_bon`, `kode_barang`, `jumlah_dipesan`, `unit`, `jumlah_total`, `unit_stok`) VALUES
(15112018, 'FOOD0001', 2, 'kardus', 100, 'piece');

-- --------------------------------------------------------

--
-- Table structure for table `master_bagian`
--

CREATE TABLE `master_bagian` (
  `kode_bagian` varchar(100) NOT NULL,
  `nama_bagian` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `master_bagian`
--

INSERT INTO `master_bagian` (`kode_bagian`, `nama_bagian`) VALUES
('BELI', 'Bagian Pembelian'),
('GUDA', 'Bagian Gudang'),
('HRD', 'Bagian HRD'),
('JUAL', 'Bagian Penjualan'),
('NET', 'Bagian Networking'),
('PROD', 'Bagian Produksi'),
('RT', 'Bagian Rumah Tangga'),
('UANG', 'Bagian Keuangan');

-- --------------------------------------------------------

--
-- Table structure for table `master_barang`
--

CREATE TABLE `master_barang` (
  `kode_barang` varchar(100) NOT NULL,
  `nama_barang` text NOT NULL,
  `unit1` text NOT NULL,
  `konversi_unit1` double NOT NULL,
  `unit2` text NOT NULL,
  `konversi_unit2` double NOT NULL,
  `unit_stok` text NOT NULL,
  `aktif` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `master_barang`
--

INSERT INTO `master_barang` (`kode_barang`, `nama_barang`, `unit1`, `konversi_unit1`, `unit2`, `konversi_unit2`, `unit_stok`, `aktif`) VALUES
('ATK0001', 'pulpen', 'karton', 12, 'kodi', 20, 'biji', 'y'),
('ATK0002', 'Pensil', 'kardus', 20, 'kotak', 20, 'biji', 'y'),
('ATK0003', 'Buku', 'Box', 100, 'pak', 10, 'buah', 'y'),
('ATK0004', 'Puzzle', 'Karton', 15, 'pak', 5, 'pcs', 'n'),
('FOOD0001', 'Minyak Sania', 'karton', 4, 'kardus', 10, 'piece', 'y');

-- --------------------------------------------------------

--
-- Table structure for table `permintaan_pembelian`
--

CREATE TABLE `permintaan_pembelian` (
  `nomor_bon` int(10) NOT NULL,
  `tanggal_bon` date NOT NULL,
  `kode_bagian_peminta` varchar(100) NOT NULL,
  `keterangan` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `permintaan_pembelian`
--

INSERT INTO `permintaan_pembelian` (`nomor_bon`, `tanggal_bon`, `kode_bagian_peminta`, `keterangan`) VALUES
(15112018, '2018-11-15', 'PROD', 'Bagian Produksi butuh pensil untuk bulan Desember.');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `detail_permintaan_pembelian`
--
ALTER TABLE `detail_permintaan_pembelian`
  ADD PRIMARY KEY (`nomor_bon`);

--
-- Indexes for table `master_barang`
--
ALTER TABLE `master_barang`
  ADD PRIMARY KEY (`kode_barang`);

--
-- Indexes for table `permintaan_pembelian`
--
ALTER TABLE `permintaan_pembelian`
  ADD PRIMARY KEY (`nomor_bon`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Nov 13, 2018 at 04:40 PM
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
-- Table structure for table `master_barang`
--

CREATE TABLE `master_barang` (
  `kode_barang` int(10) NOT NULL,
  `nama_barang` text NOT NULL,
  `unit_satu` text NOT NULL,
  `hasil_konversi_unit_satu` int(10) NOT NULL,
  `unit_dua` text NOT NULL,
  `hasil_konversi_unit_dua` int(10) NOT NULL,
  `unit_stok` text NOT NULL,
  `status_barang` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `master_barang`
--

INSERT INTO `master_barang` (`kode_barang`, `nama_barang`, `unit_satu`, `hasil_konversi_unit_satu`, `unit_dua`, `hasil_konversi_unit_dua`, `unit_stok`, `status_barang`) VALUES
(1, 'pulpen', 'karton', 12, 'kodi', 20, 'biji', 'aktif'),
(3, 'Pensil', 'kardus', 20, 'kotak', 20, 'biji', 'aktif'),
(5, 'Buku', 'Box', 100, 'pak', 10, 'buah', 'aktif'),
(6, 'Puzzle', 'Karton', 15, 'pak', 5, 'pcs', 'Tidak aktif');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `master_barang`
--
ALTER TABLE `master_barang`
  ADD PRIMARY KEY (`kode_barang`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `master_barang`
--
ALTER TABLE `master_barang`
  MODIFY `kode_barang` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

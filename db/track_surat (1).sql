-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 22, 2022 at 08:35 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.2.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `track_surat`
--

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(13);

-- --------------------------------------------------------

--
-- Table structure for table `role`
--

CREATE TABLE `role` (
  `id` bigint(20) NOT NULL,
  `nama_role` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `role`
--

INSERT INTO `role` (`id`, `nama_role`) VALUES
(1, 'SEKRETARIS ESELON II'),
(2, 'SEKRETARIS ESELON III');

-- --------------------------------------------------------

--
-- Table structure for table `surat`
--

CREATE TABLE `surat` (
  `id` bigint(20) NOT NULL,
  `asal_surat` varchar(255) DEFAULT NULL,
  `catatan_konseptor` varchar(255) DEFAULT NULL,
  `catatan_sekre_es2` varchar(255) DEFAULT NULL,
  `konseptor` varchar(255) DEFAULT NULL,
  `no_agenda` varchar(255) DEFAULT NULL,
  `no_surat` varchar(255) DEFAULT NULL,
  `perihal` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `tgl_surat` date DEFAULT NULL,
  `tujuan_surat` varchar(255) DEFAULT NULL,
  `last_update` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `surat`
--

INSERT INTO `surat` (`id`, `asal_surat`, `catatan_konseptor`, `catatan_sekre_es2`, `konseptor`, `no_agenda`, `no_surat`, `perihal`, `status`, `tgl_surat`, `tujuan_surat`, `last_update`) VALUES
(1, 'SUBDIREKTORAT PENGEMBANGAN SISTEM PENDUKUNG PERPAJAKAN', '-', '', 'ATRI HARIS', 'EF658911', 'KEP-27/PJ.12/2022', 'KEPUTUSAN DIREKTUR TIK TENTANG INOVASI APLIKASI KUNJUNG PAJAKA', '1', '2022-05-09', '3', '2022-05-23 01:24:08'),
(2, 'SUBBAGIAN TATA USAHA', '-', '', 'M. ANGGA PANJI', 'RS123763', 'KEP-29/PJ.12/2022', 'KEPUTUSAN DIREKTUR TIK TENTANG STANDAR PELAYANAN DI LINGKUNGAN DIREKTORAT TEKNOLOGI INFORMASI DAN KOMUNIKASI', '1', '2022-05-09', '3', '2022-05-23 01:32:46'),
(3, 'SUBBAGIAN TATA USAHA', 'Diberikan kepada TIM ZIWBK Subtim 6', '', 'DIKNAWATY', 'RS820601', 'KEP-26/PJ.12/2022', 'KEPUTUSAN DIREKTUR TIK TENTANG PENETAPAN PELAKSANA TERBAIK DAN PRANATA KOMPUTER TERBAIK DALAM PROGRAM PENGHARGAAN PEGAWAI DILINGKUNGAN DIT. TIK PERIODE JULI-DESEMBER 2021', '1', '2022-05-09', '3', '2022-05-23 01:35:22');

-- --------------------------------------------------------

--
-- Table structure for table `unit_kerja`
--

CREATE TABLE `unit_kerja` (
  `id` bigint(20) NOT NULL,
  `nama_unit` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `unit_kerja`
--

INSERT INTO `unit_kerja` (`id`, `nama_unit`) VALUES
(1, 'SUBDIREKTORAT PENGEMBANGAN SISTEM PENDUKUNG PERPAJAKAN'),
(2, 'SUBDIREKTORAT TATA KELOLA SISTEM INFORMASI'),
(3, 'DIREKTORAT TIK');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `nip` varchar(255) NOT NULL,
  `nama_pegawai` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `kode_role_id` bigint(20) DEFAULT NULL,
  `kode_uni_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `nip`, `nama_pegawai`, `password`, `kode_role_id`, `kode_uni_id`) VALUES
(1, '917330309', 'Novita Vera Hardianty Hasibuan', '123456', 2, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `surat`
--
ALTER TABLE `surat`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `unit_kerja`
--
ALTER TABLE `unit_kerja`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `nip` (`nip`),
  ADD KEY `kode_role_id` (`kode_role_id`),
  ADD KEY `FKantxaicftbb7vnjs3nrnghp16` (`kode_uni_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `role`
--
ALTER TABLE `role`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `surat`
--
ALTER TABLE `surat`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `unit_kerja`
--
ALTER TABLE `unit_kerja`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `FKantxaicftbb7vnjs3nrnghp16` FOREIGN KEY (`kode_uni_id`) REFERENCES `unit_kerja` (`id`),
  ADD CONSTRAINT `user_ibfk_1` FOREIGN KEY (`kode_role_id`) REFERENCES `role` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

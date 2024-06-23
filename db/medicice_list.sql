-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 19, 2024 at 06:21 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `medicine`
--

-- --------------------------------------------------------

--
-- Table structure for table `medicice_list`
--

CREATE TABLE `medicice_list` (
  `Id` int(100) NOT NULL,
  `Product_Name` varchar(100) NOT NULL,
  `Quantity` int(100) NOT NULL,
  `Price` double NOT NULL,
  `Date_Manufactured` varchar(100) NOT NULL,
  `Date_Expiration` varchar(100) NOT NULL,
  `Type` varchar(100) NOT NULL,
  `Status` varchar(100) NOT NULL,
  `Availability` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `medicice_list`
--

INSERT INTO `medicice_list` (`Id`, `Product_Name`, `Quantity`, `Price`, `Date_Manufactured`, `Date_Expiration`, `Type`, `Status`, `Availability`) VALUES
(3, 'salbotamol', 50, 20, '5/12/2024', '5/12/2030', 'Liquid', 'Not Expired', 'On Stock'),
(4, 'Ambroxol', 50, 50, '12/12/2022', '05/22/2025', 'Liquid', 'Not Expired', 'Out of Stock');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `medicice_list`
--
ALTER TABLE `medicice_list`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `medicice_list`
--
ALTER TABLE `medicice_list`
  MODIFY `Id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

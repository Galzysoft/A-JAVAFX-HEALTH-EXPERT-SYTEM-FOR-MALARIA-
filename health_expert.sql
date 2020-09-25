-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 02, 2018 at 11:56 PM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `health_expert`
--

-- --------------------------------------------------------

--
-- Table structure for table `patients_info`
--

CREATE TABLE `patients_info` (
  `name` varchar(50) NOT NULL,
  `phone` varchar(13) NOT NULL,
  `address` varchar(50) NOT NULL,
  `age` varchar(8) NOT NULL,
  `gender` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patients_info`
--

INSERT INTO `patients_info` (`name`, `phone`, `address`, `age`, `gender`) VALUES
('ddd', 'ddd', 'cccccc', '44', 'FEMALE'),
('ben', '099999599595', 'afiaimo', '46', 'MALE'),
('aa', 'sss', 'eee', '33', 'MALE'),
('ss', '89899', 'hhhhh', '89', 'FEMALE'),
('perculiar', '09098777777', 'bshops', '34', 'FEMALE');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

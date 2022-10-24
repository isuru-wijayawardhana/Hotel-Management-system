-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 01, 2021 at 11:28 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.3.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotel`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` int(11) NOT NULL,
  `name` varchar(200) NOT NULL,
  `mobileNumber` varchar(200) NOT NULL,
  `nationality` varchar(200) NOT NULL,
  `gender` varchar(50) NOT NULL,
  `email` varchar(200) NOT NULL,
  `idProof` varchar(200) NOT NULL,
  `address` varchar(300) NOT NULL,
  `checkIn` varchar(50) NOT NULL,
  `roomNo` varchar(10) NOT NULL,
  `bed` varchar(200) NOT NULL,
  `roomType` varchar(200) NOT NULL,
  `pricePerDay` int(11) NOT NULL,
  `noOfDaysStay` int(11) DEFAULT NULL,
  `totalAmount` varchar(200) DEFAULT NULL,
  `checkOut` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `name`, `mobileNumber`, `nationality`, `gender`, `email`, `idProof`, `address`, `checkIn`, `roomNo`, `bed`, `roomType`, `pricePerDay`, `noOfDaysStay`, `totalAmount`, `checkOut`) VALUES
(1, 'Dumindu', '07123456789', 'Sri Lnka', 'Male', 'dilahan@gmail.com', '123456789v', 'South,Beliatta', '2021/04/25', '007', 'Single', 'A/C', 1500, 2, '3000.0', '2021/04/26'),
(2, 'Nuwan', '071445522365', 'Sri Lanka', 'Male', 'nuwan@gmail.com', '1234668525v', 'Hakmana Road,Matara', '2021/04/25', '004', 'Double', 'A/C', 2000, 5, '10000.0', '2021/04/29'),
(3, 'Prathibah', '07154265853', 'India', 'Female', 'prathibha123@gmail.com', '12345698522', 'Chennai,India', '2021/04/26', '001', 'Single', 'A/C', 1000, NULL, NULL, NULL),
(4, 'Saman', '07715426852', 'Srilanka', 'Male', 'kaml@gmail.com', '41256825655v', 'Tangalla road,Matara', '2021/04/26', '007', 'Single', 'A/C', 1500, 1, '1500.0', '2021/04/26'),
(5, 'Santha', '01155475865', 'Sri Lanka', 'Male', 'santhgmail.com', '125498566399v', 'Suhada mawatha,Galle', '2021/04/26', '010', 'Single', 'Non A/C', 2500, NULL, NULL, NULL),
(6, 'Dilki', '07154258955', 'Sri Lanka', 'Female', 'dilki@gmail.com', '545345645687v', 'Beliatta,Hambanthotta', '2021/04/30', '004', 'Double', 'A/C', 2000, NULL, NULL, NULL),
(7, 'Saman', '0145656', 'SriLanka', 'Male', 'saman@gmail.com', '1564661458v', 'Matara,road samagi', '2021/04/30', '015', 'Double', 'A/C', 5000, NULL, NULL, NULL),
(8, 'sumane', '0774581268', 'India', 'Male', 'sumane@gmail.com', '125845895v', 'Dilli', '2021/04/30', '017', 'Double', 'Non A/C', 3000, NULL, NULL, NULL),
(9, 'Lakindu', '07154268569', 'Sri Lanka', 'Male', 'lakindu@gmail.com', '21548698v', 'Lkindu,Matara', '2021/05/01', '022', 'Triple', 'A/C', 3000, 1, '3000.0', '2021/05/01'),
(10, 'Saduni', '071585788456', 'Sri Lnka', 'Female', 'saduni@gmail.com', '1255458965v', 'Samagi mawatha,Hambanthota', '2021/05/01', '012', 'Double', 'A/C', 2000, 1, '2000.0', '2021/05/01');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `userid` int(11) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`userid`, `username`, `password`) VALUES
(1, 'Isuru', '123'),
(2, 'Anuranga', '1234'),
(3, 'Wijayawardhana', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `roomNo` varchar(10) NOT NULL,
  `roomType` varchar(200) NOT NULL,
  `bed` varchar(200) NOT NULL,
  `price` int(11) NOT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`roomNo`, `roomType`, `bed`, `price`, `status`) VALUES
('001', 'A/C', 'Single', 1000, 'Booked'),
('002', 'A/C', 'Single', 1000, 'Not Booked'),
('003', 'Non A/C', 'Double', 800, 'Not Booked'),
('004', 'A/C', 'Double', 2000, 'Booked'),
('005', 'Non A/C', 'Triple', 5000, 'Not Booked'),
('006', 'A/C', 'Triple', 7000, 'Not Booked'),
('007', 'A/C', 'Single', 1500, 'Not Booked'),
('008', 'Non A/C', 'Single', 850, 'Not Booked'),
('009', 'Non A/C', 'Triple', 2500, 'Not Booked'),
('010', 'Non A/C', 'Single', 2500, 'Booked'),
('011', 'Non A/C', 'Triple', 5000, 'Not Booked'),
('012', 'A/C', 'Double', 2000, 'Not Booked'),
('013', 'A/C', 'Single', 2000, 'Not Booked'),
('014', 'A/C', 'Single', 20000, 'Not Booked'),
('015', 'A/C', 'Double', 5000, 'Booked'),
('016', 'A/C', 'Single', 2000, 'Not Booked'),
('017', 'Non A/C', 'Double', 3000, 'Booked'),
('018', 'Non A/C', 'Single', 2200, 'Not Booked'),
('019', 'A/C', 'Double', 3500, 'Not Booked'),
('020', 'A/C', 'Single', 1000, 'Not Booked'),
('022', 'A/C', 'Triple', 3000, 'Not Booked'),
('023', 'A/C', 'Single', 1000, 'Not Booked'),
('025', 'A/C', 'Triple', 6000, 'Not Booked');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`userid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `userid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

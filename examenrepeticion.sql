-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-01-2022 a las 22:55:19
-- Versión del servidor: 10.4.17-MariaDB
-- Versión de PHP: 7.3.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `examenrepeticion`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `chocolates`
--
CREATE DATABASE `examenrepeticion`;

CREATE TABLE `chocolates` (
  `idChocolate` int(10) NOT NULL,
  `nombreChocolate` varchar(30) NOT NULL,
  `PrecioChocolate` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `chocolates`
--

INSERT INTO `chocolates` (`idChocolate`, `nombreChocolate`, `PrecioChocolate`) VALUES
(1, 'cacao', '100'),
(2, 'cacao 100%', '5000'),
(3, ' costa rama negro', '5000 '),
(4, ' costa rama blanco', '3500 '),
(5, ' negro 99% cacao + leche', '15200 '),
(7, 'cacao bueno', '1546'),
(8, ' Golden nust', '1500 ');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `chocolates`
--
ALTER TABLE `chocolates`
  ADD PRIMARY KEY (`idChocolate`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `chocolates`
--
ALTER TABLE `chocolates`
  MODIFY `idChocolate` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

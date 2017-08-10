-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-08-2017 a las 14:42:51
-- Versión del servidor: 5.7.14
-- Versión de PHP: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bookingexodias`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bebidas`
--

CREATE TABLE `bebidas` (
  `id_Bebidas` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `price` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `bebidas`
--

INSERT INTO `bebidas` (`id_Bebidas`, `name`, `price`) VALUES
(1, 'Cafe', 25.5),
(2, 'Chocolate', 15.5),
(3, 'Te', 20),
(4, 'Leche Azul', 24),
(5, 'Health', 68),
(6, 'Limonada', 27),
(7, 'Fanta', 25),
(8, 'Cerveza', 35),
(9, 'Mana', 27),
(10, 'Licuados', 25);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle`
--

CREATE TABLE `detalle` (
  `id_detalle` int(11) NOT NULL,
  `id_alimento` int(11) DEFAULT NULL,
  `id_orden` int(11) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `tipo` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `detalle`
--

INSERT INTO `detalle` (`id_detalle`, `id_alimento`, `id_orden`, `cantidad`, `tipo`) VALUES
(12, 1, 4, 1, 'bebida'),
(13, 2, 4, 1, 'comida'),
(14, 3, 4, 1, 'postre'),
(15, 2, 5, 3, 'bebida'),
(16, 4, 5, 3, 'comida'),
(17, 3, 6, 2, 'bebida'),
(18, 9, 6, 2, 'comida'),
(19, 2, 6, 1, 'postre'),
(20, 8, 7, 2, 'bebida'),
(21, 9, 7, 2, 'comida'),
(22, 3, 7, 2, 'postre'),
(23, 7, 8, 2, 'bebida'),
(24, 9, 8, 4, 'comida'),
(25, 2, 8, 1, 'postre'),
(26, 1, 9, 1, 'bebida'),
(27, 8, 9, 1, 'bebida'),
(28, 2, 9, 1, 'comida'),
(29, 3, 9, 2, 'postre'),
(34, 6, 11, 1, 'bebida'),
(35, 2, 11, 1, 'comida'),
(36, 4, 11, 1, 'postre'),
(37, 3, 12, 2, 'bebida'),
(38, 3, 12, 2, 'comida'),
(39, 5, 12, 2, 'postre'),
(40, 6, 13, 2, 'bebida'),
(41, 7, 13, 3, 'bebida'),
(42, 8, 13, 2, 'bebida'),
(43, 4, 13, 2, 'comida'),
(44, 5, 13, 3, 'comida'),
(45, 10, 13, 3, 'comida'),
(46, 1, 13, 3, 'postre'),
(47, 2, 13, 3, 'postre'),
(48, 3, 13, 1, 'postre'),
(53, 1, 15, 1, 'bebida'),
(54, 10, 15, 2, 'bebida'),
(55, 1, 15, 2, 'comida'),
(56, 2, 15, 1, 'comida'),
(57, 2, 15, 1, 'postre'),
(58, 3, 15, 1, 'postre'),
(59, 4, 15, 1, 'postre'),
(60, 8, 16, 2, 'bebida'),
(61, 9, 16, 2, 'bebida'),
(62, 2, 16, 1, 'comida'),
(63, 5, 16, 2, 'comida'),
(64, 7, 16, 1, 'comida'),
(65, 9, 16, 1, 'comida'),
(66, 3, 16, 3, 'postre'),
(67, 4, 16, 2, 'postre'),
(68, 6, 17, 1, 'bebida'),
(69, 8, 17, 1, 'comida'),
(70, 4, 17, 1, 'postre'),
(71, 7, 18, 3, 'bebida'),
(72, 8, 18, 1, 'bebida'),
(73, 8, 18, 2, 'comida'),
(74, 9, 18, 2, 'comida'),
(75, 1, 18, 1, 'postre'),
(76, 5, 18, 1, 'postre'),
(77, 4, 19, 1, 'bebida'),
(78, 9, 19, 1, 'comida'),
(79, 3, 19, 1, 'postre'),
(80, 1, 20, 3, 'bebida'),
(81, 10, 20, 2, 'bebida'),
(82, 1, 20, 1, 'comida'),
(83, 2, 20, 1, 'comida'),
(84, 3, 20, 1, 'comida'),
(85, 4, 20, 1, 'comida'),
(86, 6, 20, 1, 'comida'),
(87, 2, 20, 1, 'postre'),
(88, 3, 20, 2, 'postre'),
(89, 4, 20, 3, 'postre'),
(90, 7, 21, 2, 'bebida'),
(91, 8, 21, 2, 'bebida'),
(92, 7, 21, 1, 'comida'),
(93, 9, 21, 3, 'comida'),
(94, 2, 21, 1, 'postre'),
(95, 3, 21, 2, 'postre'),
(96, 4, 21, 1, 'postre'),
(97, 3, 23, 1, 'bebida'),
(98, 2, 23, 2, 'bebida'),
(99, 1, 23, 1, 'comida'),
(100, 2, 23, 1, 'comida'),
(101, 3, 23, 1, 'comida'),
(102, 2, 23, 2, 'postre'),
(103, 3, 23, 1, 'postre'),
(104, 2, 22, 1, 'bebida'),
(105, 2, 22, 1, 'comida'),
(106, 4, 22, 1, 'postre'),
(107, 3, 24, 1, 'bebida'),
(108, 2, 24, 1, 'bebida'),
(109, 4, 24, 1, 'bebida'),
(110, 2, 24, 1, 'comida'),
(111, 3, 24, 2, 'comida'),
(112, 2, 24, 1, 'postre'),
(113, 4, 24, 2, 'postre'),
(122, 9, 26, 2, 'bebida'),
(123, 9, 26, 2, 'comida'),
(124, 2, 26, 2, 'postre'),
(125, 7, 27, 2, 'bebida'),
(126, 7, 27, 2, 'comida'),
(127, 3, 27, 1, 'postre'),
(128, 1, 28, 5, 'bebida'),
(129, 1, 28, 5, 'comida'),
(130, 4, 28, 5, 'postre'),
(131, 6, 29, 5, 'bebida'),
(132, 7, 29, 2, 'bebida'),
(133, 8, 29, 2, 'bebida'),
(134, 7, 29, 1, 'comida'),
(135, 8, 29, 5, 'comida'),
(136, 9, 29, 1, 'comida'),
(137, 2, 29, 2, 'postre'),
(138, 3, 29, 2, 'postre'),
(139, 4, 29, 2, 'postre'),
(140, 5, 29, 2, 'postre'),
(141, 3, 30, 2, 'bebida'),
(142, 2, 30, 3, 'bebida'),
(143, 4, 30, 2, 'bebida'),
(144, 3, 30, 3, 'comida'),
(145, 7, 30, 4, 'comida'),
(146, 2, 30, 2, 'postre'),
(147, 3, 30, 2, 'postre'),
(148, 4, 30, 2, 'postre'),
(149, 3, 31, 2, 'bebida'),
(150, 1, 31, 3, 'bebida'),
(151, 1, 31, 2, 'comida'),
(152, 2, 31, 1, 'comida'),
(153, 3, 31, 2, 'comida'),
(154, 3, 31, 5, 'postre'),
(155, 3, 32, 5, 'bebida'),
(156, 8, 32, 5, 'bebida'),
(157, 8, 32, 7, 'comida'),
(158, 9, 32, 5, 'comida'),
(159, 2, 32, 5, 'postre'),
(160, 3, 32, 4, 'postre'),
(161, 4, 32, 2, 'postre'),
(162, 1, 33, 5, 'bebida'),
(163, 6, 33, 1, 'bebida'),
(164, 2, 33, 2, 'comida'),
(165, 3, 33, 2, 'comida'),
(166, 4, 33, 2, 'comida'),
(167, 2, 33, 2, 'postre'),
(168, 3, 33, 2, 'postre'),
(169, 4, 33, 2, 'postre'),
(170, 6, 34, 10, 'bebida'),
(171, 7, 34, 10, 'bebida'),
(172, 8, 34, 10, 'bebida'),
(173, 9, 34, 10, 'bebida'),
(174, 5, 34, 10, 'comida'),
(175, 7, 34, 10, 'comida'),
(176, 8, 34, 10, 'comida'),
(177, 9, 34, 25, 'comida'),
(178, 2, 34, 20, 'postre'),
(179, 3, 34, 10, 'postre'),
(180, 4, 34, 25, 'postre'),
(181, 6, 34, 10, 'bebida'),
(182, 7, 34, 10, 'bebida'),
(183, 8, 34, 10, 'bebida'),
(184, 9, 34, 10, 'bebida'),
(185, 5, 34, 10, 'comida'),
(186, 7, 34, 10, 'comida'),
(187, 8, 34, 10, 'comida'),
(188, 9, 34, 25, 'comida'),
(189, 2, 34, 20, 'postre'),
(190, 3, 34, 10, 'postre'),
(191, 4, 34, 25, 'postre'),
(192, 3, 35, 2, 'bebida'),
(193, 2, 35, 2, 'bebida'),
(194, 1, 35, 2, 'bebida'),
(195, 1, 35, 2, 'comida'),
(196, 2, 35, 2, 'comida'),
(197, 3, 35, 2, 'comida'),
(198, 4, 35, 5, 'comida'),
(199, 2, 35, 5, 'postre'),
(200, 4, 35, 5, 'postre'),
(201, 6, 36, 2, 'bebida'),
(202, 8, 36, 15, 'bebida'),
(203, 5, 36, 10, 'comida'),
(204, 9, 36, 3, 'comida'),
(205, 10, 36, 5, 'comida'),
(206, 1, 36, 2, 'postre'),
(207, 3, 36, 2, 'postre'),
(208, 5, 36, 2, 'postre'),
(209, 3, 37, 1, 'bebida'),
(210, 1, 37, 1, 'bebida'),
(211, 4, 37, 1, 'comida'),
(212, 7, 37, 1, 'comida'),
(213, 3, 37, 2, 'postre'),
(214, 6, 38, 2, 'bebida'),
(215, 7, 38, 2, 'bebida'),
(216, 8, 38, 2, 'bebida'),
(217, 2, 38, 2, 'comida'),
(218, 3, 38, 5, 'comida'),
(219, 1, 38, 2, 'postre'),
(220, 3, 38, 1, 'postre'),
(221, 4, 38, 1, 'postre'),
(222, 6, 39, 20, 'bebida'),
(223, 7, 39, 20, 'bebida'),
(224, 8, 39, 20, 'bebida'),
(225, 7, 39, 15, 'comida'),
(226, 8, 39, 20, 'comida'),
(227, 9, 39, 15, 'comida'),
(228, 2, 39, 15, 'postre'),
(229, 3, 39, 15, 'postre'),
(230, 4, 39, 20, 'postre'),
(231, 8, 40, 5, 'bebida'),
(232, 8, 40, 2, 'comida'),
(233, 9, 40, 2, 'comida'),
(234, 10, 40, 1, 'comida'),
(235, 5, 40, 5, 'postre'),
(236, 6, 41, 3, 'bebida'),
(237, 7, 41, 1, 'bebida'),
(238, 8, 41, 2, 'bebida'),
(239, 7, 41, 3, 'comida'),
(240, 8, 41, 1, 'comida'),
(241, 9, 41, 1, 'comida'),
(242, 10, 41, 1, 'comida'),
(243, 2, 41, 2, 'postre'),
(244, 3, 41, 2, 'postre'),
(245, 4, 41, 2, 'postre'),
(246, 8, 42, 2, 'bebida'),
(247, 9, 42, 1, 'bebida'),
(248, 8, 42, 1, 'comida'),
(249, 9, 42, 1, 'comida'),
(250, 10, 42, 1, 'comida'),
(251, 3, 42, 1, 'postre'),
(252, 4, 42, 2, 'postre'),
(253, 3, 43, 1, 'bebida'),
(254, 1, 43, 1, 'bebida'),
(255, 4, 43, 1, 'bebida'),
(256, 1, 43, 2, 'comida'),
(257, 2, 43, 1, 'comida'),
(258, 3, 43, 2, 'comida'),
(259, 2, 43, 2, 'postre'),
(260, 4, 43, 2, 'postre'),
(261, 6, 44, 1, 'bebida'),
(262, 7, 44, 1, 'bebida'),
(263, 8, 44, 1, 'bebida'),
(264, 5, 44, 1, 'comida'),
(265, 9, 44, 1, 'comida'),
(266, 10, 44, 1, 'comida'),
(267, 2, 44, 1, 'postre'),
(268, 3, 44, 1, 'postre'),
(269, 4, 44, 1, 'postre'),
(270, 6, 45, 1, 'bebida'),
(271, 7, 45, 1, 'bebida'),
(272, 8, 45, 1, 'bebida'),
(273, 9, 45, 1, 'bebida'),
(274, 4, 45, 1, 'comida'),
(275, 5, 45, 2, 'comida'),
(276, 8, 45, 1, 'comida'),
(277, 9, 45, 1, 'comida'),
(278, 10, 45, 2, 'comida'),
(279, 1, 45, 2, 'postre'),
(280, 2, 45, 1, 'postre'),
(281, 3, 45, 1, 'postre'),
(282, 4, 45, 1, 'postre'),
(283, 5, 45, 1, 'postre'),
(284, 6, 46, 3, 'bebida'),
(285, 7, 46, 1, 'bebida'),
(286, 8, 46, 2, 'bebida'),
(287, 7, 46, 3, 'comida'),
(288, 8, 46, 3, 'comida'),
(289, 9, 46, 3, 'comida'),
(290, 1, 46, 1, 'postre'),
(291, 2, 46, 2, 'postre'),
(292, 3, 46, 2, 'postre'),
(293, 4, 46, 2, 'postre'),
(294, 7, 47, 2, 'bebida'),
(295, 8, 47, 2, 'bebida'),
(296, 8, 47, 2, 'comida'),
(297, 9, 47, 2, 'comida'),
(298, 3, 47, 2, 'postre'),
(299, 4, 47, 2, 'postre'),
(300, 6, 48, 11, 'bebida'),
(301, 7, 48, 1, 'bebida'),
(302, 8, 48, 2, 'bebida'),
(303, 7, 48, 1, 'comida'),
(304, 8, 48, 1, 'comida'),
(305, 9, 48, 1, 'comida'),
(306, 10, 48, 1, 'comida'),
(307, 2, 48, 1, 'postre'),
(308, 3, 48, 2, 'postre'),
(309, 4, 48, 2, 'postre'),
(313, 7, 50, 2, 'bebida'),
(314, 7, 50, 2, 'bebida'),
(315, 8, 50, 3, 'bebida'),
(316, 8, 50, 3, 'bebida'),
(317, 9, 50, 2, 'bebida'),
(318, 9, 50, 2, 'bebida'),
(319, 3, 50, 2, 'comida'),
(320, 3, 50, 2, 'comida'),
(321, 4, 50, 1, 'comida'),
(322, 4, 50, 1, 'comida'),
(323, 9, 50, 2, 'comida'),
(324, 9, 50, 2, 'comida'),
(325, 10, 50, 2, 'comida'),
(326, 10, 50, 2, 'comida'),
(327, 2, 50, 1, 'postre'),
(328, 2, 50, 1, 'postre'),
(329, 3, 50, 3, 'postre'),
(330, 3, 50, 3, 'postre'),
(331, 4, 50, 3, 'postre'),
(332, 4, 50, 3, 'postre'),
(333, 3, 51, 2, 'bebida'),
(334, 2, 51, 1, 'bebida'),
(335, 1, 51, 1, 'bebida'),
(336, 1, 51, 1, 'comida'),
(337, 2, 51, 1, 'comida'),
(338, 3, 51, 2, 'comida'),
(339, 1, 51, 1, 'postre'),
(340, 2, 51, 1, 'postre'),
(341, 3, 51, 1, 'postre'),
(342, 4, 51, 1, 'postre'),
(343, 5, 51, 1, 'postre'),
(347, 2, 52, 2, 'bebida'),
(348, 3, 52, 3, 'comida'),
(349, 3, 52, 1, 'postre'),
(350, 4, 52, 1, 'postre'),
(351, 8, 14, 10, 'bebida'),
(352, 9, 14, 2, 'comida'),
(353, 10, 14, 2, 'comida'),
(354, 2, 14, 5, 'postre'),
(355, 4, 14, 3, 'postre'),
(356, 4, 54, 3, 'bebida'),
(357, 1, 54, 1, 'comida'),
(358, 3, 54, 1, 'postre'),
(359, 4, 54, 3, 'bebida'),
(360, 1, 54, 1, 'comida'),
(361, 3, 54, 1, 'postre'),
(362, 4, 55, 2, 'bebida'),
(363, 1, 55, 1, 'comida'),
(364, 8, 55, 3, 'comida'),
(365, 4, 55, 2, 'postre'),
(366, 2, 57, 2, 'bebida'),
(367, 3, 57, 2, 'comida'),
(368, 10, 57, 1, 'comida'),
(369, 4, 57, 2, 'postre'),
(409, 8, 10, 3, 'bebida'),
(410, 4, 10, 1, 'comida'),
(411, 8, 10, 1, 'comida'),
(412, 2, 10, 1, 'postre'),
(413, 6, 25, 1, 'bebida'),
(414, 7, 25, 2, 'bebida'),
(415, 8, 25, 2, 'bebida'),
(416, 5, 25, 1, 'comida'),
(417, 7, 25, 3, 'comida'),
(418, 8, 25, 1, 'comida'),
(419, 3, 25, 2, 'postre'),
(420, 5, 25, 2, 'postre'),
(426, 3, 60, 5, 'bebida'),
(427, 3, 60, 5, 'comida'),
(428, 3, 60, 2, 'postre');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `orden`
--

CREATE TABLE `orden` (
  `id_orden` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `total` varchar(45) DEFAULT NULL,
  `id_tiempo` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT '1' COMMENT '1 - Abierta\n2 - Cerrada\n3 - Cocina'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `orden`
--

INSERT INTO `orden` (`id_orden`, `nombre`, `total`, `id_tiempo`, `status`) VALUES
(4, 'Luis', '118.5', 1, 3),
(5, 'Martin', '226.5', 3, 3),
(6, 'Ricardo', '265', 3, 3),
(7, 'Kenshiro', '316', 3, 3),
(8, 'Saitama', '485', 1, 2),
(9, 'Angel', '171.5', 1, 2),
(10, 'Juan', '245', 3, 3),
(11, 'Alberto', '117', 2, 1),
(12, 'Maria', '190', 1, 3),
(13, 'Jose', '907', 2, 1),
(14, 'Luis', '890', 3, 1),
(15, 'Omar', '378.5', 1, 1),
(16, 'Jesus', '538', 2, 1),
(17, 'Daniel', '107', 2, 1),
(18, 'Cesar', '490', 2, 1),
(19, 'Alejandra', '147', 3, 1),
(20, 'Juana', '572.5', 1, 1),
(21, 'Carlos', '561', 2, 1),
(22, 'Juan', '105.5', 3, 1),
(23, 'Fernando', '324', 1, 1),
(24, 'Julio', '299.5', 1, 1),
(25, 'Ruben', '503', 2, 3),
(26, 'Fernanda', '294', 3, 3),
(27, 'Frida', '188', 2, 3),
(28, 'Brenda', '652.5', 1, 3),
(29, 'Juan', '871', 2, 3),
(30, 'Benito', '650.5', 1, 3),
(31, 'Mario', '581.5', 3, 3),
(32, 'Roberto', '1432', 3, 1),
(33, 'Pablo', '640.5', 2, 1),
(34, 'Joseline', '6320', 1, 3),
(35, 'Luis', '1022', 2, 1),
(36, 'Jofiel', '1985', 3, 3),
(37, 'Raul', '201.5', 1, 1),
(38, 'Eduardo', '707', 2, 1),
(39, 'Martin', '6310', 3, 1),
(40, 'Rafael', '695', 3, 1),
(41, 'Alberto', '727', 3, 1),
(42, 'Jorge', '420', 3, 3),
(43, 'Jacinto ', '504.5', 1, 1),
(44, 'Carmen', '390', 2, 1),
(45, 'Carlos', '757', 2, 3),
(46, 'Hector', '987', 3, 1),
(47, 'Martin', '526', 2, 3),
(48, 'Ascencio', '808', 3, 1),
(50, 'Angel', '923', 1, 3),
(51, 'Juana', '454', 1, 1),
(52, 'Pedrito', '244', 1, 1),
(53, 'Armando', '231', 1, 1),
(54, 'Carlos', '180', 2, 2),
(55, 'Moyete-san', '363', 2, 2),
(57, 'Carlos-sama', '286', 1, 2),
(60, 'Lord Virtusius', '436', 2, 3);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `orderdetail`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `orderdetail` (
`id_orden` int(11)
,`nombre` varchar(45)
,`id_tiempo` int(11)
,`name` varchar(45)
,`cantidad` int(11)
,`price` float
);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `platillos`
--

CREATE TABLE `platillos` (
  `id_Platillos` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `price` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `platillos`
--

INSERT INTO `platillos` (`id_Platillos`, `name`, `price`) VALUES
(1, 'Waffles', 90),
(2, 'Huevos', 75),
(3, 'Hot-cakes', 60),
(4, 'Mollete', 60),
(5, 'Tacos', 45),
(6, 'Enchiladas', 65),
(7, 'Tortas', 60),
(8, 'Pechuga', 65),
(9, 'Lomo', 105),
(10, 'New-York', 105);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `postres`
--

CREATE TABLE `postres` (
  `id_Postres` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `price` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `postres`
--

INSERT INTO `postres` (`id_Postres`, `name`, `price`) VALUES
(1, 'Flan', 25),
(2, 'Gelatina', 15),
(3, 'Pay', 18),
(4, 'Pastel', 15),
(5, 'Galleta', 15);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tiempo`
--

CREATE TABLE `tiempo` (
  `id_Tiempo` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tiempo`
--

INSERT INTO `tiempo` (`id_Tiempo`, `name`) VALUES
(1, 'Desayuno'),
(2, 'Comida'),
(3, 'Cena');

-- --------------------------------------------------------

--
-- Estructura para la vista `orderdetail`
--
DROP TABLE IF EXISTS `orderdetail`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `orderdetail`  AS  select `orden`.`id_orden` AS `id_orden`,`orden`.`nombre` AS `nombre`,`orden`.`id_tiempo` AS `id_tiempo`,`bebidas`.`name` AS `name`,`detalle`.`cantidad` AS `cantidad`,`bebidas`.`price` AS `price` from ((`orden` join `detalle` on((`orden`.`id_orden` = `detalle`.`id_orden`))) join `bebidas` on((`bebidas`.`id_Bebidas` = `detalle`.`id_alimento`))) where (`detalle`.`tipo` = 'bebida') union select `orden`.`id_orden` AS `id_orden`,`orden`.`nombre` AS `nombre`,`orden`.`id_tiempo` AS `id_tiempo`,`platillos`.`name` AS `name`,`detalle`.`cantidad` AS `cantidad`,`platillos`.`price` AS `price` from ((`orden` join `detalle` on((`orden`.`id_orden` = `detalle`.`id_orden`))) join `platillos` on((`platillos`.`id_Platillos` = `detalle`.`id_alimento`))) where (`detalle`.`tipo` = 'comida') union select `orden`.`id_orden` AS `id_orden`,`orden`.`nombre` AS `nombre`,`orden`.`id_tiempo` AS `id_tiempo`,`postres`.`name` AS `name`,`detalle`.`cantidad` AS `cantidad`,`postres`.`price` AS `price` from ((`orden` join `detalle` on((`orden`.`id_orden` = `detalle`.`id_orden`))) join `postres` on((`postres`.`id_Postres` = `detalle`.`id_alimento`))) where (`detalle`.`tipo` = 'postre') ;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bebidas`
--
ALTER TABLE `bebidas`
  ADD PRIMARY KEY (`id_Bebidas`);

--
-- Indices de la tabla `detalle`
--
ALTER TABLE `detalle`
  ADD PRIMARY KEY (`id_detalle`),
  ADD KEY `orden` (`id_orden`);

--
-- Indices de la tabla `orden`
--
ALTER TABLE `orden`
  ADD PRIMARY KEY (`id_orden`),
  ADD KEY `tiempo` (`id_tiempo`);

--
-- Indices de la tabla `platillos`
--
ALTER TABLE `platillos`
  ADD PRIMARY KEY (`id_Platillos`);

--
-- Indices de la tabla `postres`
--
ALTER TABLE `postres`
  ADD PRIMARY KEY (`id_Postres`);

--
-- Indices de la tabla `tiempo`
--
ALTER TABLE `tiempo`
  ADD PRIMARY KEY (`id_Tiempo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `bebidas`
--
ALTER TABLE `bebidas`
  MODIFY `id_Bebidas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT de la tabla `detalle`
--
ALTER TABLE `detalle`
  MODIFY `id_detalle` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=464;
--
-- AUTO_INCREMENT de la tabla `orden`
--
ALTER TABLE `orden`
  MODIFY `id_orden` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=63;
--
-- AUTO_INCREMENT de la tabla `platillos`
--
ALTER TABLE `platillos`
  MODIFY `id_Platillos` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT de la tabla `postres`
--
ALTER TABLE `postres`
  MODIFY `id_Postres` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `tiempo`
--
ALTER TABLE `tiempo`
  MODIFY `id_Tiempo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalle`
--
ALTER TABLE `detalle`
  ADD CONSTRAINT `toOrden` FOREIGN KEY (`id_orden`) REFERENCES `orden` (`id_orden`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `orden`
--
ALTER TABLE `orden`
  ADD CONSTRAINT `toTiempo` FOREIGN KEY (`id_tiempo`) REFERENCES `tiempo` (`id_Tiempo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

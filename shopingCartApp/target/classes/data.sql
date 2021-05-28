CREATE TABLE `product` (
  `id` bigint(20) NOT NULL,
  `carton_name` varchar(30) DEFAULT NULL,
  `carton_discount` double DEFAULT NULL,
  `carton_price` double DEFAULT NULL,
  `carton_price_ratio` double DEFAULT NULL,
  `carton_size` int(11) DEFAULT NULL,
  `carton_level` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;


INSERT INTO `product` VALUES (1,'penguine Ears',0.1,175,0.3,20,3),
                             (2,'Horseshoe',0.1,825,0.3,5,3);

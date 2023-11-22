CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` char(20) COMMENT '姓名',
  `age` int(11)  COMMENT '年龄',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


insert  into `user`(`id`,`name`,`age`) values (1,'张三',10),(2,'李四',20);



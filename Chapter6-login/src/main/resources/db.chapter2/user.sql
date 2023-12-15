CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` char(20) COMMENT '用户名',
  `password` char(20) COMMENT '密码',
  `name` char(20) COMMENT '姓名',
  `age` int(11)  COMMENT '年龄',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


insert  into `user`(`id`,`username`,`password`,`name`,`age`) values (1,'zhangsan','123456','张三',10);




DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `type` int(2) DEFAULT NULL COMMENT '证件类型：1：身份证号，2：其他',
  `number` varchar(200)  DEFAULT NULL COMMENT '证件号码',
  `name` varchar(20)  DEFAULT NULL COMMENT '姓名',
  `check_result` int DEFAULT NULL COMMENT '核酸检验结果:0:阴性，1:阳性',
  `check_time` datetime DEFAULT NULL COMMENT '核酸检验时间',
  `is_close_contact` int(2) DEFAULT NULL COMMENT '是否密接人员：0：否，1：是',
  `status` int(2) DEFAULT NULL COMMENT '健康码状态：0：绿，1：黄，2：红',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1 ;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, 1, '130421199105269270', '万人秀', 0, '2022-03-21 14:09:17', 0, 0);
INSERT INTO `student` VALUES (2, 1, '331003198610042412', 'tom', 0, '2022-03-21 14:09:17', 0, 0);
INSERT INTO `student` VALUES (3, 1, '331003198610042412', 'jerry', 0, '2022-03-21 14:09:17', 0, 0);
INSERT INTO `student` VALUES (4, 1, '331003198610042412', '黄轶肃', 0, '2022-03-21 14:09:17', 0, 0);


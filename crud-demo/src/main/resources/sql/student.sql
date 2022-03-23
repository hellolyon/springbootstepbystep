/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50737
 Source Host           : localhost:3306
 Source Schema         : test_sql

 Target Server Type    : MySQL
 Target Server Version : 50737
 File Encoding         : 65001

 Date: 23/03/2022 10:08:44
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `type` tinyint(2) NULL DEFAULT NULL COMMENT '证件类型：1：身份证号，2：其他',
  `number` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '证件号码\r\n',
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `check_result` tinyint(2) NULL DEFAULT NULL COMMENT '核酸检验结果:0:阴性，1:阳性',
  `check_time` datetime(0) NULL DEFAULT NULL COMMENT '核酸检验时间',
  `is_close_contact` tinyint(2) NULL DEFAULT NULL COMMENT '是否密接人员：0：否，1：是',
  `status` tinyint(2) NULL DEFAULT NULL COMMENT '健康码状态：0：绿，1：黄，2：红',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, 1, '130421199105269270', '万人秀', 0, '2022-03-21 14:09:17', 0, 0);
INSERT INTO `student` VALUES (2, 1, '331003198610042412', '???', 0, '2022-03-21 14:09:17', 0, 0);
INSERT INTO `student` VALUES (3, 1, '331003198610042412', '???', 0, '2022-03-21 14:09:17', 0, 0);
INSERT INTO `student` VALUES (4, 1, '331003198610042412', '黄轶肃', 0, '2022-03-21 14:09:17', 0, 0);

SET FOREIGN_KEY_CHECKS = 1;

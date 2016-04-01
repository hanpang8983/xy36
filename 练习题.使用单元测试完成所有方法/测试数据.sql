/*
Navicat MySQL Data Transfer

Source Server         : 胖先生
Source Server Version : 50016
Source Host           : 127.0.0.1:3308
Source Database       : xy19_rbac

Target Server Type    : MYSQL
Target Server Version : 50016
File Encoding         : 65001

Date: 2016-03-26 15:53:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for role_link_menu
-- ----------------------------
DROP TABLE IF EXISTS `role_link_menu`;
CREATE TABLE `role_link_menu` (
  `id` varchar(64) NOT NULL,
  `fk_role_id` int(10) default NULL,
  `fk_menu_id` int(10) default NULL,
  PRIMARY KEY  (`id`),
  KEY `fk_menu_id` (`fk_menu_id`),
  CONSTRAINT `role_link_menu_ibfk_1` FOREIGN KEY (`fk_menu_id`) REFERENCES `sys_menu` (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_link_menu
-- ----------------------------
INSERT INTO `role_link_menu` VALUES ('00557214-184e-42fd-afcd-1ec0a1e0d552', '300', '6');
INSERT INTO `role_link_menu` VALUES ('30b49b7e-938f-4331-9151-a4f37c4a5da3', '200', '2');
INSERT INTO `role_link_menu` VALUES ('4ac8d2ce-2271-4456-9a2a-d66639fd380f', '-100', '1');
INSERT INTO `role_link_menu` VALUES ('4c1b0e1b-23c9-4624-a7f3-f732af97b92b', '-100', '2');
INSERT INTO `role_link_menu` VALUES ('8e17543e-5499-40db-97bf-b62aa947cebf', '200', '6');
INSERT INTO `role_link_menu` VALUES ('94cbe0ad-b100-4eea-b300-d7975278d916', '200', '14');
INSERT INTO `role_link_menu` VALUES ('a28b487e-3b58-4d1c-935f-0642244cb689', '-100', '11');
INSERT INTO `role_link_menu` VALUES ('e20e21b7-741d-48a7-bedc-90b6a4f356e7', '200', '11');

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `menu_id` int(10) NOT NULL auto_increment COMMENT '注解',
  `menu_name` varchar(32) default NULL COMMENT '菜单名称',
  `url` varchar(128) default NULL COMMENT '访问路径',
  `target` varchar(16) default 'right' COMMENT '打开的位置',
  `open_type` varchar(1) default '1' COMMENT '1 target方式打开 2使用弹出方式打开 3外域打开_blank',
  `parent_id` int(11) default '-1',
  PRIMARY KEY  (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('1', '系统用户管理', 'sys/user/list', 'right', '1', '8');
INSERT INTO `sys_menu` VALUES ('2', '角色信息管理', 'sys/role/list', 'right', '1', '8');
INSERT INTO `sys_menu` VALUES ('3', '车辆信息管理', 'sys/user/find', 'right', '1', '9');
INSERT INTO `sys_menu` VALUES ('6', '车辆统计', null, 'right', '1', '10');
INSERT INTO `sys_menu` VALUES ('7', '财务统计', null, 'right', '1', '10');
INSERT INTO `sys_menu` VALUES ('8', '系统管理', null, 'right', '1', '-1');
INSERT INTO `sys_menu` VALUES ('9', '车辆管理', null, 'right', '1', '-1');
INSERT INTO `sys_menu` VALUES ('10', '统计管理', null, 'right', '1', '-1');
INSERT INTO `sys_menu` VALUES ('11', '菜单管理', 'sys/menu/parent/list', 'right', '1', '8');
INSERT INTO `sys_menu` VALUES ('12', '财务管理', null, 'right', '1', '-1');
INSERT INTO `sys_menu` VALUES ('13', '员工管理', null, 'right', '1', '-1');
INSERT INTO `sys_menu` VALUES ('14', '系统用户管理1231', 'sys/ddd', 'right', '1', '8');
INSERT INTO `sys_menu` VALUES ('15', '维护管理', null, 'right', '1', '-1');
INSERT INTO `sys_menu` VALUES ('17', '维护2', null, 'right', '1', '-1');
INSERT INTO `sys_menu` VALUES ('18', '维护3', null, 'right', '1', '-1');
INSERT INTO `sys_menu` VALUES ('19', '维护4', null, 'right', '1', '-1');
INSERT INTO `sys_menu` VALUES ('20', '维护5', null, 'right', '1', '-1');
INSERT INTO `sys_menu` VALUES ('21', '维护6', null, 'right', '1', '-1');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `role_id` int(10) NOT NULL auto_increment,
  `role_name` varchar(32) NOT NULL,
  `role_desc` varchar(256) default NULL,
  `role_status` varchar(1) NOT NULL default '1' COMMENT '1可用 2禁用',
  `role_photo` varchar(64) default NULL,
  PRIMARY KEY  (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('-100', '管理员', '管理所有', '1', null);
INSERT INTO `sys_role` VALUES ('200', '经理', null, '1', null);
INSERT INTO `sys_role` VALUES ('300', '业务员123', 'dfff123123', '1', '362afb5d-2b4c-4cb0-9188-cd9725c87f7b.jpg');
INSERT INTO `sys_role` VALUES ('401', '123213', '1231', '1', null);

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `user_id` int(10) NOT NULL auto_increment,
  `account` varchar(32) default NULL,
  `password` varchar(32) default NULL,
  `user_name` varchar(32) default NULL,
  `sex` varchar(32) default NULL,
  `tel` varchar(16) default NULL,
  `create_date` date default NULL,
  `status` varchar(1) default '1' COMMENT '1可用 2禁用',
  `fk_role_id` int(10) default NULL,
  `user_image` varchar(64) default NULL,
  PRIMARY KEY  (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('-999', 'super', 'super', '超级官六员', '男', '15568572301', '2016-03-23', '1', '-100', null);
INSERT INTO `sys_user` VALUES ('-888', 'admin', 'admin', '官六员', '女', '123123', '2016-03-23', '1', '200', null);
INSERT INTO `sys_user` VALUES ('10', 'wukong', '123123', '悟空', '男', '123213', '2016-03-23', '1', null, null);
INSERT INTO `sys_user` VALUES ('11', 'bajie', '123456', '八戒', '男', '15678789900', '2016-03-25', '1', null, '');
INSERT INTO `sys_user` VALUES ('12', 'tangseng', '123456', '唐僧', '男', '14456565656', '2016-03-25', '1', null, '');
INSERT INTO `sys_user` VALUES ('13', '123', '123456', '123123', '男', '1123', '2016-03-25', '1', null, '');
INSERT INTO `sys_user` VALUES ('14', 'fasdf', '123456', 'sasdfas', '男', '123', '2016-03-25', '1', null, '17a9975a-210f-4a6a-8db2-254ea7ff586b.jpg');
INSERT INTO `sys_user` VALUES ('15', 'super123', '123456', 'asfd', '男', '123123', '2016-03-25', '1', null, '');

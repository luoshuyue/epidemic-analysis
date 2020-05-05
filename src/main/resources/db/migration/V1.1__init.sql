/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : epidemic

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 26/04/2020 11:20:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for domestic_epidemic_situation
-- ----------------------------
DROP TABLE IF EXISTS `domestic_epidemic_situation`;
CREATE TABLE `domestic_epidemic_situation` (
  `id` int(255) NOT NULL COMMENT 'ID.',
  `confirmed_number` int(11) NOT NULL COMMENT '确诊人数.',
  `suspected_number` int(11) NOT NULL COMMENT '疑似人数.',
  `severe_number` int(11) NOT NULL COMMENT '重症人数.',
  `cure_number` int(11) NOT NULL COMMENT '治愈人数.',
  `death_number` int(11) NOT NULL COMMENT '死亡人数.',
  `overseas_import_number` int(11) NOT NULL COMMENT '境外输入病例.',
  `record_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '该条记录统计时间.',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间.',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间.',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for epidemic_distribution
-- ----------------------------
DROP TABLE IF EXISTS `epidemic_distribution`;
CREATE TABLE `epidemic_distribution` (
  `id` int(255) NOT NULL COMMENT 'ID.',
  `hubei_death_number` int(11) NOT NULL COMMENT '湖北死亡病例.',
  `not_hubei_death_number` int(11) NOT NULL COMMENT '非湖北死亡病例.',
  `hubei_cure_number` int(11) NOT NULL COMMENT '湖北治愈病例.',
  `not_hubei_cure_number` int(11) NOT NULL COMMENT '非湖北治愈病例.',
  `hubei_confirmed_number` int(11) NOT NULL COMMENT '湖北确诊病例.',
  `not_hubei_confirmed_number` int(11) NOT NULL COMMENT '非湖北确诊病例.',
  `record_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '该条记录统计时间.',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间.',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间.',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for epidemic_provinces_situation
-- ----------------------------
DROP TABLE IF EXISTS `epidemic_provinces_situation`;
CREATE TABLE `epidemic_provinces_situation` (
  `id` int(255) NOT NULL COMMENT 'ID.',
  `province_name` varchar(50) NOT NULL COMMENT '省份名称.',
  `area_name` varchar(50) NOT NULL COMMENT '地区名称.',
  `confirmed_number` int(11) NOT NULL COMMENT '确诊人数.',
  `suspected_number` int(11) NOT NULL COMMENT '疑似人数.',
  `severe_number` int(11) NOT NULL COMMENT '重症人数.',
  `cure_number` int(11) NOT NULL COMMENT '治愈人数.',
  `death_number` int(11) NOT NULL COMMENT '死亡人数.',
  `overseas_import_number` int(11) NOT NULL COMMENT '境外输入病例.',
  `record_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '该条记录统计时间.',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间.',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间.',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;

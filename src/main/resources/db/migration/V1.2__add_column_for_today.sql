alter table domestic_epidemic_situation add new_death_number int(11) NOT NULL COMMENT '今日新增死亡人数.';
alter table domestic_epidemic_situation add new_confirmed_number int(11) NOT NULL COMMENT '今日新增确诊人数.';
alter table domestic_epidemic_situation add new_cure_number int(11) NOT NULL COMMENT '今日新增治愈人数.';

alter table epidemic_provinces_situation add new_death_number int(11) NOT NULL COMMENT '今日新增死亡人数.';
alter table epidemic_provinces_situation add new_confirmed_number int(11) NOT NULL COMMENT '今日新增确诊人数.';
alter table epidemic_provinces_situation add new_cure_number int(11) NOT NULL COMMENT '今日新增治愈人数.';
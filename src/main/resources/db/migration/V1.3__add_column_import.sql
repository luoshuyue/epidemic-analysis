alter table domestic_epidemic_situation add new_overseas_import_number int(11) NOT NULL COMMENT '今日新增境外输入病例.';

alter table epidemic_provinces_situation add new_overseas_import_number int(11) NOT NULL COMMENT '今日新增境外输入病例.';
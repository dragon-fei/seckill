--创建数据库
create database seckill;
use seckill;
CREATE TABLE seckill(
`seckill_id` bigint NOT NULL AUTO_INCREMENT COMMENT '商品库存id',
`name` varchar(120) NOT NULL COMMENT '商品名称',
`number` int NOT NULL COMMENT '库存数量',
`create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP  COMMENT '创建时间',
`start_time` timestamp NOT NULL COMMENT '秒杀开启时间',
`end_time` timestamp  NOT NULL COMMENT '秒杀结束时间',
PRIMARY KEY(seckill_id),
key idx_start_time(start_time),
key idx_end_time(end_time),
key idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '秒杀库存表';

INSERT INTO seckill(name,number,start_time,end_time)
VALUES
('50元秒杀洗发露',500,'2018-12-10 00:00:00','2018-12-15 00:00:00'),
('5000元秒杀MAC',100,'2018-11-28 00:00:00','2018-12-05 00:00:00'),
('300元秒杀三星手机',100,'2018-11-28 00:00:00','2018-12-05 00:00:00'),
('100元秒杀华为手机',100,'2018-11-28 00:00:00','2018-12-05 00:00:00');

CREATE TABLE success_killed(
`seckill_id` bigint NOT NULL COMMENT '秒杀商品id',
`user_phone` bigint NOT NULL COMMENT '用户手机号',
`state` tinyint NOT NULL DEFAULT -1 COMMENT '状态标识:-1表示无效  0表示成功 1:表示已付款 2:表示未付款',
`create_time` timestamp NOT NULL COMMENT '创建时间',
PRIMARY KEY(seckill_id,user_phone),
key idx_create_time(create_time)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='秒杀库存表';
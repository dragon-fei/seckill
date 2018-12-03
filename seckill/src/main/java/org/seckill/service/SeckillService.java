package org.seckill.service;

import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.exception.RepeatKillException;
import org.seckill.exception.SeckillCloseException;
import org.seckill.exception.SeckillException;
import org.seckill.vo.Seckill;

import java.util.List;

public interface SeckillService {
    List<Seckill> getSeckillList();
    Seckill getById(long seckillId);
    Exposer exportSeckillUrl(long seckillId);
    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5) throws RepeatKillException, SeckillCloseException, SeckillException;
}

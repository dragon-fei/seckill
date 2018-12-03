package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.vo.Seckill;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillDaoTest {
    @Resource
    private SeckillDao seckillDao;
    @Test
    public void queryByID() {
        long id = 1000;
        Seckill seckill = seckillDao.queryById(id);
        System.out.println("********" + seckill.getName());
        System.out.println("********" + seckill);
    }

    @Test
    public void queryAll() {

       List<Seckill>  seckills = seckillDao.queryAll(0,100);
       for(Seckill seckill:seckills){
           System.out.println("**************" + seckill);
       }
    }

    @Test
    public void reduceNumber() {
    }
}
package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.vo.SuccessKilled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {
    @Autowired
    private SuccessKilledDao successKilledDao;
    @Test
    public void insertSuccessKilled() {
        long id = 1003;
        long phone=13625574521L;
        int success = successKilledDao.insertSuccessKilled(id,phone);
        System.out.println("****************success: " + success);
    }

    @Test
    public void queryByIdWithSeckill() {
        long id = 1000L;
        long phone=13625574521L;
        SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(id,phone);
        System.out.println("********************successKilled: " + successKilled);
    }
}
package com.imooc.aop.SpringAopAroundAdvice;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class CustomerDaoTest {


//    @Resource(name="customerDao")
    @Resource(name="customerDaoProxy")
    private CustomerDao customerDao;

    @Test
    public void demo(){
        customerDao.delete();
        customerDao.find();
        customerDao.save();
        customerDao.update();
    }


}

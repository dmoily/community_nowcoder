package com.nowcoder.community.service;

import com.nowcoder.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
//@Scope("prototype")  多次实例初始化
public class AlphaService {

    @Autowired
    private AlphaDao alphaDao;


    public AlphaService(){
        System.out.println("实例化");
    }

    @PostConstruct
    public void init(){
        System.out.println("初始化AlphaService");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("销毁");
    }

    public String Find(){
        return alphaDao.select();
    }

}

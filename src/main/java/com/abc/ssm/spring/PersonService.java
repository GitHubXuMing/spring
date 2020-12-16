package com.abc.ssm.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//@Service
@Service
public class PersonService {
    @Autowired
    private PersonDao personDao;

    public void print(){
        personDao.print();
    }
}

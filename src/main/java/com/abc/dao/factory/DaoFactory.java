package com.abc.dao.factory;

import com.abc.common.Comm;
import com.abc.dao.impl.UserDaoImpl;

public class DaoFactory {
    public static Object getInstance(String daoName){
        if(Comm.USER.equals(daoName)){
            return new UserDaoImpl();
        }
        return null;
    }
}

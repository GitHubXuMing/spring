package com.abc.service.factory;

import com.abc.common.Comm;
import com.abc.service.impl.UserServiceImpl;

public class ServiceFactory {
    public static Object getInstance(String serviceName){
        if(Comm.USER.equals(serviceName)){
            return new UserServiceImpl();
        }
        return null;
    }
}

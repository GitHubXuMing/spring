package com.abc.service.impl;

import com.abc.common.Comm;
import com.abc.common.Res;
import com.abc.common.ResEnum;
import com.abc.dao.factory.DaoFactory;
import com.abc.dao.idao.IUserDao;
import com.abc.service.iservice.IUserService;

public class UserServiceImpl implements IUserService {

    IUserDao userDao;

    public UserServiceImpl() {
        userDao = (IUserDao) DaoFactory.getInstance(Comm.USER);
    }

    @Override
    public Res userExist(String username) {
        int flag = 0;
        try {
            flag = userDao.exist(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag>0?Res.success(ResEnum.SUCCESS_USER_EXIST):Res.error(ResEnum.ERROR_USER_EXIST);
    }
}

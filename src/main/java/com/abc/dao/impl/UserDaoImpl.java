package com.abc.dao.impl;

import com.abc.dao.idao.IUserDao;
import com.abc.dao.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDaoImpl implements IUserDao {
    @Override
    public int exist(String username) throws Exception{
        Connection con = DBUtil.getConnection();
        String sql = "select count(1) from user where username=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,username);
        ResultSet rs = ps.executeQuery();
        int flag = 0;
        if(rs.next()){
            flag = rs.getInt(1);
        }
        DBUtil.close(rs,ps,con);
        return flag;
    }
}

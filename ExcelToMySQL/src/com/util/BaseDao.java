package com.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

/**
 * 
 * <p>Title: BaseDao</p>
 * <p>Company: 普及科技</p>
 * @author Jerry
 * @date 2016年9月11日 下午3:54:10
 */
public class BaseDao {
	
	Connection con = null;
	ResultSet res = null;
	PreparedStatement pst = null;
	
	// 查询
    public ResultSet Search(String sql, String str[]) {
        
        try {
            pst =con.prepareStatement(sql);
            if (str != null) {
                for (int i = 0; i < str.length; i++) {
                    pst.setString(i + 1, str[i]);
                }
            }
            res = pst.executeQuery();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    // 增删修改
    public int AddObject(String sql, String str[]) {
        int a = 0;
        try {
        	pst = con.prepareStatement(sql);
            if(str!=null && str.length>0){
            	
            	//用于用户表
            	for (int i = 0; i < str.length; i++) {
                	if((i==0 || i==1 || i==7 || i==15) && (str[i]==null || "".equals(str[i]))){
                    	pst.setObject(i + 1, new Date(1473409521852L));
                    } else if((i==16 || i==17) && (str[i]==null || "".equals(str[i]))){
                    	pst.setObject(i + 1, null);
                    } else {
                    	pst.setString(i + 1, str[i]);
                    }
                }
            	
            	//通用
//            	for (int i = 0; i < str.length; i++) {
//            		pst.setString(i + 1, str[i]);
//            	}
            }
            a = pst.executeUpdate();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return a;
    }
	
}

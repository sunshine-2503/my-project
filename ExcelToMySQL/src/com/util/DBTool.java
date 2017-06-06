package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * <p>Title: DBTool</p>
 * <p>Company: 普及科技</p>
 * @author Jerry
 * @date 2016年9月11日 下午9:36:16
 */
public class DBTool {
	private static String driver = "com.mysql.jdbc.Driver";	//驱动
	private static String url = "jdbc:mysql://localhost:3306/aecm_demo1?useUnicode=true&characterEncoding=utf8";	//数据库链接
	private static String user = "root";	//数据库登录名
	private static String upwd = "root";	//数据库登录密码
	
	static Connection conn=null;  
	
    /** 
     * 通过读取配置文件取得数据库连接 
     * @return 
     */   
    public static Connection getConn() {  
        if(conn==null){  
	        try {  
	            Class.forName(driver);  
	            conn = DriverManager.getConnection(url, user, upwd);  
	              
	        } catch (Exception e) {  
	            // TODO Auto-generated catch block  
	            e.printStackTrace();  
	        }  
        }
        return conn;
    }  
  
    public static void close(PreparedStatement pstmt) {  
        if (pstmt != null) {  
            try {  
                pstmt.close();  
            } catch (SQLException e) {  
                e.printStackTrace();  
            }  
        }  
    }  
      
    public static void close(Statement stmt) {  
        if (stmt != null) {  
            try {  
                stmt.close();  
            } catch (SQLException e) {  
                e.printStackTrace();  
            }  
        }  
    }  
      
    public static void close(Connection conn) {  
        if (conn != null) {  
            try {  
                conn.close();  
            } catch (SQLException e) {  
                e.printStackTrace();  
            }     
        }  
    }  
      
    public static void close(ResultSet rs) {  
        if (rs != null) {  
            try {  
                rs.close();  
            } catch (SQLException e) {  
                e.printStackTrace();  
            }  
        }  
    }  
      
    public static void commit(Connection conn) {  
        if (conn != null) {  
            try {  
                conn.commit();  
            } catch (SQLException e) {  
                e.printStackTrace();  
            }  
        }  
    }  
      
    public static void rollback(Connection conn) {  
        if (conn != null) {  
            try {  
                conn.rollback();  
            } catch (SQLException e) {  
                e.printStackTrace();  
            }  
        }  
    }  
      
    public static void setAutoCommit(Connection conn, boolean autoCommit) {  
        if (conn != null) {  
            try {  
                conn.setAutoCommit(autoCommit);  
            } catch (SQLException e) {  
                e.printStackTrace();  
            }  
        }  
    }  
      
    public static void main(String[] args) {  
        DBTool.getConn();
        System.out.println("链接成功！");  
    }
}

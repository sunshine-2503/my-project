package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.Test;

/**
 * 
 * <p>Title:DBhepler</p>
 * <p>Company:普及科技</p>
 * @author Jerry
 * @date 2016年9月8日 上午9:48:10
 */
public class DBhepler {
	
	private static String driver = "com.mysql.jdbc.Driver";	//驱动
	private static String url = "jdbc:mysql://localhost:3306/aecm_demo?useUnicode=true&characterEncoding=utf8";	//数据库链接
	private static String user = "root";	//数据库登录名
	private static String upwd = "root";	//数据库登录密码

	static{
		try {
			//加载驱动
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
    //获取连接
    public static Connection getConn() throws SQLException {
    	//获取链接
        return DriverManager.getConnection(url, user, upwd);
    }
    
    //关闭连接。。。
    public static void closeAll(ResultSet rs,Statement stmt,Connection con){
		try {
			if (rs != null)
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (stmt != null)
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (con != null)
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
    @Test
    public void DataBase() {
        try {
            Class.forName(driver);
            getConn(); //测试链接是否成功！
        } catch (ClassNotFoundException e) {
              System.err.println("装载 JDBC/ODBC 驱动程序失败。" );
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("无法连接数据库" ); 
            e.printStackTrace();
        }
    }
    
	@Test
	public void getTime(){
		long time = System.currentTimeMillis();
		System.out.println(time);
	}
}

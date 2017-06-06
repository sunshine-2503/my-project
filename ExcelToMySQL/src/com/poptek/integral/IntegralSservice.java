package com.poptek.integral;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.util.DBTool;

/**
 * 
 * <p>Title:IntegralSservice</p>
 * <p>Company:普及科技</p>
 * @author Jerry
 * @date 2016年9月22日 下午4:27:18
 */
public class IntegralSservice {
	private static PreparedStatement ps = null;
//	private static ResultSet rs = null;
	
	public static void addSchool(Connection con, Integral integral){
		String sql = "insert  into `aecm_integral`(`create_time`,`get_date`,`is_delete`,`total_score`,`valid_date`,`create_by`,`user_id`) values (1474522565732,NULL,'\0',0,NULL,1,?);";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, integral.getUser_id());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBTool.close(ps);
		}
	}
	
}

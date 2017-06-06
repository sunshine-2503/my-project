package com.poptek.integral;

import java.sql.Connection;
import java.util.List;

import org.junit.Test;

import com.poptek.user.User;
import com.poptek.user.UserService;
import com.util.DBTool;

/**
 * 
 * <p>Title:IntegralTest</p>
 * <p>Company:普及科技</p>
 * @author Jerry
 * @date 2016年9月22日 下午4:41:28
 */
public class IntegralTest {
	
	@Test
	public void addIntegral(){
		List<User> users = UserService.getUsersByDb();
		Connection con = null;
		try {
			con = DBTool.getConn();
			for (User user : users) {
				Integral integral = new Integral();
				integral.setUser_id(user.getId());
				IntegralSservice.addSchool(con, integral);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBTool.close(con);
		}
	}
	
}

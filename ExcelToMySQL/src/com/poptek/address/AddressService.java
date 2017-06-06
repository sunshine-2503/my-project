package com.poptek.address;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.util.DBhepler;

/**
 * 
 * <p>Title:AddressService</p>
 * <p>Company:普及科技</p>
 * @author Jerry
 * @date 2016年9月9日 下午12:47:54
 */
public class AddressService {
	
	/**
	 * 從數據庫獲取所有用戶地址的id
	 * @return
	 */
	public static List<Integer> getAddressIdsByDb(){
		List<Integer> ids = new ArrayList<Integer>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = DBhepler.getConn();
			String sql="select id from aecm_address";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()){
				Integer id = rs.getInt("id");
				ids.add(id);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBhepler.closeAll(rs, ps, con);
		}
		
		return ids;
	}
	
}

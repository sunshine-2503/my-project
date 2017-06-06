package com.poptek.guardian;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.util.DBTool;
import com.util.DBhepler;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 * 
 * <p>Title:GuardianService</p>
 * <p>Company:普及科技</p>
 * @author Jerry
 * @date 2016年9月9日 下午12:57:11
 */
public class GuardianService {
	
	/**
	 * 從數據庫獲取所有用戶地址的id
	 * @return
	 */
	public static List<Integer> getGuardianIdsByDb(){
		List<Integer> ids = new ArrayList<Integer>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			//获取连接
			con = DBhepler.getConn();
			String sql="select id from aecm_guardian";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
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
	
	/**
	 * 根據姓名從數據庫獲取監護人的id
	 * @return
	 */
	public static Integer getGuardianIdByName(Connection con, String name){
		Integer id = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
//			con = DBhepler.getConn();
			String sql="select id from aecm_guardian where name=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, name);
			rs = ps.executeQuery();
			while (rs.next()) {
				id = rs.getInt("id");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
//			DBhepler.closeAll(rs, ps, con);
			DBTool.close(rs);
			DBTool.close(ps);
		}
		
		return id;
	}

	/**
	 * 添加監護人
	 * @param guardian
	 */
	public static void addGuardian(Guardian guardian){
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DBhepler.getConn();
			String sql = "insert  into `aecm_guardian`(`id`,`create_time`,`is_delete`,`name`,`phone_number`,`relationship`,`create_by`) values (?,1473398424643,'\0',?,?,NULL,NULL);";
			ps = con.prepareStatement(sql);
			ps.setInt(1, guardian.getId());
			ps.setString(2, guardian.getName());
			ps.setString(3, guardian.getPhone_number());
			int n = ps.executeUpdate();
			System.out.println(n+"=============");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBhepler.closeAll(null, ps, con);
		}
		
	}
	
	/**
	 * 從excel獲取所有數據
	 * @param file 文件完整路徑
	 * @return
	 */
	public static List<Guardian> getSchoolsByExcel(String file){
		List<Guardian> list = new ArrayList<Guardian>();
		try {
			Workbook rwb=Workbook.getWorkbook(new File(file));
			Sheet sheet = rwb.getSheet(0);
			int clos=sheet.getColumns();//得到所有的列
			int rows=sheet.getRows();//得到所有的行
			System.out.println("clos:"+clos+" rows:"+rows);
			for (int i = 1; i < rows; i++) {
				for (int j = 0; j < clos; j++) {
					String id = sheet.getCell(j++, i).getContents();
					String name = sheet.getCell(j++, i).getContents();
					String phone_number = sheet.getCell(j++, i).getContents();
					list.add(new Guardian(Integer.parseInt(id), name, phone_number));
				}
			}
			
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	
}

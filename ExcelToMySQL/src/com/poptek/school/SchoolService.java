package com.poptek.school;

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
 * <p>Title:SchoolService</p>
 * <p>Company:普及科技</p>
 * @author Jerry
 * @date 2016年9月9日 上午10:19:53
 */
public class SchoolService {
	private static Connection con = null;
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;
	
	public static void addSchool(Connection con, School school){
		try {
			String sql = "insert  into `aecm_school`(`_desc`,`is_delete`,`schoolName`,`school_type`,`sort_order`,`OPTLOCK`) values (NULL,'\0',?,?,0,NULL)";
			ps = con.prepareStatement(sql);
			ps.setString(1, school.getSchoolName());
			ps.setInt(2, school.getSchool_type());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBTool.close(ps);
		}
		
	}
	
	/**
	 * 從數據庫獲取所有學校數據
	 * @return
	 */
	public static List<School> getSchoolsByDb(){
		List<School> list = new ArrayList<School>();
		
		try {
			con = DBhepler.getConn();
			String sql="select * from aecm_school";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Integer id = rs.getInt("id");
				String _desc = rs.getString("_desc");
				boolean is_delete = rs.getBoolean("is_delete");
				String schoolName = rs.getString("schoolName");
				Integer school_type = rs.getInt("school_type");
				Integer sort_order = rs.getInt("sort_order");
				Integer optlock = rs.getInt("OPTLOCK");
				School school = new School(id,_desc, is_delete, schoolName, school_type, sort_order, optlock);
				list.add(school);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBhepler.closeAll(rs, ps, con);
		}
		
		return list;
	}
	
	/**
	 * 根據學校名稱從數據庫查找其id
	 * @param name
	 * @return
	 */
	public static Integer getSchoolIdByName(Connection con, String name){
		Integer id = null;
		try {
//			con = DBhepler.getConn();
			String sql="select id from aecm_school where schoolName=?";
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
	 * 從excel獲取所有數據
	 * @param file 文件完整路徑
	 * @return
	 */
	public static List<School> getSchoolsByExcel(String file){
		List<School> list = new ArrayList<School>();
		
		try {
			Workbook rwb=Workbook.getWorkbook(new File(file));
			Sheet rs = rwb.getSheet(0);
			int clos=rs.getColumns();//得到所有的列
			int rows=rs.getRows();//得到所有的行
			System.out.println("clos:"+clos+" rows:"+rows);
			for (int i = 1; i < rows; i++) {
				for (int j = 0; j < clos; j++) {
					String school_name = rs.getCell(j++, i).getContents();
					list.add(new School(school_name));
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

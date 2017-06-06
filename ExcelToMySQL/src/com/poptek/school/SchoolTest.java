package com.poptek.school;

import java.sql.Connection;
import java.util.List;

import org.junit.Test;

import com.util.DBTool;

/**
 * 
 * <p>Title:SchoolTest</p>
 * <p>Company:普及科技</p>
 * @author Jerry
 * @date 2016年9月9日 上午11:19:43
 */
public class SchoolTest {
	
	public static void main(String[] args) {
		//得到表格中的左右數據
		List<School> schoolList = null;
		schoolList = SchoolService.getSchoolsByExcel("D://School.xls");
		System.out.println(schoolList.size());
		Connection con = DBTool.getConn();
		try {
			con = DBTool.getConn();
			for (School school : schoolList) {
				SchoolService.addSchool(con, school);
				System.out.println(school.toString());
			}
		} catch (Exception e) {
			// TODO: handle exception
			DBTool.rollback(con);
		} finally {
			DBTool.close(con);
		}
		
		
	}
	
	@Test
	public void showSchool(){
		List<School> list = SchoolService.getSchoolsByDb();
		System.out.println(list.size());
	}
}

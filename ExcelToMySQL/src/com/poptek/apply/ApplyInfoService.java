package com.poptek.apply;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.util.DBTool;

/**
 * 
 * <p>Title:ApplyInfoService</p>
 * <p>Company:普及科技</p>
 * @author Jerry
 * @date 2016年9月22日 下午5:07:51
 */
public class ApplyInfoService {

	static Connection con = null;
	static PreparedStatement ps = null;
	static ResultSet rs = null;
	
	/**
	 * 添加记录
	 * @param con
	 * @param applyInfo
	 */
	public static void addApplyInfo(Connection conn, List<ApplyInfo> applyInfos){
		String sql = "insert  into `aecm_apply_info`(`birthday`,`create_time`,`department`,`mail`,`gender`,`grade_name`,`home_tel`,`identification_number`,"
				+ "`is_belong_student_organization`,`is_contact`,`is_delete`,`is_start`,`joiningDate`,`member_sn`,`name`,`native_place`,`phone_number`,`school_year`,"
				+ "`student_organization_Name`,`address`,`create_by`,`grade_id`,`guardian`,`photo`,`school`) "
				+ "values (?,?,NULL,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,NULL,?);";
		for (ApplyInfo applyInfo : applyInfos) {
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, applyInfo.getBirthday());
				if(applyInfo.getCreate_time()==null || "".equals(applyInfo.getCreate_time())){
					ps.setObject(2, null);
				} else {
					ps.setLong(2, applyInfo.getCreate_time());
				}
				ps.setString(3, applyInfo.getMail());
				ps.setInt(4, applyInfo.getGender());
				ps.setString(5, applyInfo.getGrade_name());
				ps.setString(6, applyInfo.getHome_tel());
				ps.setString(7, applyInfo.getIdentification_number());
				ps.setString(8, applyInfo.getJoiningDate());
				ps.setString(9, applyInfo.getMember_sn());
				ps.setString(12, applyInfo.getName());
				ps.setString(13, applyInfo.getNative_place());
				ps.setString(14, applyInfo.getPhone_number());
				ps.setString(15, applyInfo.getSchool_year());
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DBTool.close(conn);
			}
			
		}
	}
}

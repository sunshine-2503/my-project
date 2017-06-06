package com.poptek.user;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.poptek.util.MemberType;
import com.util.DBTool;
import com.util.DBhepler;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 * 
 * <p>Title:UserService</p>
 * <p>Company:普及科技</p>
 * @author Jerry
 * @date 2016年9月8日 上午10:13:57
 */
public class UserService {

	static Connection con = null;
	static PreparedStatement ps = null;
	static ResultSet rs = null;
	
	/**
     * 查询stu表中所有的数据
     * @return 
     */
    public static List<User> getUsersByDb(){
        List<User> list=new ArrayList<User>();
        try {
        	String sql="select * from aecm_user";
            con = DBhepler.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id=rs.getInt("id");
                User user = new User();
                user.setId(id);
                list.add(user);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
			DBhepler.closeAll(rs, ps, con);
		}
        return list;
    }

	
    /**
     * 查询指定目录中电子表格中所有的数据
     * @param file 文件完整路径
     * @return
     * @throws ParseException 
     */
	public static List<User> getUsersByExcel(String file) throws ParseException{
		List<User> list = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Workbook rwb=Workbook.getWorkbook(new File(file));
			
			Sheet rs = rwb.getSheet(0);
			int clos=rs.getColumns();//得到所有的列
            int rows=rs.getRows();//得到所有的行
            System.out.println("clos:"+clos+" rows:"+rows);
            for (int i = 1; i < rows; i++) {
                for (int j = 0; j < clos; j++) {
                    //第一个是列数，第二个是行数
//                	String id=rs.getCell(j++, i).getContents();//默认最左边编号也算一列 所以这里得j++
					String member_sn = rs.getCell(j++, i).getContents();
					String name = rs.getCell(j++, i).getContents();
					String gender = rs.getCell(j++, i).getContents();
					String member_type = rs.getCell(j++, i).getContents();
					String joiningDate = rs.getCell(j++, i).getContents();
					Long create_time = null;
					if(joiningDate!=null && !"".equals(joiningDate)){
						Date joining_Date = sdf.parse(joiningDate);
						create_time = joining_Date.getTime();
					} else {
						create_time = 0L;
					}
					String phone_number = rs.getCell(j++, i).getContents();
					String home_tel = rs.getCell(j++, i).getContents();
					String mail = rs.getCell(j++, i).getContents();
					String birthday = rs.getCell(j++, i).getContents();
					String native_place = rs.getCell(j++, i).getContents();
					String identification_number = rs.getCell(j++, i).getContents();
					String school_name = rs.getCell(j++, i).getContents();
					String grade_name = rs.getCell(j++, i).getContents();
					String school_year = rs.getCell(j++, i).getContents();
					String update_date = rs.getCell(j++, i).getContents();
//					String member_status1 = rs.getCell(j++, i).getContents();
					String department = rs.getCell(j++, i).getContents();
					String member_status = rs.getCell(j++, i).getContents();
					
					if(member_type.contains("普通會員")){
						System.out.println("普通會員");
						member_type = MemberType.GEREN.toString();
					} else if(member_type.contains("永久會員")){
						System.out.println("永久會員");
						member_type = MemberType.YONGJIU.toString();
					} else if(member_type.contains("榮譽會員")){
						System.out.println("榮譽會員");
						member_type = MemberType.RONGYU.toString();
					} else {
						System.out.println("空缺編號");
						member_type = MemberType.KONGQUE.toString();
					}
					
					Integer id = 0;
					if(member_sn!=null && !"".equals(member_sn)){
						id = Integer.parseInt(member_sn);
					}
//					User user = new User(birthday, create_time, department, mail, gender, grade_name, home_tel, identification_number, true, true, false, true, joiningDate, member_sn, member_status, "GEREN", grade_name, native_place, "670b14728ad9902aecba32e22fa4f6bd", phone_number, school_year, null, update_date, null, "MEMBER", id, 1, null, id, null, id);
					User user = new User(birthday, create_time, department, mail, gender, grade_name, home_tel, identification_number, true, true, false, true, joiningDate, member_sn, member_status, member_type, name, native_place, null, phone_number, school_year, null, update_date, null, "MEMBER", id, 1, null, id, null, id);
					user.setSchool_name(school_name);
					
					list.add(user);
                }
            }

		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/**
     * 通过Id判断是否存在
     * @param id
     * @return
     */
    public static boolean isExist(int id){
        try {
            con = DBhepler.getConn();
            String sql = "select * from aecm_user where id=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
			DBhepler.closeAll(rs, ps, con);
		}
        return false;
    }
    
    /**
     * 獲取用戶數量
     * @return
     */
    public static int getUserCount(){
    	int n=0;
    	String sql="select count(*) c from aecm_user";
        try {
			con = DBhepler.getConn();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			n = rs.getInt("c");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBhepler.closeAll(rs, ps, con);
		}
        return n;
    }

    /**
     * 添加用戶
     * @param user
     */
    public static void addUser(Connection con, List<User> users){
    	String sql = "insert  into `aecm_user`(`birthday`,`create_time`,`department`,`mail`,`gender`,"
    			+ "`grade_name`,`home_tel`,`identification_number`,`is_belong_student_organization`,`is_contact`,"
    			+ "`is_delete`,`is_start`,`joiningDate`,`member_sn`,`member_status`,"
    			+ "`member_type`,`name`,`native_place`,`password`,`phone_number`,"
    			+ "`school_year`,`student_organization_Name`,`update_date`,`username`,`user_type`,"
    			+ "`address`,`create_by`,`grade_id`,`guardian`,`integral`,`photo`,`school`)"
				+ " values (?,?,?,?,?, ?,?,?,?,?, ?,?,?,?,?, ?,?,?,?,?, ?,?,?,?,?, ?,?,?,?,?,?,?);";
    	for (User user : users) {
			try {
				ps = con.prepareStatement(sql);
				ps.setString(1, user.getBirthday());
				if(user.getCreate_time()==null || "".equals(user.getCreate_time())){
					ps.setLong(2, new Date().getTime());
				} else {
					ps.setLong(2, user.getCreate_time());
				}
				ps.setString(3, user.getDepartment());
				ps.setString(4, user.getMail());
				ps.setString(5, user.getGender());
				
				ps.setString(6, user.getGrade_name());
				ps.setString(7, user.getHome_tel());
				ps.setString(8, user.getIdentification_number());
				ps.setBoolean(9, user.getIs_belong_student_organization());
				ps.setBoolean(10, user.getIs_contact());
				
				ps.setBoolean(11, user.getIs_delete());
				ps.setBoolean(12, user.getIs_start());
				ps.setString(13, user.getJoiningDate());
				ps.setString(14, user.getMember_sn());
				ps.setString(15, user.getMember_status());
				
				ps.setString(16, user.getMember_type());
				ps.setString(17, user.getName());
				ps.setString(18, user.getNative_place());
				ps.setObject(19, null); //密码设为null
				ps.setString(20, user.getPhone_number());
				
				ps.setString(21, user.getSchool_year());
				ps.setObject(22, null);
				ps.setString(23, user.getUpdate_date());
				ps.setObject(24, null);
				ps.setString(25, user.getUser_type());
				
				ps.setInt(26, user.getAddress());
				ps.setInt(27, user.getCreate_by());
				ps.setObject(28, null);
				ps.setInt(29, user.getGuardian());
				ps.setObject(30, null);
				ps.setInt(31, user.getPhoto());
//				ps.setInt(32, user.getSchool());
				if(user.getSchool()==null){
					ps.setObject(32, null);
				} else {
					ps.setInt(32, user.getSchool());
				}
				
//				if(user.getAddress()==null){
//					ps.setObject(17, null);
//				} else {
//					ps.setInt(17, user.getAddress());
//				}
//				if(user.getGuardian()==null){
//					ps.setObject(18, null);
//				} else {
//					ps.setInt(18, user.getGuardian());
//				}
				
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DBTool.close(ps);
			}
			
		}
    }
}

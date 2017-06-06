package com.poptek.user;

import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.poptek.school.SchoolService;
import com.poptek.util.MemberStatus;
import com.util.DBTool;

/**
 * 
 * <p>Title:TestExcelToDb</p>
 * <p>Company:普及科技</p>
 * @author Jerry
 * @date 2016年9月8日 上午10:27:14
 */
public class UserTest {
	public static void main(String[] args) {
		//得到表格中所有的数据
        List<User> listExcel = null;
        List<User> list = new ArrayList<User>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			listExcel = UserService.getUsersByExcel("D://User.xls");
		} catch (ParseException e) {
			e.printStackTrace();
		}
//    	List<Integer> addressIds = AddressService.getAddressIdsByDb();
		Connection con = null;
		try {
			con = DBTool.getConn();
			int n=0;
			
			System.out.println("IV-榮譽會員".contains("IV"));
			
			
			for (User user : listExcel) {
				n++;
	        	Integer schoolId = SchoolService.getSchoolIdByName(con, user.getSchool_name());
	        	user.setSchool(schoolId);
	        	
//	        	Integer address = null;
//	        	for (Integer id : addressIds) {
//					if(id.toString().equals(user.getMember_sn())){
//						address = id;
//						break;
//					}
//				}
//	        	user.setAddress(address);
	        	
	        	user.setMember_sn("0000"+user.getMember_sn());
	        	if(user.getJoiningDate()==null || "".equals(user.getJoiningDate())){
	        		user.setCreate_time(null);
	        		user.setJoiningDate(null);
	        	} else {
	        		Date date = null;
					try {
						date = sdf.parse(user.getJoiningDate());
					} catch (ParseException e) {
						e.printStackTrace();
					}
	        		user.setCreate_time(date.getTime());
	        	}
	        	if("".equals(user.getUpdate_date())){
	        		user.setUpdate_date(null);
	        	}
	        	if("".equals(user.getBirthday())){
	        		user.setBirthday(null);
	        	}
	        	if(n<=10){
	        		System.out.println("#####"+user.toString());
	        	}
	        	if(user.getMember_status().contains("A1")){
	        		user.setMember_status(MemberStatus.UPDATECOMPLETE.toString());
	        	} else if(user.getMember_status().contains("A2")){
	        		user.setMember_status(MemberStatus.NEWMEMBER.toString());
	        	} else if(user.getMember_status().contains("A3")){
	        		user.setMember_status(MemberStatus.WAITINGFORUPDATE.toString());
	        	} else if(user.getMember_status().contains("A5")){
	        		user.setMember_status(MemberStatus.REFUSEUPDATE.toString());
	        	} else if(user.getMember_status().contains("A7")){
	        		user.setMember_status(MemberStatus.REFUSETELCONTACT.toString());
	        	} else if(user.getMember_status().contains("A8")){
	        		user.setMember_status(MemberStatus.REFUSECONTACT.toString());
	        	} else if(user.getMember_status().contains("A9")){
	        		user.setMember_status(MemberStatus.UNABLETOCONTACT.toString());
	        	} else if(user.getMember_status().contains("B1")){
	        		user.setMember_status(MemberStatus.NONUMBER.toString());
	        	} else if(user.getMember_status().contains("C1")){
	        		user.setMember_status(MemberStatus.DIEDMEMBER.toString());
	        	} else if(user.getMember_status().contains("D1")){
	        		user.setMember_status(MemberStatus.REMOVEDMEMBER.toString());
	        	} 
//	        	System.out.println(user.getMember_type()+"=====普通會員："+user.getMember_type().contains("普通會員")+"=====永久會員："+user.getMember_type().contains("永久會員")+"=====榮譽會員："+user.getMember_type().contains("榮譽會員")+"=====空缺編號："+user.getMember_type().contains("空缺編號"));
//	        	if(user.getMember_type().contains("I")){
//	        		user.setMember_type(MemberType.YONGJIU.toString());
//	        	} else if(user.getMember_type().contains("普通會員")){
//	        		System.out.println("普通會員================================");
//	        		user.setMember_type(MemberType.GEREN.toString());
//	        	} else if(user.getMember_type().contains("榮譽會員")){
//	        		System.out.println("榮譽會員+++++++++++++++++++++++++++++++++++++");
//	        		user.setMember_type(MemberType.RONGYU.toString());
//	        	} else if(user.getMember_type().contains("V")){
//	        		user.setMember_type(MemberType.KONGQUE.toString());
//	        	}
	        	
	        	if(user.getGender().equals("男")){
	        		user.setGender("MALE");
	        	} else if(user.getGender().equals("女")){
	        		user.setGender("FEMALE");
	        	} else {
	        		user.setGender("SECRECY");
	        	}
	        	list.add(user);
	        }
			UserService.addUser(con, list);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBTool.close(con);
		}
        
	}
	
	@Test
	public void testDemo() throws ParseException{
		List<User> listExcel = UserService.getUsersByExcel("D://User.xls");
		int n = UserService.getUserCount();
		System.out.println(n+"=============="+listExcel.size());
		
	}
	
	
}

package com.poptek.apply;

import com.poptek.user.User;

/**
 * 
 * <p>Title:ApplyInfo</p>
 * <p>Company:普及科技</p>
 * @author Jerry
 * @date 2016年9月22日 下午4:52:58
 */
public class ApplyInfo {
	private Integer id; //id
	private String birthday; //生日
	private Long create_time = null; //创建时间
	private String department = null; //部门
	private String mail; //邮箱
	private Integer gender; //性别
	private String grade_name = null; //
	private String home_tel; //家庭电话
	private String identification_number; //身份证号
	private Boolean is_belong_student_organization; 
	private Boolean is_contact;
	private Boolean is_delete;
	private Boolean is_start;
	private String joiningDate = null; //入会时间
	private String member_sn; //会员编号
	private String name; //姓名
	private String native_place = null; //籍贯
	private String phone_number; //手机号
	private String school_year; //学年
	private String student_organization_Name = null; //学生组织名称
	private Integer address; //用戶地址id
	private Integer create_by;  //創建人
	private Integer grade_id; //年級id
	private Integer guardian; //監護人
	private Integer photo; //圖片
	private Integer school; //學校id
	
	public ApplyInfo() {
		super();
	}

	public ApplyInfo(User user) {
		super();
		this.birthday = user.getBirthday();
		this.create_time = user.getCreate_time();
		this.department = user.getDepartment();
		this.mail = user.getMail();
		if(user.getGender().equals("男")){
			this.gender = 1;
		} else {
			this.gender = 2;
		}
		this.grade_name = user.getGrade_name();
		this.home_tel = user.getHome_tel();
		this.identification_number = user.getIdentification_number();
		this.is_belong_student_organization = user.getIs_belong_student_organization();
		this.is_contact = user.getIs_contact();
		this.is_delete = user.getIs_delete();
		this.is_start = user.getIs_start();
		this.joiningDate = user.getJoiningDate();
		this.member_sn = user.getMember_sn();
		this.name = user.getName();
		this.native_place = user.getNative_place();
		this.phone_number = user.getPhone_number();
		this.school_year = user.getSchool_year();
		this.student_organization_Name = user.getStudent_organization_Name();
		this.address = user.getAddress();
		this.create_by = user.getCreate_by();
		this.grade_id = user.getGrade_id();
		this.guardian = user.getGuardian();
		this.photo = user.getPhoto();
		this.school = user.getSchool();
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Long getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Long create_time) {
		this.create_time = create_time;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getGrade_name() {
		return grade_name;
	}

	public void setGrade_name(String grade_name) {
		this.grade_name = grade_name;
	}

	public String getHome_tel() {
		return home_tel;
	}

	public void setHome_tel(String home_tel) {
		this.home_tel = home_tel;
	}

	public String getIdentification_number() {
		return identification_number;
	}

	public void setIdentification_number(String identification_number) {
		this.identification_number = identification_number;
	}

	public Boolean getIs_belong_student_organization() {
		return is_belong_student_organization;
	}

	public void setIs_belong_student_organization(Boolean is_belong_student_organization) {
		this.is_belong_student_organization = is_belong_student_organization;
	}

	public Boolean getIs_contact() {
		return is_contact;
	}

	public void setIs_contact(Boolean is_contact) {
		this.is_contact = is_contact;
	}

	public Boolean getIs_delete() {
		return is_delete;
	}

	public void setIs_delete(Boolean is_delete) {
		this.is_delete = is_delete;
	}

	public Boolean getIs_start() {
		return is_start;
	}

	public void setIs_start(Boolean is_start) {
		this.is_start = is_start;
	}

	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getMember_sn() {
		return member_sn;
	}

	public void setMember_sn(String member_sn) {
		this.member_sn = member_sn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNative_place() {
		return native_place;
	}

	public void setNative_place(String native_place) {
		this.native_place = native_place;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getSchool_year() {
		return school_year;
	}

	public void setSchool_year(String school_year) {
		this.school_year = school_year;
	}

	public String getStudent_organization_Name() {
		return student_organization_Name;
	}

	public void setStudent_organization_Name(String student_organization_Name) {
		this.student_organization_Name = student_organization_Name;
	}

	public Integer getAddress() {
		return address;
	}

	public void setAddress(Integer address) {
		this.address = address;
	}

	public Integer getCreate_by() {
		return create_by;
	}

	public void setCreate_by(Integer create_by) {
		this.create_by = create_by;
	}

	public Integer getGrade_id() {
		return grade_id;
	}

	public void setGrade_id(Integer grade_id) {
		this.grade_id = grade_id;
	}

	public Integer getGuardian() {
		return guardian;
	}

	public void setGuardian(Integer guardian) {
		this.guardian = guardian;
	}

	public Integer getPhoto() {
		return photo;
	}

	public void setPhoto(Integer photo) {
		this.photo = photo;
	}

	public Integer getSchool() {
		return school;
	}

	public void setSchool(Integer school) {
		this.school = school;
	}
	
	
}

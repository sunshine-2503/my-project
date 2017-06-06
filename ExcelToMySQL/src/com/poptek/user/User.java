package com.poptek.user;

/**
 * 
 * <p>Title:User</p>
 * <p>Company:普及科技</p>
 * @author Jerry
 * @date 2016年9月8日 上午10:04:08
 */
public class User {
	private Integer id; //id
	private String birthday; //生日
	private Long create_time = null; //创建时间
	private String department = null; //部门
	private String mail; //邮箱
	private String gender; //性别
	private String grade_name = null; //年级名称
	private String home_tel; //家庭电话
	private String identification_number; //身份证号
	private Boolean is_belong_student_organization; //是否属于学生组织
	private Boolean is_contact; 
	private Boolean is_delete; 
	private Boolean is_start; 
	private String joiningDate = null; //入会时间
	private String member_sn; //会员编号
	private String member_status; //会员状态
	private String member_type; //会员类型
	private String name; //姓名
	private String native_place = null; //籍贯
	private String password = null; //密码
	private String phone_number; //手机号
	private String school_year; //学年
	private String student_organization_Name = null; //学生组织名称
	private String update_date = null; //更新时间
	private String username = null; //用户名
	private String user_type = null; //用户类型
	private Integer address; //用戶地址id
	private Integer create_by;  //創建人
	private Integer grade_id; //年級id
	private Integer guardian; //監護人
	private Integer integral; //積分
	private Integer photo; //圖片
	private Integer school; //學校id
	//=================================
	private String school_name;
	
	public User() {
		super();
	}

	public User(String birthday, Long create_time, String department, String mail, String gender, String grade_name,
			String home_tel, String identification_number, Boolean is_belong_student_organization, Boolean is_contact,
			Boolean is_delete, Boolean is_start, String joiningDate, String member_sn, String member_status,
			String member_type, String name, String native_place, String password, String phone_number,
			String school_year, String student_organization_Name, String update_date, String username, String user_type,
			Integer address, Integer create_by, Integer grade_id, Integer guardian, Integer integral, Integer photo) {
		super();
		this.birthday = birthday;
		this.create_time = create_time;
		this.department = department;
		this.mail = mail;
		this.gender = gender;
		this.grade_name = grade_name;
		this.home_tel = home_tel;
		this.identification_number = identification_number;
		this.is_belong_student_organization = is_belong_student_organization;
		this.is_contact = is_contact;
		this.is_delete = is_delete;
		this.is_start = is_start;
		this.joiningDate = joiningDate;
		this.member_sn = member_sn;
		this.member_status = member_status;
		this.member_type = member_type;
		this.name = name;
		this.native_place = native_place;
		this.password = password;
		this.phone_number = phone_number;
		this.school_year = school_year;
		this.student_organization_Name = student_organization_Name;
		this.update_date = update_date;
		this.username = username;
		this.user_type = user_type;
		this.address = address;
		this.create_by = create_by;
		this.grade_id = grade_id;
		this.guardian = guardian;
		this.integral = integral;
		this.photo = photo;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
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

	public String getMember_status() {
		return member_status;
	}

	public void setMember_status(String member_status) {
		this.member_status = member_status;
	}

	public String getMember_type() {
		return member_type;
	}

	public void setMember_type(String member_type) {
		this.member_type = member_type;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
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

	public Integer getIntegral() {
		return integral;
	}

	public void setIntegral(Integer integral) {
		this.integral = integral;
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

	public String getSchool_name() {
		return school_name;
	}

	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", birthday=" + birthday + ", create_time=" + create_time + ", department="
				+ department + ", mail=" + mail + ", gender=" + gender + ", grade_name=" + grade_name + ", home_tel="
				+ home_tel + ", identification_number=" + identification_number + ", is_belong_student_organization="
				+ is_belong_student_organization + ", is_contact=" + is_contact + ", is_delete=" + is_delete
				+ ", is_start=" + is_start + ", joiningDate=" + joiningDate + ", member_sn=" + member_sn
				+ ", member_status=" + member_status + ", member_type=" + member_type + ", name=" + name
				+ ", native_place=" + native_place + ", password=" + password + ", phone_number=" + phone_number
				+ ", school_year=" + school_year + ", student_organization_Name=" + student_organization_Name
				+ ", update_date=" + update_date + ", username=" + username + ", user_type=" + user_type + ", address="
				+ address + ", create_by=" + create_by + ", grade_id=" + grade_id + ", guardian=" + guardian
				+ ", integral=" + integral + ", photo=" + photo + ", school=" + school + "]";
	}

}

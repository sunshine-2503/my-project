package com.poptek.school;

/**
 * 
 * <p>Title:School</p>
 * <p>Company:普及科技</p>
 * @author Jerry
 * @date 2016年9月9日 上午10:14:01
 */
public class School {
	private Integer id = null;
	private String _desc = null;
	private boolean is_delete = false;
	private String schoolName;
	private Integer school_type;
	private Integer sort_order = 1;
	private Integer optlock = 0;
	
	public School() {
		super();
	}

	public School(Integer id, String _desc, boolean is_delete, String schoolName, Integer school_type,
			Integer sort_order, Integer optlock) {
		super();
		this.id = id;
		this._desc = _desc;
		this.is_delete = is_delete;
		this.schoolName = schoolName;
		this.school_type = school_type;
		this.sort_order = sort_order;
		this.optlock = optlock;
	}

	public School(String schoolName) {
		Integer school_type = 0;
		if(schoolName!=null && schoolName.contains("小學")){
			school_type = 1;
		} else if(schoolName!=null && schoolName.contains("中學")){
			school_type = 2;
		} else if(schoolName!=null && schoolName.contains("大學")){
			school_type = 3;
		} else {
			school_type = 4;
		}
		this.schoolName = schoolName;
		this.school_type = school_type;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String get_desc() {
		return _desc;
	}

	public void set_desc(String _desc) {
		this._desc = _desc;
	}

	public boolean isIs_delete() {
		return is_delete;
	}

	public void setIs_delete(boolean is_delete) {
		this.is_delete = is_delete;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public Integer getSchool_type() {
		return school_type;
	}

	public void setSchool_type(Integer school_type) {
		this.school_type = school_type;
	}

	public Integer getSort_order() {
		return sort_order;
	}

	public void setSort_order(Integer sort_order) {
		this.sort_order = sort_order;
	}

	public Integer getOptlock() {
		return optlock;
	}

	public void setOptlock(Integer optlock) {
		this.optlock = optlock;
	}

	@Override
	public String toString() {
		return "School [id=" + id + ", _desc=" + _desc + ", is_delete=" + is_delete + ", schoolName=" + schoolName
				+ ", school_type=" + school_type + ", sort_order=" + sort_order + ", OPTLOCK=" + optlock + "]";
	}
	
}

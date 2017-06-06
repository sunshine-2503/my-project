package com.poptek.guardian;

/**
 * 監護人
 * <p>Title:Guardian</p>
 * <p>Company:普及科技</p>
 * @author Jerry
 * @date 2016年9月9日 下午12:53:09
 */
public class Guardian {
	private Integer id;
	private Long create_time;;
	private Boolean is_delete;
	private String name;
	private String phone_number;
	private String relationship;
	private Integer create_by;
	
	public Guardian() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Guardian(Integer id, String name, String phone_number) {
		super();
		this.id = id;
		this.name = name;
		this.phone_number = phone_number;
	}


	public Guardian(Integer id, Long create_time, Boolean is_delete, String name, String phone_number,
			String relationship, Integer create_by) {
		super();
		this.id = id;
		this.create_time = create_time;
		this.is_delete = is_delete;
		this.name = name;
		this.phone_number = phone_number;
		this.relationship = relationship;
		this.create_by = create_by;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public Long getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Long create_time) {
		this.create_time = create_time;
	}

	public Boolean getIs_delete() {
		return is_delete;
	}

	public void setIs_delete(Boolean is_delete) {
		this.is_delete = is_delete;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public Integer getCreate_by() {
		return create_by;
	}

	public void setCreate_by(Integer create_by) {
		this.create_by = create_by;
	}

	@Override
	public String toString() {
		return "Guardian [id=" + id + ", create_time=" + create_time + ", is_delete=" + is_delete + ", name=" + name
				+ ", phone_number=" + phone_number + ", relationship=" + relationship + ", create_by=" + create_by
				+ "]";
	}
	
}

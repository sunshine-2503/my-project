package com.poptek.integral;

import java.util.Date;

/**
 * 
 * <p>Title:Integral</p>
 * <p>Company:普及科技</p>
 * @author Jerry
 * @date 2016年9月22日 下午4:11:10
 */
public class Integral {
	private Integer id;
	private Long create_time;
	private Date get_date;
	private Boolean is_delete;
	private Integer total_score;
	private Date valid_date;
	private Integer create_by;
	private Integer user_id;
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
	public Date getGet_date() {
		return get_date;
	}
	public void setGet_date(Date get_date) {
		this.get_date = get_date;
	}
	public Boolean getIs_delete() {
		return is_delete;
	}
	public void setIs_delete(Boolean is_delete) {
		this.is_delete = is_delete;
	}
	public Integer getTotal_score() {
		return total_score;
	}
	public void setTotal_score(Integer total_score) {
		this.total_score = total_score;
	}
	public Date getValid_date() {
		return valid_date;
	}
	public void setValid_date(Date valid_date) {
		this.valid_date = valid_date;
	}
	public Integer getCreate_by() {
		return create_by;
	}
	public void setCreate_by(Integer create_by) {
		this.create_by = create_by;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	
}

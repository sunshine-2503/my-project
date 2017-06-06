package com.poptek.address;

/**
 * 
 * <p>Title:Address</p>
 * <p>Company:普及科技</p>
 * @author Jerry
 * @date 2016年9月9日 下午12:27:02
 */
public class Address {
	private Integer id;
	private String block;
	private String block_number;
	private Long create_time;
	private String floot;
	private Boolean is_delete;
	private String room;
	private String street;
	private Integer city;
	private Integer country;
	private Integer create_by;
	private Integer district;
	private Integer province;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}

	public String getBlock_number() {
		return block_number;
	}

	public void setBlock_number(String block_number) {
		this.block_number = block_number;
	}

	public Long getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Long create_time) {
		this.create_time = create_time;
	}

	public String getFloot() {
		return floot;
	}

	public void setFloot(String floot) {
		this.floot = floot;
	}

	public Boolean getIs_delete() {
		return is_delete;
	}

	public void setIs_delete(Boolean is_delete) {
		this.is_delete = is_delete;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getCity() {
		return city;
	}

	public void setCity(Integer city) {
		this.city = city;
	}

	public Integer getCountry() {
		return country;
	}

	public void setCountry(Integer country) {
		this.country = country;
	}

	public Integer getCreate_by() {
		return create_by;
	}

	public void setCreate_by(Integer create_by) {
		this.create_by = create_by;
	}

	public Integer getDistrict() {
		return district;
	}

	public void setDistrict(Integer district) {
		this.district = district;
	}

	public Integer getProvince() {
		return province;
	}

	public void setProvince(Integer province) {
		this.province = province;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", block=" + block + ", block_number=" + block_number + ", create_time="
				+ create_time + ", floot=" + floot + ", is_delete=" + is_delete + ", room=" + room + ", street="
				+ street + ", city=" + city + ", country=" + country + ", create_by=" + create_by + ", district="
				+ district + ", province=" + province + "]";
	}
	
}

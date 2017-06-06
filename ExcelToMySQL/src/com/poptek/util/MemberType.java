package com.poptek.util;

/**
 * 会员类型；
 * 
 * @author Shawearn
 * 
 */
public enum MemberType {
	/**
	 * 普通會員
	 */
	GEREN("個人會員"), 
	
	/**
	 * 永久會員
	 */
	YONGJIU("永久會員"), 
	
	/**
	 * 榮譽會員
	 */
	RONGYU("榮譽會員"), 
	
	/**
	 * 團體會員
	 */
	TUANTI("團體會員"),
	
	/**
	 * 空缺編號
	 */
	KONGQUE("空缺編號");

	private String name;

	private MemberType(String name) {
		// TODO Auto-generated constructor stub
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}
}

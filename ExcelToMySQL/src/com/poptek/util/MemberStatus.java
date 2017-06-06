package com.poptek.util;

/**
 * 會員狀態；
 * 
 * @author shawearn
 *
 */
public enum MemberStatus {

	/**
	 * 完成更新；
	 */
	UPDATECOMPLETE("已完成更新"),
	
	/**
	 * 無法聯絡；
	 */
	UNABLETOCONTACT("無法聯絡"),

	/**
	 * 待聯絡更新；
	 */
	WAITINGFORUPDATE("待聯絡更新"),

	/**
	 * 逾期繳費；
	 */
	OVERDUEPAYMENT("逾期繳費"),

	/**
	 * 拒絕更新；
	 */
	REFUSEUPDATE("拒絕更新"),

	/**
	 * 拒絕聯絡；
	 */
	REFUSECONTACT("拒絕聯絡"),

	/**
	 * 逾期續期；
	 */
	LATERENEWAL("逾期繳費"),

	/**
	 * 空缺編號；
	 */
	NONUMBER("空缺編號"),

	/**
	 * 拒絕電話聯絡；
	 */
	REFUSETELCONTACT("拒絕電話聯絡"),

	/**
	 * 拒絕電話聯絡；
	 */
	NEWMEMBER("新入會待審核"),

	/**
	 * 已更新待核對
	 */
	NOCHECK("已更新待核對"),
	
	/**
	 * 地址不全
	 */
	ADDRESSINCOMPLETE("地址不全"),
	
	/**
	 * 當事人要求
	 */
	PARTYDEMAND("當事人要求"),
	
	/**
	 * 已故
	 */
	DIEDMEMBER("已故"),
	
	/**
	 * 申請退會
	 */
	APPLYTOREMOVE("申請退會"),
	
	/**
	 * 已退會
	 */
	REMOVEDMEMBER("已退會");
	
	private String name;

	private MemberStatus(String name) {
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

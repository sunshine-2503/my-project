package com.poptek.address;

import java.util.List;

import org.junit.Test;

/**
 * 
 * <p>Title: AddressTest</p>
 * <p>Company: 普及科技</p>
 * @author Jerry
 * @date 2016年9月11日 下午11:57:46
 */
public class AddressTest {
	
	@Test
	public void testDemo(){
		List<Integer> ids = AddressService.getAddressIdsByDb();
		System.out.println(ids.size());
	}
	
}

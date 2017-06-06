package com.poptek.guardian;

import java.util.List;

import org.junit.Test;

/**
 * 
 * <p>Title:GuardianTest</p>
 * <p>Company:普及科技</p>
 * @author Jerry
 * @date 2016年9月9日 下午1:07:56
 */
public class GuardianTest {
	public static void main(String[] args) {
		//得到表格中的左右數據
		List<Guardian> guardianList = null;
		guardianList = GuardianService.getSchoolsByExcel("D://Guardian.xls");
		System.out.println(guardianList.size());
//		for (Guardian guardian : guardianList) {
//			GuardianService.addGuardian(guardian);
//			System.out.println(guardian.toString());
//		}
	}
	
	@Test
	public void testDemo(){
		List<Integer> list = GuardianService.getGuardianIdsByDb();
		System.out.println(list.size());
	}
}

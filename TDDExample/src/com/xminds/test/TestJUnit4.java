package com.xminds.test;

import org.junit.Assert;
import org.junit.Test;

import com.xminds.main.LeapYear;

public class TestJUnit4 {
	@Test
	public void test4(){
		Assert.assertEquals(true, LeapYear.isLeap(2019));
	}
}

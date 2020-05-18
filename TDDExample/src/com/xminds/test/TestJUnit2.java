package com.xminds.test;

import org.junit.Assert;
import org.junit.Test;

import com.xminds.main.LeapYear;

public class TestJUnit2 {
	@Test
	public void test2(){
		Assert.assertEquals(true, LeapYear.isLeap(2100));
	}
}

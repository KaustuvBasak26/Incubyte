package com.xminds.test;

import org.junit.Assert;
import org.junit.Test;

import com.xminds.main.LeapYear;

public class TestJUnit1 {
	@Test
	public void test1(){
		Assert.assertEquals(false, LeapYear.isLeap());
	}
}

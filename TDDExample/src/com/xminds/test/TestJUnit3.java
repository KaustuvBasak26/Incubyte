package com.xminds.test;

import org.junit.Assert;
import org.junit.Test;

import com.xminds.main.LeapYear;

public class TestJUnit3 {
	@Test
	public void test3(){
		Assert.assertEquals(true, LeapYear.isLeap(2016));
	}
}

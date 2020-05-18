package com.xminds.main;

public class LeapYear {
	public static boolean isLeap(int year){
		if(year%400 == 0){
			return true; 		//added rule 1: if year is divisible by 400 the it is leap
		}
		return false;
	}
}

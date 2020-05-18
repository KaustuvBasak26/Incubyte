package com.xminds.main;

public class LeapYear {
	public static boolean isLeap(int year){
		if(year%100 == 0 && year%400 !=0){
			return false;		//added rule 2: if year is divisible by 100 but not divisible by 400 then it is not a leap year 
		}
		if(year%400 == 0){
			return true; 		//added rule 1: if year is divisible by 400 then it is leap
		}
		return false;
	}
}

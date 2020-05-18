package com.xminds.main;

public class LeapYear {
	public static boolean isLeap(int year){
		
		if(year%4 != 0){
			return false;		//added rule 4: if year is not divisible by 4, it is not a leap year 
		}else
		if(year%4 == 0 && year%100 !=0){
			return true;		//added rule 3: if year is divisible by 4 but not divisible by 100 then it is a leap year 
		}else
		if(year%100 == 0 && year%400 !=0){
			return false;		//added rule 2: if year is divisible by 100 but not divisible by 400 then it is not a leap year 
		}else
		if(year%400 == 0){
			return true; 		//added rule 1: if year is divisible by 400 then it is leap
		}
		return false;
	}
}

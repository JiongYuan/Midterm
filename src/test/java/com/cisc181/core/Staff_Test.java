package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.eNums.eTitle;

import Exception.PersonException;

public class Staff_Test {
	static ArrayList<Staff> staff = new ArrayList<Staff>(5);
	public static Date date(int year, int month, int day) {
		Calendar date = Calendar.getInstance();
		date.set(year, month, day);
		return date.getTime();
		}
	private static Staff st1,st2,st3,st4,st5;
	@BeforeClass
	public static void setup() throws PersonException {
		st1= new Staff("Lucy", "Lotte", "New", date(1994,06,24),"108 E Main St, Newark, DE",
				"(302) 302-0001", "ILoveUD1@udel.edu","1 to 2", 1, 1000, date(2016,01,02), eTitle.MR );
		st2= new Staff("Luck", "Lotta", "New", date(1995,06,24), "109 E Main St, Newark, DE",
				"(302) 302-0002", "ILoveUD2@udel.edu","2 to 3", 2, 2000, date(2016,01,02), eTitle.MRS );
		st3= new Staff("Lucky", "Lot", "New", date(1996,06,24), "110 E Main St, Newark, DE", 
				"(302) 302-0003", "ILoveUD3@udel.edu","3 to 2", 3, 3000, date(2016,01,02), eTitle.MS );
		st4= new Staff("Luk", "Lot", "New", date(1997,06,24), "111 E Main St, Newark, DE",
				"(302) 302-0004", "ILoveUD4@udel.edu","2 to 1", 4, 4000, date(2016,01,02), eTitle.MRS );
		st5= new Staff("Luky", "Lot", "New", date(1998,06,24), "112 E Main St, Newark, DE",
				"(302) 302-0005", "ILoveUD4@udel.edu","1 to 2", 5, 5000, date(2016,01,02), eTitle.MR );
	
		 staff.addAll(Arrays.asList(st1,st2,st3,st4,st5));
		}
	

	@Test
	public void testAverageSalary() {
		double sum = 0.0;
		int count = 0;
		for (Staff s : staff) {
			count++;
			sum += s.getSalary();
			}
		assertEquals(sum / (double) count, 30000.0, 0.001);
		}
	@Test
	public void phoneNumberExceptionTest() throws PersonException {
		Staff s = new Staff("Luky", "Lot", "New", date(1998,06,24), "", "123-4567", "", "",
							0, 0, date(2016,01,02), eTitle.MR);
	}
	@Test
	public void dobExceptionTest() throws PersonException {
		Staff s = new Staff("Lucky", "", "Lol", date(1997,06,24), "", "(800)-123-4567", "", "",
							0, 0, date(2016,01,02), eTitle.MRS);
	}
	}



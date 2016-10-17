package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import Exception.PersonException;

public class Student_Test {
	private static ArrayList<Course>course = new ArrayList<Course>(3);
	private static ArrayList<Semester>semester = new ArrayList<Semester>(2);
	private static ArrayList<Section>sections = new ArrayList<Section>(2);
	private static ArrayList<Student>students = new ArrayList<Student>(10);
	private static ArrayList<Enrollment>enrollment = new ArrayList<Enrollment>(2);
	private static Student st1,st2,st3,st4,st5,st6,st7,st8,st9,st10;
	
	public static Date date(int year, int month, int day) {
		Calendar date = Calendar.getInstance();
		date.set(year, month, day);
		return date.getTime();
		}
	
	@BeforeClass
	public static void setup() throws Exception{
		st1= new Student("Lucy", "Lotte", "New", date(1994,06,24), eMajor.CHEM,
				"108 E Main St, Newark, DE", "(302) 302-0001", "ILoveUD1@udel.edu");
		st2= new Student("Luck", "Lotta", "New", date(1995,06,24), eMajor.COMPSI, 
				"109 E Main St, Newark, DE", "(302) 302-0002", "ILoveUD2@udel.edu");
		st3= new Student("Lucky", "Lot", "New", date(1996,06,24), eMajor.CHEM, 
				"110 E Main St, Newark, DE", "(302) 302-0003", "ILoveUD3@udel.edu");
		st4= new Student("Luk", "Lot", "New", date(1997,06,24), eMajor.COMPSI, 
				"111 E Main St, Newark, DE", "(302) 302-0004", "ILoveUD4@udel.edu");
		st5= new Student("Luky", "Lot", "New", date(1998,06,24), eMajor.NURSING, 
				"112 E Main St, Newark, DE", "(302) 302-0005", "ILoveUD4@udel.edu");
		st6= new Student("Locy", "Lot", "New", date(1999,06,24), eMajor.CHEM, 
				"113 E Main St, Newark, DE", "(302) 302-0006", "ILoveUD4@udel.edu");
		st7= new Student("Lock", "Lot", "New", date(1998,06,24), eMajor.CHEM, 
				"114 E Main St, Newark, DE", "(302) 302-0007", "ILoveUD4@udel.edu");
		st8= new Student("Locky", "Lot", "New", date(1997,06,24), eMajor.COMPSI, 
				"115 E Main St, Newark, DE", "(302) 302-0008", "ILoveUD4@udel.edu");
		st9= new Student("Lol", "Lot", "New", date(1996,06,24), eMajor.COMPSI, 
				"116 E Main St, Newark, DE", "(302) 302-0009", "ILoveUD4@udel.edu");
		st10= new Student("Lul", "Lot", "New", date(1995,06,24), eMajor.NURSING, 
				"117 E Main St, Newark, DE", "(302) 302-0010", "ILoveUD4@udel.edu");
		students.addAll(Arrays.asList(st1,st2,st3,st4,st5,st6,st7,st8,st9,st10));
		
		Course c1 = new Course(null, "CHEM", 4);
		Course c2 = new Course(null, "NURSING", 2);
		Course c3 = new Course(null, "COMPSI", 4);
		course.addAll(Arrays.asList(c1,c2,c3));
		
		Semester fall = new Semester(null, date(2016,8,28));
		Semester spring = new Semester(null, date(2016,2,26));
		semester.addAll(Arrays.asList(fall, spring));
		
		Section s1 = new Section(c1.getCourseID(),spring.getSemesterID(), 999, null);
		Section s2 = new Section(c2.getCourseID(),spring.getSemesterID(), 888, null);
		Section s3 = new Section(c3.getCourseID(),spring.getSemesterID(), 777, null);
		Section s4 = new Section(c1.getCourseID(),spring.getSemesterID(), 666, null);
		Section s5 = new Section(c2.getCourseID(),spring.getSemesterID(), 555, null);
		Section s6 = new Section(c3.getCourseID(),spring.getSemesterID(), 444, null);
		sections.addAll(Arrays.asList(s1,s2,s3,s4,s5,s6));
		for(Student student: students){
			for(Section section: sections){enrollment.add(
					new Enrollment(student.getStudentID(), section.getSectionID()));
		}
	}
		}
	}


	
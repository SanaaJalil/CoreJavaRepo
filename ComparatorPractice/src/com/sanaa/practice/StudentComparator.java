package com.sanaa.practice;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub
		int result=0;
		System.out.println("fffffffffffffffffffffffffff");
		if(student1.getStudentID()> student2.getStudentID()) {
			result=1;
		}
		if(student1.getStudentID()< student2.getStudentID()) {
			result=-1;
		}
		if(student1.getStudentID()==student2.getStudentID()) {
			result= 0;
		}
		return result;
	}

	
	
}

package com.sanaa.practice.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.sanaa.practice.Student;
import com.sanaa.practice.StudentComparator;

public class ComparatorMainApp {
//this app is to know functionality of how comparator is working ...
	//comparator is interface that used compare two java objects of the same class type using a method compare 
	//that needs to be implemented by user
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList=new ArrayList<>();
		Student student1=new Student(16);
		Student student2=new Student(1);
		Student student3=new Student(10);
		Student student4=new Student(5);
		Student student5=new Student(70);
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		//here we r sorting based on student-id
		Collections.sort(studentList, new StudentComparator());
		for(Student student:studentList) {
			System.out.println(student.getStudentID());
		}


	}

}

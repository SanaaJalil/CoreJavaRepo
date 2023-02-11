package com.sanaa.practice;

public class Student{
private int studentID;

public Student(int studentID) {
	//compare student in list based on there student-id using comparator class that u have created
	this.studentID = studentID;
}

public int getStudentID() {
	return studentID;
}

public void setStudentID(int studentID) {
	this.studentID = studentID;
}

}

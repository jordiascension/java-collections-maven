package com.emc.lists;

import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = StudentList.CreateList();

		List<Student> studentSpainList = StudentList
				.getStudentsByCountry(studentList, "Spain");

		StudentList.loopThroughList(studentSpainList);

	}

}

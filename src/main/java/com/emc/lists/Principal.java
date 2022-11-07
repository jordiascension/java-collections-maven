package com.emc.lists;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = new ArrayList<Student>();

		Student student = new Student();
		student.setId(1);
		student.setName("Pepe");

		studentList.add(student);

		Student student1 = new Student();
		student1.setId(2);
		student1.setName("Alberto");

		studentList.add(student1);

		for (Student student2 : studentList) {
			System.out.println(student2.getId());
			System.out.println(student2.getName());
		}

	}

}

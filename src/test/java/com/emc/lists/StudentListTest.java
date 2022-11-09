package com.emc.lists;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

class StudentListTest {

	@Test
	void testCreateList() {
		List<Student> studentList = StudentList.CreateList();
		assertTrue(studentList != null);
		assertTrue(studentList.size() == 2);
	}

	@Test
	void testgetStudentsByCountry() {
		List<Student> studentList = StudentList.CreateList();
		List<Student> studentSpainList = StudentList
				.getStudentsByCountry(studentList, "Spain");
		assertTrue(studentSpainList.size() == 1);
		Student spanishStudent = studentSpainList.get(0);
		assertTrue(spanishStudent.getName() == "Alberto");
	}

	@Test
	void testgetAdultStudents() {
		List<Student> studentList = StudentList.CreateList();
		List<Student> studentSpainList = StudentList
				.getAdultStudents(studentList);
		assertTrue(studentSpainList.size() == 1);
		Student adultStudent = studentSpainList.get(0);
		assertTrue(adultStudent.getName() == "Alberto");
	}

}

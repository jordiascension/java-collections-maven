package com.emc.lists;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("StudentList Test Case")
class StudentListTest {

	@Test
	@DisplayName("Test Student List Creation")
	void testCreateList() {
		List<Student> studentList = StudentList.CreateList();
		assertTrue(studentList != null, "StudentList is not created");
		assertTrue(studentList.size() == 2, "We don't have two students");
	}

	@Test
	@DisplayName("Test Students By Country")
	void testgetStudentsByCountry() {
		List<Student> studentList = StudentList.CreateList();
		List<Student> studentSpainList = StudentList
				.getStudentsByCountry(studentList, "Spain");
		assertTrue(studentSpainList.size() == 1,
				"We don't have one Spanish Student");
		Student spanishStudent = studentSpainList.get(0);
		assertTrue(spanishStudent.getName() == "Alberto",
				"Alberto is not from Spain");

	}

	@Test
	@DisplayName("Test Adult Students")
	void testgetAdultStudents() {
		List<Student> studentList = StudentList.CreateList();
		List<Student> studentSpainList = StudentList
				.getAdultStudents(studentList);
		assertTrue(studentSpainList.size() == 1,
				"We don't have adult students");
		Student adultStudent = studentSpainList.get(0);
		assertTrue(adultStudent.getName() == "Alberto", "Alberto is not adult");
	}

}

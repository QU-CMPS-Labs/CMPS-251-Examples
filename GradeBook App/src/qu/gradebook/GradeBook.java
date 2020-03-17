package qu.gradebook;

import java.util.ArrayList;

public class GradeBook {
	private Course course;
	private ArrayList<Student> students;

	public GradeBook(Course course) {
		this.course = course;
		this.students = new ArrayList<Student>();
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public Student getMinimumGrade() {
		// 1. Step one : the first student is the one with the highest

		Student minGradeStudent = students.get(0); // 89.00

		for (Student s : students) {
			if (s.getGrade() < minGradeStudent.getGrade()) // 98.00 > 89.00
				minGradeStudent = s;
		}

		return minGradeStudent;

	}

	// min -7
	public Student getMaximumGrade() {
		// 1. Step one : the first student is the one with the highest
		Student maxGradeStudent = students.get(0); // 89.00

		// 2. write a loop and try to find a grade greater than this

		for (Student s : students) {
			if (s.getGrade() > maxGradeStudent.getGrade()) // 98.00 > 89.00
				maxGradeStudent = s;
		}

		return maxGradeStudent;
	}

	public double getAverage() {
		// 1. Step one : the first student is the one with the highest
		double sum = 0; // 89.00

		// 2. write a loop and try to find a grade greater than this

		for (Student s : students) {
			sum += s.getGrade();
		}

		return sum / students.size();
	}

	public void displayGrades() {
		System.out.println("The grades for " + course.getCode() + " " + course.getName());

		System.out.println("Id\tFirstName\tLastName\tGrade");

		for (Student s : students) {
			System.out.printf("%d\t%10s\t%s\t\t%.2f\n", s.getId(), s.getFirstName(), s.getLastName(), s.getGrade());
		}

		Student studentWithMaxGrade = getMaximumGrade();
		Student studentWithMinGrade = getMinimumGrade();
		
		System.out.println("The student with the max Grade is " + studentWithMaxGrade.getFirstName() + " and his grade is " + studentWithMaxGrade.getGrade());
		System.out.println("The student with the min Grade is " + studentWithMinGrade.getFirstName() + " and his grade is " + studentWithMinGrade.getGrade());
		System.out.printf("The avg Grade is %.2f" , getAverage());
	}

}

//The grades for CMPS 151 Programming Concept
package qu.gradebook;

public class GradeBooktest {

	public static void main(String []args) {


		Course course = new Course("CMPS 151",  "Programming Concept");
		Student student1 = new Student(123, "Abdulahi", "Hassen", 89);
		Student student2 = new Student(124, "Mustafa", "Elmi", 98);
		Student student3 = new Student(125, "Mohamed", "Hassen", 75);
		Student student4 = new Student(123, "Omar", "Hassen", 66);
		Student student5 = new Student(124, "Abdo", "Elmi", 44);
		Student student6 = new Student(125, "Yasser", "Hassen", 89);

		GradeBook book = new GradeBook(course);
		book.addStudent(student1);
		book.addStudent(student2);
		book.addStudent(student3);
		book.addStudent(student4);
		book.addStudent(student5);
		book.addStudent(student6);

		book.displayGrades();


		Course course = new Course("CMPS 251" , "OOP");
		Student s1 = new Student(1, "Abdulahi", "Hassen", 96);
		Student s2 = new Student(1, "Reem", "Ali", 100);
		Student s3 = new Student(1, "Alia", "Omar", 50);
		
		GradeBook gradebook = new GradeBook(course);
		gradebook.addStudent(s1);
		gradebook.addStudent(s2);
		gradebook.addStudent(s3);
		gradebook.displayGrades();

	}
}

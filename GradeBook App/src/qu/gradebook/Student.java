package qu.gradebook;

public class  Student{
	private int id;
	private String firstName;
	private String lastName;
	private double grade;
	
	public Student(int id, String firstname, String lastname, double grade) {
		setId(id);
		setFirstName(firstname);
		setLastName(lastname);
		setGrade(grade);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
//	The grades for [course]
// 			

	
	
}

package android;

public class Student extends Person {
private	int  grade;
private	String schoolName;
	
	public Student(int  grade,String schoolName,int age,String fullName,Address address){
		super (age,fullName,address);
		this.grade=grade;
		this.schoolName=schoolName;
		
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	

}

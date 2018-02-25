package android;

public class Student extends Person {
private	int  grade;
private	String schoolName;
	
	public Student(int  grade,String schoolName,int age,String fullName,Address address){
		super (age,fullName,address);
		this.grade=grade;
		this.schoolName=schoolName;
		
	}
	

}

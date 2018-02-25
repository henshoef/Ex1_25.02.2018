package android;

public class Ex {
public static void main(String[] args) {
	Address address=new Address("Haalon", 52, "Kefar yona", "Israel");
	Student hen=new Student(100, "JB", 23, "Hen Shoef", address);
	Student ron=new Student(90, "JB", 21, "Ron Edri", address);
	hen.setGrade(95);
	System.out.println(hen.getGrade());
	
}
}

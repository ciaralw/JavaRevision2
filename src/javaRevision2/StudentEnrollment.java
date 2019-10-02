package javaRevision2;

public class StudentEnrollment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("Bob", 72);
		Student student2 = new Student("Petunia", 94);
		Student student3 = new Student("Jimmy", 83);
		System.out.println(Student.numberOfStudents); //call the variable
		System.out.println(Student.getNumberOfStudents()); //call the method
	}
	

}

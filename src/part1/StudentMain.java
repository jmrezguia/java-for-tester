package part1;

public class StudentMain {

	public static void main(String[] args) {
		
		Student stu1 = new Student(103, "Ramla",'A');

		//1 Assign values to variables by using reference variable
		stu1.sid = 101;
		stu1.sname= "jihen";
		stu1.grade='A';
		stu1.display();
		
		//2 Assign values to variables by using reference Method
		stu1.getValue(102,"amal",'A');
		stu1.display();
		
		//2 Assign values to variables by using reference constructor
		stu1.display();
	}

}

package part1;

public class Empl {
	
	int eid;
	String ename;
	double sal;
	int deptno;
	String job;
	
	void display() {
		System.out.println(eid);              //
		System.out.println(ename);            //
		System.out.println(sal);             //           class
		System.out.println(deptno);         //
		System.out.println(job);            //
	}
	

	public static void main(String[] args) {
		
		// Creating object ==> Is an instance of class
				Employee emp1 = new Employee();                   //
				emp1.eid = 1011;                                   //
				emp1.ename ="jihen";                               //          intance
				emp1.deptno=15;                                    //
				emp1.job= "test Automation";                       //
				emp1.sal=100.00;                                   //
				emp1.display();                                    //

		
	}

}

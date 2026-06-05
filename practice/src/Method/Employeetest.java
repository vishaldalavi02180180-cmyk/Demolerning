package Method;

public class Employeetest {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.id=102;
		e.depart="It";
		
		EmployeeInfo ei=new EmployeeInfo();
		
		ei.getData(e);
		
		
	}

}

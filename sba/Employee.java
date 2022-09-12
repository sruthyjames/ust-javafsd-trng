package SBA;

abstract class Employee {
	String name="Sruthy";
	int emp_id=3456;
	
	abstract float calculateSalary();
	abstract void fetchDepartment();
}

class Engineer extends Employee{
	float calculateSalary() {
		return 4.5f;
	}
	void fetchDepartment() {
		System.out.println("Delivery");
	}
}

class Doctor extends Employee{
	float calculateSalary() {
		return 4.5f;
	}
	void fetchDepartment() {
		System.out.println("Cardiology");
	}
	}

class Main00{
	public static void main(String[]args)
	{
		// Employee E1=new Employee();
		Engineer e=new Engineer();
		Doctor d=new Doctor();
		System.out.println(e.calculateSalary());
		
		e.fetchDepartment();
		System.out.println(d.name);
		System.out.println(d.emp_id);
		System.out.println(d.calculateSalary());
		d.fetchDepartment();

	}

}

package example2;
class Employee{
	int employeeid;
	String employeename;
	double salary;
	public Employee(int employeeid, String employeename) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
class contractEmployee extends Employee{
	double wage;
	float workedhours;
	public contractEmployee(int employeeid,String employeename,double wage,float workedhours){
		super(employeeid, employeename);
		this.employeeid=employeeid;
		this.employeename=employeename;
		this. wage=wage;
		this.workedhours=workedhours;
		
	}
	void calculateSalary() {
		salary= workedhours*wage;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public float getWorkedhours() {
		return workedhours;
	}
	public void setWorkedhours(float workedhours) {
		this.workedhours = workedhours;
	}
	
}
class PermenentEmployee extends Employee
{
	double basicpay;
	double hra;
	float experience;
	public PermenentEmployee(int employeeid,String employeename,double basicpay,double hra,float experience)
	{
		super(employeeid, employeename);
		this.basicpay=basicpay;
		this.hra=hra;
		this.experience=experience;
		
	}
	void calculatemonthlysalary() {
		double variablecomponent=0;
		if (experience<3) {
			 variablecomponent=0;
			
		}else if(experience>=3&&experience<5){
			 variablecomponent=basicpay * 0.05;
			
		}else if (experience>=5&&experience<10) {
			 variablecomponent= basicpay *0.07;
			
		}else if (experience>=10) {
			 variablecomponent= basicpay *0.12;
		}
		salary = Math.round((basicpay+hra+variablecomponent));
	}
	public double getBasicpay() {
		return basicpay;
	}
	public void setBasicpay(double basicpay) {
		this.basicpay = basicpay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public float getExperience() {
		return experience;
	}
	public void setExperience(float experience) {
		this.experience = experience;
	}
	
	}

public class Inheritence {
	public static void main(String[] args) {
		PermenentEmployee s=new PermenentEmployee(711511,"Rafel",1855,115,3.5f);
		s.calculatemonthlysalary();
		System.out.println("Hi "+s.getEmployeename()+" your salary is $"+s.getSalary());
		contractEmployee k= new contractEmployee(102,"jennifer",16,90);
		k.calculateSalary();
		System.out.println("Hi "+k.getEmployeename()+" your salary is $"+k.getSalary());
	}

}

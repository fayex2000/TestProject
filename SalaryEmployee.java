
public class SalaryEmployee implements PayType{
	double salary;
	
	public double getSalary() {
		return salary;
	}

	SalaryEmployee(double salary)
	{
		this.salary = salary;
	}
}

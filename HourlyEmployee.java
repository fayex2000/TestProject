
public class HourlyEmployee implements PayType{
	int hours;
	double hourlySalary;
	
	
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getHourlySalary() {
		return hourlySalary;
	}

	public void setHourlySalary(double hourlySalary) {
		this.hourlySalary = hourlySalary;
	}

	
	HourlyEmployee(int hour, double sal)
	{
		this.hours = hour;
		this.hourlySalary = sal;
	}


	public double getSalary() {
		// TODO Auto-generated method stub
		return hours * hourlySalary;
	}

}

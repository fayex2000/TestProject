import java.util.Comparator;

public  class Employee  implements Comparator<Employee>{
	
	PayType pt;
	
	public PayType getPt() {
		return pt;
	}
	public void setPt(PayType pt) {
		this.pt = pt;
	}
	Employee(PayType p)
	{
		this.pt = p;
	}
	
	
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		if (o1 == null)
			throw new NullPointerException();
		
		return 0;
	}
	
}

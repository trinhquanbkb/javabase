package javabasis;

public abstract class Employee implements IEmployee{
	private String name;
	private int paymentPerHour;
	public Employee(String name, int paymentPerHour) {
		this.name=name;
		this.paymentPerHour=paymentPerHour;
	}
	public void setName(String name) {
		this.name=name;
	}
	@Override
	public String getName() {
		return this.name;
	}
	public void setPaymentPerHour(int paymentPerHour) {
		this.paymentPerHour=paymentPerHour;
	}
	public int getPaymentPerHour() {
		return this.paymentPerHour;
	}
}
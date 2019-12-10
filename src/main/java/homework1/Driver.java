package homework1;

public class Driver {

	private Car cr;

	public void driverInfo() {
		System.out.println("I'm such a professional driver");

		cr.myCar();

	}

	public Car getCr() {
		return cr;
	}

	public void setCr(Car cr) {
		this.cr = cr;
	}

}

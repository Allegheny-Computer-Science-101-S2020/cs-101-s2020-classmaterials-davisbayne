class Car extends Vehicle{
	private int maxCapacity;
	Car(){} // default constructor
	Car(int cap){
		super(12);
		maxCapacity = cap;
	}
	public void printInfo(){
		System.out.println("Vehicle:" + super.maxCapacity);
		System.out.println("Car:" + this.maxCapacity);
	}
	void printM1(){
		System.out.println("M1.Car");
	}
	void printM2(){
		System.out.println("M2.Car");
	}
}

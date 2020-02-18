public abstract class Transaction{
	double product_price;
	abstract double checkout();
	public double getProductPrice(){
		return this.product_price;
	}
	public void setProductPrice(double price){
		this.product_price = price;
	}
}
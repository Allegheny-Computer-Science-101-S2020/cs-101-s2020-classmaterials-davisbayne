public class StoreTransaction extends Transaction{
  double checkout(){
    double tax = super.getProductPrice()/10;
    double res = super.getProductPrice() + tax;
    return res;
  }
  
}
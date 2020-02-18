public class OnlineTransaction extends Transaction{
  double checkout(){
    double tax = super.getProductPrice()/5;
    double res = super.getProductPrice() + tax;
    return res;
  }
  
}
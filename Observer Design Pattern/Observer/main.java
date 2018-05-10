package Observer;

public class main {
    public static void main(String[] args) {
        
        // instance of subject as it will be observed 
        StockGrabber stockGrabber = new StockGrabber();

        // instance of observer it will observe the  stockgrobber object  
        StockObserver observer1 = new StockObserver(stockGrabber);
        
        StockObserver observer2 = new StockObserver(stockGrabber);
        
        // make changes on the observed object
        stockGrabber.setApplePrice(677);
        stockGrabber.setGooglePrprice(690);
        stockGrabber.setIbmPrice(197);
    }
}
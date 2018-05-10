package Observer;

public class StockObserver implements IObserver
{
    private double ibmPrice, applPrice, googPrprice;
    private static int counter = 0;
    private int observerID;
    private IObservable stockGrobber;

    public StockObserver(IObservable stockGrobber) {
        this.stockGrobber = stockGrobber;
        this.observerID = ++counter;
        System.out.println("new observer " + this.observerID  );
        //will add it to arraylist of all observers 
        stockGrobber.register(this);
    }
    
    @Override
    public void update(double ibmPrice, double applPrice, double googPrice) {
        this.applPrice = applPrice;
        this.ibmPrice = ibmPrice;
        this.googPrprice = googPrice;
        printPrice();
    }
    public void printPrice(){
        System.out.println(observerID + "\nIBM : " + ibmPrice+"\ngoogPrice : " + googPrprice + "\nappPrice : "+applPrice);
    }
}
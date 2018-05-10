package Observer;

import java.util.ArrayList;
// that will be observed (observable) will notify all subscribers when an specific event done 
public class StockGrabber implements IObservable{
    
    private ArrayList<IObserver> observers; //list to register all observers
    private double ibmPrice, applPrice, googPrprice;

    public StockGrabber() {
        observers = new ArrayList<IObserver>();
    }

    @Override
    public void register(IObserver o) {
        observers.add(o);
    }

    @Override
    public void unRegister(IObserver o) {
        int index = observers.indexOf(o);
        System.out.println("observer : " + (index + 1) + " has been deleted !!");
        observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        for(IObserver o : observers){
            o.update(ibmPrice, applPrice, googPrprice);
        }
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObservers();
    }

    public void setApplePrice(double applPrice) {
        this.applPrice = applPrice;
        notifyObservers();
    }

    public void setGooglePrprice(double googPrprice) {
        this.googPrprice = googPrprice;
        notifyObservers();
    }
}

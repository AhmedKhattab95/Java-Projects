package Observer;
//all observers implemet this interface
public interface IObserver {
    //this method will be called when need to notify all aoservers from the stock class / caller / observable
    public void update(double ibmPrice, double applPrice, double googPrice);
}

package Observer;
// contract for subscribed/ observable classes
public interface IObservable {
    
    public void register(IObserver o);
    public void unRegister(IObserver o);
    public void notifyObservers();
    
}

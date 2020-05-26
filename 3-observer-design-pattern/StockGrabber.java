import java.util.ArrayList;

public class StockGrabber implements CustomSubject{

    private ArrayList<CustomObserver> observers;
    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    public StockGrabber(){
        observers = new ArrayList<CustomObserver>();
    }

    @Override
    public void register(CustomObserver newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unRegister(CustomObserver deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer:" +  (observerIndex+1)+" deleted.");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        for(CustomObserver observer: this.observers){
            observer.update(this.ibmPrice, this.applePrice, this.googlePrice);
        }
    }

    public ArrayList<CustomObserver> getObservers() {
        return this.observers;
    }

    public double getIbmPrice() {
        return this.ibmPrice;
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        this.notifyObserver();
    }

    public double getApplePrice() {
        return this.applePrice;
    }

    public void setApplePrice(double applePrice) {
        this.applePrice = applePrice;
        this.notifyObserver();
    }

    public double getGooglePrice() {
        return this.googlePrice;
    }

    public void setGooglePrice(double googlePrice) {
        this.googlePrice = googlePrice;
        this.notifyObserver();
    }
}
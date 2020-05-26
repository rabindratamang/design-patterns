public class StockObserver implements CustomObserver{
    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    private static int observerIDTracker = 0;
    private int observerID;
    private CustomSubject stockGrabber;

    public StockObserver(CustomSubject stockGrabber){
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
        System.out.println("New observer" + this.observerID);
        this.stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double applePrice, double googlePrice) {
        this.ibmPrice = ibmPrice;
        this.applePrice = applePrice;
        this.googlePrice = googlePrice;
        printPrices();
    }
    
    public void printPrices(){
        System.out.println(
            observerID + 
            "\nIBM:" + ibmPrice + 
            "\nApple:" + applePrice +
            "\nGoogle:" + googlePrice
            );
    }
}
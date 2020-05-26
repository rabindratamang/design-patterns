public class GrabStocks{
    public static void main(String[] args){
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver observer1 = new StockObserver(stockGrabber);
        StockObserver observer2 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setApplePrice(50.00);
        stockGrabber.setGooglePrice(200.00);

        stockGrabber.unRegister(observer1);
        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setApplePrice(50.00);
        stockGrabber.setGooglePrice(200.00);

        Runnable getIBM = new GetTheStock(stockGrabber, 2,"IBM", 197.00);
        Runnable getApple = new GetTheStock(stockGrabber, 2,"Apple", 677.00);
        Runnable getGoog = new GetTheStock(stockGrabber, 2,"Google", 765.00);
        new Thread(getIBM).start();
        new Thread(getApple).start();
        new Thread(getGoog).start();
    }
}
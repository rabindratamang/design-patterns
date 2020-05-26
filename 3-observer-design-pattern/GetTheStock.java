import java.text.DecimalFormat;

public class GetTheStock implements Runnable{
    private int startTime;
    private String stock;
    private double price;

    private CustomSubject stockGrabber;

    public GetTheStock(CustomSubject stockGrabber, int newStartTime, String newStock,double newPrice){
        this.stockGrabber = stockGrabber;
        this.startTime = newStartTime;
        this.stock = newStock;
        this.price = newPrice;
    }
    @Override
    public void run() {
        for(int i=1; i<=20; i++){
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e){
                double randNum = (Math.random() * (.06)) - .03;
                DecimalFormat df = new DecimalFormat("#.##");
                price = Double.valueOf(df.format(price+randNum));
                if(stock == "IBM") ((StockGrabber) stockGrabber).setIbmPrice(price);
                if(stock == "Apple") ((StockGrabber)stockGrabber).setApplePrice(price);
                if(stock == "Google") ((StockGrabber)stockGrabber).setGooglePrice(price);
                System.out.println(stock + ": " + df.format((price+randNum))+ " " + df.format(randNum));
                System.out.println();
            }
        }
    }
}
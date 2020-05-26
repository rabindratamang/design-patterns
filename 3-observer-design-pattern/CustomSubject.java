public interface CustomSubject{
    public void register(CustomObserver o);
    public void unRegister(CustomObserver o);
    public void notifyObserver();
}
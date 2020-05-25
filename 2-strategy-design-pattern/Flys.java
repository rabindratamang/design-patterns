public interface Flys{
    String Fly();
}

class ItFlys implements Flys{

    public String Fly() {
        return "Flying high";
    }
    
}

class CantFly implements Flys{
    public String Fly(){
        return "Can't Fly";
    }
}
public class Bird extends Animal{
    public Bird(){
        super();
        setSound("tweeet");
        flyingType = new ItFlys();
    }
}
public class AnimalPlay {
    public static void main(String [] args){
        Animal sparky = new Dog();
        Animal tweety = new Bird();
        System.out.println("Sparky :" + sparky.tryToFly());
        System.out.println("Tweety :" + tweety.tryToFly());

        sparky.setFlyingAbility(new ItFlys());
        System.out.println("Sparky :" + sparky.tryToFly());
    }
}
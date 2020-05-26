public abstract class EnemyShip {
    private String name;
    private double amtDamage;

    public String getName() {return name;}
    public void setName(String newName) {name = newName;}

    public Double getDamage() {return amtDamage;}
    public void setDamage(double newDamage) { amtDamage =  newDamage;}

    public void followHerowShip(){
        System.out.println(getName()+ " is following the hero ship.");
    }

    public void displayEnemyShip(){
        System.out.println(getName()+ " is on the screen.");
    }

    public void enemyShipShoots(){
        System.out.println(getName() + " attacks and does " + getDamage());
    }
}
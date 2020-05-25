public class Animal{
    
    private String name;
    private double height;
    private int weight;
    private String sound;

    public String getName(){
        return this.name;
    }

    public Animal setName(String name) {
        this.name = name;
        return this;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        if(weight > 0 ){
            this.weight = weight;
        } else {
            System.out.println("Weight must be greater than zero.");
        }
    }

    public String getSound() {
        return this.sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    // @Override
    // public String toString() {
    //     return "{" +
    //         " name='" + getName() + "'" +
    //         ", height='" + getHeight() + "'" +
    //         ", weight='" + getWeight() + "'" +
    //         ", sound='" + getSound() + "'" +
    //         "}";
    // }
}


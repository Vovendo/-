public class Body implements IProductPart{
    private int weight;
    private int numberOfWheels;

    public Body(int weight, int numberOfWheels) {
        this.weight = weight;
        this.numberOfWheels = numberOfWheels;
    }

    public int getWeight() {
        return weight;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}

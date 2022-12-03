public class Engine implements IProductPart{
    private int numberOfHorsepower;

    public Engine(int numberOfHorsepower) {
        this.numberOfHorsepower = numberOfHorsepower;
    }

    public int getNumberOfHorsepower() {
        return numberOfHorsepower;
    }

    public void setNumberOfHorsepower(int numberOfHorsepower) {
        this.numberOfHorsepower = numberOfHorsepower;
    }
}

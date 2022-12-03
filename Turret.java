public class Turret implements IProductPart{
    private double gunCaliber;
    private double thicknessOfTheArmorPlate;

    public Turret(double gunCaliber, double thicknessOfTheArmorPlate) {
        this.gunCaliber = gunCaliber;
        this.thicknessOfTheArmorPlate = thicknessOfTheArmorPlate;
    }

    public double getGunCaliber() {
        return gunCaliber;
    }

    public double getThicknessOfTheArmorPlate() {
        return thicknessOfTheArmorPlate;
    }

    public void setGunCaliber(double gunCaliber) {
        this.gunCaliber = gunCaliber;
    }

    public void setThicknessOfTheArmorPlate(double thicknessOfTheArmorPlate) {
        this.thicknessOfTheArmorPlate = thicknessOfTheArmorPlate;
    }
}

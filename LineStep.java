public class LineStep implements ILineStep{
    @Override
    public IProductPart buildProductPart(String s) {
        if(s.equals("Корпус")){
            return new Body(15, 10);
        } else if(s.equals("Двигатель")){
            return new Engine(900);
        } else if(s.equals("Башня")) {
            return new Turret(189.3, 350.5);
        } else {
            return null;
        }
    }
}

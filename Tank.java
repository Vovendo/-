public class Tank implements IProduct{
    private Body body;
    private Engine engine;
    private Turret turret;

    @Override
    public void installFirstPart(IProductPart productPart) {
        body = (Body) productPart;
    }

    @Override
    public void installSecondPart(IProductPart productPart) {
        engine = (Engine) productPart;
    }

    @Override
    public void installThirdPart(IProductPart productPart) {
        turret = (Turret) productPart;
    }

    public Body getBody() {
        return body;
    }

    public Engine getEngine() {
        return engine;
    }

    public Turret getTurret() {
        return turret;
    }


}

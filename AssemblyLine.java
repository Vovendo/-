public class AssemblyLine implements IAssemblyLine{
    @Override
    public IProduct assembleProduct(IProduct product) {
        LineStep lineStep = new LineStep();
        product.installFirstPart(lineStep.buildProductPart("Корпус"));
        product.installSecondPart(lineStep.buildProductPart("Двигатель"));
        product.installThirdPart(lineStep.buildProductPart("Башня"));
        return product;
    }
}

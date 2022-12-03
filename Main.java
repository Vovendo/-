public class Main {
    public static void main(String[] args) {
        AssemblyLine assemblyLine = new AssemblyLine();
        Tank tank = new Tank();
        assemblyLine.assembleProduct(tank);

        System.out.println(tank.getBody().getNumberOfWheels());
    }
}

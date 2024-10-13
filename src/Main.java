public class Main {
    public static void main(String[] args) {
        HomeMediator mediator = new HomeMediatorImpl();

        Sensor tempSensor = new TemperatureSensor(mediator);
        Sensor humiditySensor = new HumiditySensor(mediator);
        Sensor lightSensor = new LightSensor(mediator);

        tempSensor.sendData();
        humiditySensor.sendData();
        lightSensor.sendData();

        mediator.printReport();
    }
}

class LightSensor implements Sensor {
    private HomeMediator mediator;

    public LightSensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    public void sendData() {
        mediator.collectData("Light: 300 lux");
    }
}

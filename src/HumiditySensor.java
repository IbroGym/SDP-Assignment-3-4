class HumiditySensor implements Sensor {
    private HomeMediator mediator;

    public HumiditySensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    public void sendData() {
        mediator.collectData("Humidity: 50%");
    }
}

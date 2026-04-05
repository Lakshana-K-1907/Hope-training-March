package Day9;

public class TemperatureACRule implements Rule {
    private Device ac;

    public TemperatureACRule(Device ac) {
        this.ac = ac;
    }

    public boolean evaluate(SensorData data) {
        return data.getTemperature() > 30;
    }

    public void execute() {
        ac.turnOn();
    }
}

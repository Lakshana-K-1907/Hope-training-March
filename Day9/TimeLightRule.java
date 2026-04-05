package Day9;

public class TimeLightRule implements Rule {
    private Device light;

    public TimeLightRule(Device light) {
        this.light = light;
    }

    public boolean evaluate(SensorData data) {
        return data.getHour() == 19;
    }

    public void execute() {
        light.turnOn();
    }
}

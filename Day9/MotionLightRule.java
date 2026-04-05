package Day9;

public class MotionLightRule implements Rule {
    private Device light;

    public MotionLightRule(Device light) {
        this.light = light;
    }

    public boolean evaluate(SensorData data) {
        return data.isMotionDetected();
    }

    public void execute() {
        light.turnOn();
    }
}

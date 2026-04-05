package Day9;

public class SensorData {
    private boolean motionDetected;
    private double temperature;
    private int hour;

    public SensorData(boolean motionDetected, double temperature, int hour) {
        this.motionDetected = motionDetected;
        this.temperature = temperature;
        this.hour = hour;
    }

    public boolean isMotionDetected() {
        return motionDetected;
    }

    public double getTemperature() {
        return temperature;
    }

    public int getHour() {
        return hour;
    }
}

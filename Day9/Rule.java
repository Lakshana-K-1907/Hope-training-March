package Day9;

public interface Rule {
    boolean evaluate(SensorData data);
    void execute();
}

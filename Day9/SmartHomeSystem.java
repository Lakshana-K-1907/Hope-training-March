package Day9;

public class SmartHomeSystem {
    public static void main(String[] args) {
        Device livingRoomLight = new Light("Living Room");
        Device bedroomAC = new AC("Bedroom");

        RuleEngine engine = new RuleEngine();

        engine.addRule(new MotionLightRule(livingRoomLight));
        engine.addRule(new TemperatureACRule(bedroomAC));
        engine.addRule(new TimeLightRule(livingRoomLight));

        SensorData data = new SensorData(true, 32, 19);

        engine.process(data);
    }
}

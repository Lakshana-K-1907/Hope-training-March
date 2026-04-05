package Day9;

public class Light implements Device {
    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void turnOn() {
        System.out.println(name + " Light ON");
    }

    public void turnOff() {
        System.out.println(name + " Light OFF");
    }

    public String getName() {
        return name;
    }
}

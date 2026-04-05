package Day9;

public class AC implements Device {
    private String name;

    public AC(String name) {
        this.name = name;
    }

    public void turnOn() {
        System.out.println(name + " AC ON");
    }

    public void turnOff() {
        System.out.println(name + " AC OFF");
    }

    public String getName() {
        return name;
    }
}

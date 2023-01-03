package pl.javastart.task;

public class Televisor {

    private boolean isTurnedOn;

    public void turnOn() {
        isTurnedOn = true;
    }

    public void turnOff() {
        isTurnedOn = false;
    }

    public boolean showStatus() {
        return isTurnedOn;
    }

}

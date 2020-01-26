package pl.sda.javakrk25.day6.Ex_13;

public class Bicycle extends Vehicle {

    private static final int MAX_SPEED = 45;
    private int gear;

    public Bicycle(int speed, int gear) {
        super(speed, MAX_SPEED);
        this.gear = gear;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }


}

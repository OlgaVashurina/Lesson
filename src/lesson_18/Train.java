package lesson_18;
/*
@date 07.06.2024
@author Sergey Bugaienko
*/

public class Train extends Vehicle{
    private int capacity;
    private int countPassengers;

    private int countWagons;
    private static final int WAGON_CAPACITY;

    static {
        WAGON_CAPACITY = 32;
    }

    public Train(String model, int year, int countWagons) {
        super(model, year);
        this.countWagons = countWagons;
        calculateCapacity();
    }

    private void calculateCapacity() {
        this.capacity = countWagons * WAGON_CAPACITY;
    }

    public int getCountWagons() {
        return countWagons;
    }

    public void setCountWagons(int countWagons) {
        this.countWagons = countWagons;
        calculateCapacity();
    }

    public int getCapacity() {
        return capacity;
    }
}

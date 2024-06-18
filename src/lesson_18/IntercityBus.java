package lesson_18;
/*
@date 07.06.2024
@author Sergey Bugaienko
*/

public class IntercityBus extends Bus {
    private String[] cites;
    private int placeBicycle;

    private int countBicycle;

    public IntercityBus(String model, int year, int capacity, int placeBicycle) {
        super(model, year, capacity);
        this.placeBicycle = placeBicycle;
        cites = new String[2];
    }

    public IntercityBus(String model, int year, int capacity, String[] cites, int placeBicycle) {
        super(model, year, capacity);
        this.cites = cites;
        this.placeBicycle = placeBicycle;
    }

    public int getPlaceBicycle() {
        return placeBicycle;
    }



    public boolean takePassengerWithBicycle() {
        /*
        1. Есть место для пассажира?
        2. Есть место для велосипеда?
        3. Если оба есть - грузим на борт
        4. Если какого-то нет - отказать
         */

        if (this.getCapacity() > this.getCountPassengers()
                && placeBicycle > countBicycle) {
            // Есть места и для людей, и для велика. Берем на борт
            this.takePassenger();
            countBicycle++;
            System.out.printf("Завершена посадка в автобус %s пассажира с велосипедом\n", this.getModel());
            return true;
        }

        System.out.println(this.getModel() +  ". Мест для пассажира с великом нет!");
        return false;
    }

    public boolean dropOffPassengerWithBicycle() {
       /*
       Проверить есть ли в автобусе пассажир + велосипед
       Если оба есть - уменьшаем кол-во обоих
       Если кого-нет, ничего не делаем - возвращаем false
        */

        if (this.getCountPassengers() > 0 && countBicycle > 0) {
            this.dropOffPassenger();
            countBicycle--;
            System.out.printf("Из автобуса %s вышел пассажир с велосипедом \n", this.getModel());
            return true;
        }

        System.out.printf("В автобусе %s недостаточно пассажиров и/или велосипедов для высадки\n", this.getModel());
        return false;
    }

    public int getCountBicycle() {
        return countBicycle;
    }
}

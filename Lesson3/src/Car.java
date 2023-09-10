//методы: движение, обслуживание, переключение передач, включение фар дворников.

public class Car implements ICar, GasolStation, My {
    protected String mark, model, color, exter, fuel_type, control;
    protected int num_wheels;
    protected double vol_eng;


    private boolean light_on;

    public Car(String mark, String model, String color, String exter, String fuel_type, String control, int num_wheels, double vol_eng) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.exter = exter;
        this.fuel_type = fuel_type;
        this.control = control;
        this.num_wheels = num_wheels;
        this.vol_eng = vol_eng;
    }

    protected String movement() {
        return "";
    }

    protected String service() {
        return "";
    }

    public void changeControl(String control_mode) {
    }
    public void isLight_on(boolean is_light) {
        is_light = true;
    }
    @Override
    public boolean isSweepingStreet(boolean isSweeping) {
        return false;
    }

    //8. Имплементировать метод интерфейса «Заправочная станция» в конкретный класс «Car».
    @Override
    public void refill(String fuel_type) {
        //Другое топливо
    }

    /*10. Имплементировать все методы интерфейса «Заправочная станция» в конкретный класс «Car». Соблюсти принцип ISP. Создать дополнительный/е интерфейсы и имплементировать их в
    конкретный класс «Car». Соблюсти принцип ISP.
     */
    @Override
    public void wipeWindshield() {
        //протирка стекла
    }

    @Override
    public void wipeHeadlights() {
        //протирка фар
    }

    @Override
    public void wipeMirrors() {
        //протирка зеркал
    }

    @Override
    public void weapons(String weap) {
        //оружие на борту
    }
}

/* 11. Создать путём наследования класса «Car» два автомобиля: с бензиновым и дизельным двигателями, имплементировать метод
 «Заправка топливом» интерфейса «Заправочная станция». Реализовать заправку каждого автомобиля подходящим топливом.
 Соблюсти принцип DIP.
 */
public class DieselToyota extends Car{
    public DieselToyota(String mark, String model, String color, String exter, String control, int num_wheels, double vol_eng) {
        super(mark, model, color, exter, "diesel", control, num_wheels, vol_eng);
    }
}

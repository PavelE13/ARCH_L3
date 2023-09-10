// 6. Класс конкретного автомобиля, наследующий класс "Car" и определяющий метод "движение" как "полёт"
public class FlyCar extends Car{
    public FlyCar(String mark, String model, String color, String exter, String fuel_type, String control, int num_wheels, double vol_eng) {
        super(mark, model, color, exter, fuel_type, control, num_wheels, vol_eng);
    }

    @Override
    protected String movement() {
        return "Flying";
    }
}

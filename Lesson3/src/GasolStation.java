
//7. Создать интерфейс «Заправочная станция», создать метод: заправка топливом.
public interface GasolStation {
    public void refill(String fuel_type);

    //9. Добавить в интерфейс «Заправочная станция» методы: протирка лобового стекла, протирка фар, протирка зеркал.
    public void wipeWindshield();

    public void wipeHeadlights();

    public void wipeMirrors();

}

package interfaces;

public interface Exchangeable {
    Clothe getClothe();  // Изменили возвращаемый тип
    void setClothe(Clothe clothe);  // Изменили тип параметра
    boolean canExchangeWith(Exchangeable other);
    Object getName();
}
package objects;

public class Car {
    public String carType;
    public Double moneyToPayFees;
    public Integer hoursStayedAtParkingLot;
    public Boolean enteringTheLot;

    public Car(String carType, Double moneyToPayFees, Integer hoursStayedAtParkingLot, Boolean enteringTheLot) {
        this.carType = carType;
        this.moneyToPayFees = moneyToPayFees;
        this.hoursStayedAtParkingLot = hoursStayedAtParkingLot;
        this.enteringTheLot = enteringTheLot;
    }
}

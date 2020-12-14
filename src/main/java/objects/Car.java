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

    public String getCarType() {
        return this.carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public Double getMoneyToPayFees() {
        return this.moneyToPayFees;
    }

    public void setMoneyToPayFees(Double moneyToPayFees) {
        this.moneyToPayFees = moneyToPayFees;
    }

    public Integer getHoursStayedAtParkingLot() {
        return this.hoursStayedAtParkingLot;
    }

    public void setHoursStayedAtParkingLot(Integer hoursStayedAtParkingLot) {
        this.hoursStayedAtParkingLot = hoursStayedAtParkingLot;
    }

    public Boolean getEnteringTheLot() {
        return this.enteringTheLot;
    }

    public void setEnteringTheLot(Boolean enteringTheLot) {
        this.enteringTheLot = enteringTheLot;
    }
}

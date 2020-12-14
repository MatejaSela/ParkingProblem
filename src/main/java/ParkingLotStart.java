package main.java;

import main.java.exceptions.NoMoneyExcetion;
import main.java.exceptions.NoSpaceExcetion;

// ex. CarList ["FiftyKW In 20 2", "TwentyKW In 30", "Twenty Out 500 10"]
public class ParkingLotStart {

    public static void main(String[] args) throws NoMoneyExcetion, NoSpaceExcetion {
        ParkingLot parkingLot1 = new ParkingLot();

        Car car1 = new Car("FiftyKW", 20.0, 0, true);
        Car car2 = new Car("Standard", 0.0, 2, true);
        Car car3 = new Car("TwentyKW", 100.0, 0, true);

        isCarEnteringOrExitingLot(car1, parkingLot1);
        isCarEnteringOrExitingLot(car2, parkingLot1);
        isCarEnteringOrExitingLot(car3, parkingLot1);

    }

    static void isCarEnteringOrExitingLot(Car car, ParkingLot parkingLot) throws NoMoneyExcetion, NoSpaceExcetion {
        if (car.enteringTheLot) {
            enterParkingLot(car, parkingLot);
        } else {
            exitParkingLot(car, parkingLot);
        }
    }

    static void enterParkingLot(Car car, ParkingLot parkingLot) throws NoMoneyExcetion, NoSpaceExcetion {
        checkEntranceFees(car, parkingLot);
        checkSpaceAtParkingLot(car, parkingLot);
    }

    private static void checkSpaceAtParkingLot(Car car, ParkingLot parkingLot) throws NoSpaceExcetion {
        if (parkingLot.getStandardSlot() > 0 && car.getCarType().equals("Standard")) {
            parkingLot.setStandardSlot(parkingLot.getStandardSlot() - 1);
        } else if (parkingLot.getTwentyKWSlot() > 0 && car.getCarType().equals("TwentyKW")) {
            parkingLot.setTwentyKWSlot(parkingLot.getTwentyKWSlot() - 1);
        } else if (parkingLot.getFiftyKWSlot() > 0 && car.getCarType().equals("FiftyKW")) {
            parkingLot.setFiftyKWSlot(parkingLot.getFiftyKWSlot() - 1);
        } else {
            throw new NoSpaceExcetion("ALERT! not enough space at the parking lot, please try again!");
        }
        System.out.println("successfully parked!");
    }

    private static void checkEntranceFees(Car car, ParkingLot parkingLot) throws NoMoneyExcetion {
        if (car.moneyToPayFees - parkingLot.parkingFixedFee < 0) {
            throw new NoMoneyExcetion("ALERT! not enough money to pay fees!");
        }
        car.setMoneyToPayFees(car.moneyToPayFees - parkingLot.parkingFixedFee);
        System.out.println("successfull entrance fee payment!");
    }

    static void exitParkingLot(Car car, ParkingLot parkingLot) throws NoMoneyExcetion {
        checkExitFees(car, parkingLot);
        System.out.println("successfully exited, thank you for staying with us!");
    }

    private static void checkExitFees(Car car, ParkingLot parkingLot) throws NoMoneyExcetion {
        if (car.getCarType().equals("Standard")) {
            if (car.moneyToPayFees
                    - (parkingLot.getStandardSlotPricePerHour() * car.getHoursStayedAtParkingLot()) < 0) {
                throw new NoMoneyExcetion("ALERT! not enough money to pay fees!");
            }
            else{
                car.setMoneyToPayFees(car.moneyToPayFees - parkingLot.parkingFixedFee);
                parkingLot.setStandardSlot(parkingLot.getstandardSlot() + 1);
            }
        } if (car.getCarType().equals("TwentyKW")) {
            if (car.moneyToPayFees
                    - (parkingLot.getTwentyKWSlotPricePerHour() * car.getHoursStayedAtParkingLot()) < 0) {
                throw new NoMoneyExcetion("ALERT! not enough money to pay fees!");
            }
            else{
                car.setMoneyToPayFees(car.moneyToPayFees - parkingLot.parkingFixedFee);
                parkingLot.setStandardSlot(parkingLot.getstandardSlot() + 1);
            }
        } if (car.getCarType().equals("FiftyKW")) {
            if (car.moneyToPayFees - (parkingLot.getFiftyKWSlotPricePerHour() * car.getHoursStayedAtParkingLot()) < 0) {
                throw new NoMoneyExcetion("ALERT! not enough money to pay fees!");
            }
            else{
                car.setMoneyToPayFees(car.moneyToPayFees - parkingLot.parkingFixedFee);
                parkingLot.setFiftyKWSlot(parkingLot.getFiftyKWSlot() + 1);
            }
        }
        System.out.println("successfull entrance fee payment!");
    }

    static void raiseAlarm() {
        System.out.println("!Alert, Alert! The person cannot pay the fees!");
    }
}
import exceptions.NoMoneyExcetion;
import exceptions.NoSpaceExcetion;
import objects.Car;
import objects.ParkingLot;

public class ParkingLotStart {

    public static void main(String[] args) throws NoMoneyExcetion, NoSpaceExcetion {
        ParkingLot parkingLot1 = new ParkingLot();

        // Example cars, some will fail to execute, since the program throws exception
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
            parkingLot.standardFreeSlotNumber--;
        } else if (parkingLot.getTwentyKWSlot() > 0 && car.getCarType().equals("TwentyKW")) {
            parkingLot.twentyKWFreeSlotNumber--;
        } else if (parkingLot.getFiftyKWSlot() > 0 && car.getCarType().equals("FiftyKW")) {
            parkingLot.fiftyKWFreeSlotNumber--;
        } else {
            throw new NoSpaceExcetion("ALERT! not enough space at the parking lot, please try again!");
        }
        System.out.println("successfully parked!");
    }

    private static void checkEntranceFees(Car car, ParkingLot parkingLot) throws NoMoneyExcetion {
        if (car.moneyToPayFees - parkingLot.parkingFixedFee < 0) {
            throw new NoMoneyExcetion("ALERT! not enough money to pay fees!");
        }
        car.moneyToPayFees = car.moneyToPayFees - parkingLot.parkingFixedFee;
        System.out.println("successfull entrance fee payment!");
    }

    static void exitParkingLot(Car car, ParkingLot parkingLot) throws NoMoneyExcetion {
        checkExitFees(car, parkingLot);
        System.out.println("successfully exited, thank you for staying with us!");
    }

    private static void checkExitFees(Car car, ParkingLot parkingLot) throws NoMoneyExcetion {
        if (car.carType.equals("Standard")) {
            if (car.moneyToPayFees - (parkingLot.standardSlotPricePerHour * car.hoursStayedAtParkingLot) < 0) {
                throw new NoMoneyExcetion("ALERT! not enough money to pay fees!");
            } else {
                car.moneyToPayFees = car.moneyToPayFees
                        - parkingLot.standardSlotPricePerHour * car.hoursStayedAtParkingLot;
                parkingLot.standardFreeSlotNumber++;
            }
        }
        if (car.carType.equals("TwentyKW")) {
            if (car.moneyToPayFees - (parkingLot.twentyKWSlotPricePerHour * car.hoursStayedAtParkingLot) < 0) {
                throw new NoMoneyExcetion("ALERT! not enough money to pay fees!");
            } else {
                car.moneyToPayFees = car.moneyToPayFees
                        - parkingLot.standardSlotPricePerHour * car.hoursStayedAtParkingLot;
                parkingLot.twentyKWFreeSlotNumber++;
            }
        }
        if (car.carType.equals("FiftyKW")) {
            if (car.moneyToPayFees - (parkingLot.fiftyKWSlotPricePerHour * car.hoursStayedAtParkingLot) < 0) {
                throw new NoMoneyExcetion("ALERT! not enough money to pay fees!");
            } else {
                car.moneyToPayFees = car.moneyToPayFees
                        - parkingLot.standardSlotPricePerHour * car.hoursStayedAtParkingLot;
                parkingLot.fiftyKWFreeSlotNumber++;
            }
        }
        System.out.println("successfull entrance fee payment!");
    }

    static void raiseAlarm() {
        System.out.println("!Alert, Alert! The person cannot pay the fees!");
    }
}
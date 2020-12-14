
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import exceptions.NoMoneyExcetion;
import exceptions.NoSpaceExcetion;
import objects.Car;
import objects.ParkingLot;

public class IntegrationTest {

    // Set up
    Integer standardFreeSlotNumber = 1;
    Double standardSlotPricePerHour = 20.0;
    Integer twentyKWFreeSlotNumber = 1;
    Double twentyKWSlotPricePerHour = 0.0;
    Integer fiftyKWFreeSlotNumber = 1;
    Double fiftyKWSlotPricePerHour = 10.0;
    Double parkingFixedFee = 10.0;

    ParkingLot parkingLot1 = new ParkingLot(standardFreeSlotNumber, standardSlotPricePerHour, twentyKWFreeSlotNumber,
            twentyKWSlotPricePerHour, fiftyKWFreeSlotNumber, fiftyKWSlotPricePerHour, parkingFixedFee);

    @Test
    public void isCarEnteringOrExitingLot_givenCarWithEnoughMoney_AndParkingLotWithEnoughSpace_SuccessfullyEntersTheLot()
            throws NoMoneyExcetion, NoSpaceExcetion {
        // Setup
        Car car = new Car("FiftyKW", 20.0, 1, true);

        // Act
        ParkingLotStart.isCarEnteringOrExitingLot(car, parkingLot1);
        // Check
        assertEquals(20.0 - parkingLot1.parkingFixedFee, car.moneyToPayFees, 0.1);
        assertEquals(0, parkingLot1.fiftyKWFreeSlotNumber, 0.1);
    }

    @Test
    public void isCarEnteringOrExitingLot_givenCarWithEnoughMoney_AndParkingLotWithEnoughSpace_SuccessfullyExitsTheLot()
            throws NoMoneyExcetion, NoSpaceExcetion {
        // Setup
        Car car = new Car("FiftyKW", 150.0, 3, false);

        // Act
        ParkingLotStart.isCarEnteringOrExitingLot(car, parkingLot1);
        // Check
        assertEquals(150.0 - 3 * parkingLot1.standardSlotPricePerHour, car.moneyToPayFees, 0.1);
    }
}

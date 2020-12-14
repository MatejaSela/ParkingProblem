import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import exceptions.NoMoneyExcetion;
import exceptions.NoSpaceExcetion;

public class ParkingLotStartTest {

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
    public void enterParkingLot_givenCarWithEnoughMoney_AndParkingLotWithEnoughSpace_ReducesCarsMoneyForEntranceFeeValueAndChecksSpaceForParkingLotCorrectly()
            throws NoMoneyExcetion, NoSpaceExcetion {
        // Setup
        Car car = new Car("FiftyKW", 20.0, 1, true);

        // Act
        ParkingLotStart.enterParkingLot(car, parkingLot1);
        // Check
        assertEquals(20.0 - parkingLot1.parkingFixedFee, car.moneyToPayFees, 0.1);
        assertEquals(0, parkingLot1.fiftyKWFreeSlotNumber, 0.1);
    }

    @Test
    public void enterParkingLot_givenCarWithNoMoney_ThrowsException() throws NoMoneyExcetion, NoSpaceExcetion {
        // Setup
        Car car = new Car("FiftyKW", 0.0, 1, true);

        // Act and Check
        assertThrows(NoMoneyExcetion.class, () -> ParkingLotStart.enterParkingLot(car, parkingLot1));
    }

    @Test
    public void enterParkingLot_givenNotEngoughSpaceAtLot_ThrowsException() throws NoMoneyExcetion, NoSpaceExcetion {
        // Setup
        Car car = new Car("FiftyKW", 1000.0, 1, true);
        parkingLot1.fiftyKWFreeSlotNumber = 0;

        // Act and Check
        assertThrows(NoSpaceExcetion.class, () -> ParkingLotStart.enterParkingLot(car, parkingLot1));
    }

    /*
     * @Test public void
     * exitParkingLot_givenCarWithEnoughMoney_ReducesCarsMoneyForExitFeeAndIncreasesNumberOfSpacesForParkingLotCorrectly
     * () throws NoMoneyExcetion { ParkingLotStart.exitParkingLot(car1,
     * parkingLot1); // assert statements assertEquals(20.0 -
     * parkingLot1.parkingFixedFee, car1.moneyToPayFees, 0.1); assertEquals(0,
     * parkingLot1.fiftyKWFreeSlotNumber, 0.1);
     * 
     * }
     */
}

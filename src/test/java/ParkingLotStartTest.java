import static org.junit.jupiter.api.Assertions.assertEquals;

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
    Car car1 = new Car("FiftyKW", 20.0, 1, true);

    ParkingLot parkingLot1 = new ParkingLot(standardFreeSlotNumber, standardSlotPricePerHour, twentyKWFreeSlotNumber,
            twentyKWSlotPricePerHour, fiftyKWFreeSlotNumber, fiftyKWSlotPricePerHour, parkingFixedFee);

    @Test
    public void enterParkingLot_givenCarWithEnoughMoney_AndParkingLotWithEnoughSpace_ReducesCarsMoneyForEntranceFeeValueAndChecksSpaceForParkingLotCorrectly()
            throws NoMoneyExcetion, NoSpaceExcetion {
        // Act
        ParkingLotStart.enterParkingLot(car1, parkingLot1);
        // Check
        assertEquals(20.0 - parkingLot1.parkingFixedFee, car1.moneyToPayFees, 0.1);
        assertEquals(0, parkingLot1.fiftyKWFreeSlotNumber, 0.1);
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

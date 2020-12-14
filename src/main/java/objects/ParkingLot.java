package objects;

import java.util.Scanner;

public class ParkingLot {
    public Integer standardFreeSlotNumber;
    public Double standardSlotPricePerHour;
    public Integer twentyKWFreeSlotNumber;
    public Double twentyKWSlotPricePerHour;
    public Integer fiftyKWFreeSlotNumber;
    public Double fiftyKWSlotPricePerHour;
    public Double parkingFixedFee;

    public ParkingLot() {

        Scanner keyboard = new Scanner(System.in);

        // Standard Cars
        System.out.print("Please enter Number of Slots for Standard Cars: ");
        this.standardFreeSlotNumber = keyboard.nextInt();
        System.out.print("Please enter the hourly fee for Standard Cars: ");
        this.standardSlotPricePerHour = keyboard.nextDouble();

        // 20KW Cars
        System.out.print("Please enter Number of Slots for 20KW Cars: ");
        this.twentyKWFreeSlotNumber = keyboard.nextInt();
        System.out.print("Please enter the hourly fee for 20KW Cars: ");
        this.twentyKWSlotPricePerHour = keyboard.nextDouble();

        // 50KW Cars
        System.out.print("Please enter Number of Slots for 50KW Cars: ");
        this.fiftyKWFreeSlotNumber = keyboard.nextInt();
        System.out.print("Please enter the hourly fee for 50KW Cars: ");
        this.fiftyKWSlotPricePerHour = keyboard.nextDouble();

        // Fixed fee
        System.out.print("Please enter the parking fixed fee: ");
        this.parkingFixedFee = keyboard.nextDouble();

        keyboard.nextLine(); // to handle the end of line characters
        keyboard.close();
    }

    public ParkingLot(Integer standardFreeSlotNumber, Double standardSlotPricePerHour, Integer twentyKWFreeSlotNumber,
            Double twentyKWSlotPricePerHour, Integer fiftyKWFreeSlotNumber, Double fiftyKWSlotPricePerHour,
            Double parkingFixedFee) {
        this.standardFreeSlotNumber = standardFreeSlotNumber;
        this.standardSlotPricePerHour = standardSlotPricePerHour;
        this.twentyKWFreeSlotNumber = twentyKWFreeSlotNumber;
        this.twentyKWSlotPricePerHour = twentyKWSlotPricePerHour;
        this.fiftyKWFreeSlotNumber = fiftyKWFreeSlotNumber;
        this.fiftyKWSlotPricePerHour = fiftyKWSlotPricePerHour;
        this.parkingFixedFee = parkingFixedFee;
    }
}
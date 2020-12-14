package main.java;

import java.util.Scanner;

class ParkingLot {
    Integer standardFreeSlotNumber;
    Double standardSlotPricePerHour;
    Integer twentyKWFreeSlotNumber;
    Double twentyKWSlotPricePerHour;
    Integer fiftyKWFreeSlotNumber;
    Double fiftyKWSlotPricePerHour;
    Double parkingFixedFee;

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
    }

    public ParkingLot(Integer standardFreeSlotNumber,
    Double standardSlotPricePerHour,
    Integer twentyKWFreeSlotNumber,
    Double twentyKWSlotPricePerHour,
    Integer fiftyKWFreeSlotNumber,
    Double fiftyKWSlotPricePerHour,
    Double parkingFixedFee) {
        this.standardFreeSlotNumber = standardFreeSlotNumber;
        this.standardSlotPricePerHour = standardSlotPricePerHour;
        this.twentyKWFreeSlotNumber = twentyKWFreeSlotNumber;
        this.twentyKWSlotPricePerHour = twentyKWSlotPricePerHour;
        this.fiftyKWFreeSlotNumber = fiftyKWFreeSlotNumber;
        this.fiftyKWSlotPricePerHour = fiftyKWSlotPricePerHour;
        this.parkingFixedFee = parkingFixedFee;
    }

    public Integer getStandardSlot() {
        return this.standardFreeSlotNumber;
    }

    public void setStandardSlot(Integer standardSlot) {
        this.standardFreeSlotNumber = standardSlot;
    }

    public Integer getFiftyKWSlot() {
        return this.fiftyKWFreeSlotNumber;
    }

    public void setFiftyKWSlot(Integer fiftyKWSlot) {
        this.fiftyKWFreeSlotNumber = fiftyKWSlot;
    }

    public Integer getTwentyKWSlot() {
        return this.twentyKWFreeSlotNumber;
    }

    public void setTwentyKWSlot(Integer twentyKWSlot) {
        this.twentyKWFreeSlotNumber = twentyKWSlot;
    }

    public Double getStandardSlotPricePerHour() {
        return this.standardSlotPricePerHour;
    }

    public void setStandardSlotPricePerHour(Double standardSlotPricePerHour) {
        this.standardSlotPricePerHour = standardSlotPricePerHour;
    }

    public Double getFiftyKWSlotPricePerHour() {
        return this.fiftyKWSlotPricePerHour;
    }

    public void setFiftyKWSlotPricePerHour(Double fiftyKWSlotPricePerHour) {
        this.fiftyKWSlotPricePerHour = fiftyKWSlotPricePerHour;
    }

    public Double getTwentyKWSlotPricePerHour() {
        return this.twentyKWSlotPricePerHour;
    }

    public void setTwentyKWSlotPricePerHour(Double twentyKWSlotPricePerHour) {
        this.twentyKWSlotPricePerHour = twentyKWSlotPricePerHour;
    }

    public Double getParkingFixedFee() {
        return this.parkingFixedFee;
    }

    public void setParkingFixedFee(Double parkingFixedFee) {
        this.parkingFixedFee = parkingFixedFee;
    }

}
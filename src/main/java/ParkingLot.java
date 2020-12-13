package main.java;

class ParkingLot {
    Integer standardSlot;
    Integer fiftyKWSlot;
    Integer twentyKWSlot;
    Double standardSlotPricePerHour;
    Double fiftyKWSlotPricePerHour;
    Double twentyKWSlotPricePerHour;
    Double parkimgFixedFee;
    Integer numberOfSlots;

    public Integer getStandardSlot() {
        return this.standardSlot;
    }

    public void setStandardSlot(Integer standardSlot) {
        this.standardSlot = standardSlot;
    }

    public Integer getFiftyKWSlot() {
        return this.fiftyKWSlot;
    }

    public void setFiftyKWSlot(Integer fiftyKWSlot) {
        this.fiftyKWSlot = fiftyKWSlot;
    }

    public Integer getTwentyKWSlot() {
        return this.twentyKWSlot;
    }

    public void setTwentyKWSlot(Integer twentyKWSlot) {
        this.twentyKWSlot = twentyKWSlot;
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

    public Double getParkimgFixedFee() {
        return this.parkimgFixedFee;
    }

    public void setParkimgFixedFee(Double parkimgFixedFee) {
        this.parkimgFixedFee = parkimgFixedFee;
    }

    public Integer getNumberOfSlots() {
        return this.numberOfSlots;
    }

    public void setNumberOfSlots(Integer numberOfSlots) {
        this.numberOfSlots = numberOfSlots;
    }

}
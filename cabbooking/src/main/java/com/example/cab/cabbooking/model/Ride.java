package com.example.cab.cabbooking.model;

public class Ride {
    private long sourceXCoordinate;
    private long sourceYCoordinate;
    private long destXCoordinate;
    private long destYCoordinate;

    // Constructors
    public Ride() {
    }

    public Ride(long sourceXCoordinate, long sourceYCoordinate,
            long destXCoordinate, long destYCoordinate, long rideCost) {
        this.sourceXCoordinate = sourceXCoordinate;
        this.sourceYCoordinate = sourceYCoordinate;
        this.destXCoordinate = destXCoordinate;
        this.destYCoordinate = destYCoordinate;
    }

    // Getters

    public long getSourceXCoordinate() {
        return sourceXCoordinate;
    }

    public long getSourceYCoordinate() {
        return sourceYCoordinate;
    }

    public long getDestXCoordinate() {
        return destXCoordinate;
    }

    public long getDestYCoordinate() {
        return destYCoordinate;
    }

    // Setters
    

    public void setSourceXCoordinate(long sourceXCoordinate) {
        this.sourceXCoordinate = sourceXCoordinate;
    }

    public void setSourceYCoordinate(long sourceYCoordinate) {
        this.sourceYCoordinate = sourceYCoordinate;
    }

    public void setDestXCoordinate(long destXCoordinate) {
        this.destXCoordinate = destXCoordinate;
    }

    public void setDestYCoordinate(long destYCoordinate) {
        this.destYCoordinate = destYCoordinate;
    }

    @Override
    public String toString() {
        return "Ride [sourceXCoordinate=" + sourceXCoordinate + ", sourceYCoordinate=" + sourceYCoordinate
                + ", destXCoordinate=" + destXCoordinate + ", destYCoordinate=" + destYCoordinate + "]";
    } 

}

package com.example.cab.cabbooking.model;

public class Driver {
    private String driverName;
    private String vehicleDetails;
    private long xCoordinate;
    private long yCoordinate;
    private boolean available;
    
    public Driver() {
    }
    
    public Driver(String driverName, String vehicleDetails, long xCoordinate, long yCoordinate, boolean available) {
        this.driverName = driverName;
        this.vehicleDetails = vehicleDetails;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.available = available;
    }

    public String getDriverName() {
        return driverName;
    }
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    public String getVehicleDetails() {
        return vehicleDetails;
    }
    public void setVehicleDetails(String vehicleDetails) {
        this.vehicleDetails = vehicleDetails;
    }
    public long getxCoordinate() {
        return xCoordinate;
    }
    public void setxCoordinate(long xCoordinate) {
        this.xCoordinate = xCoordinate;
    }
    public long getyCoordinate() {
        return yCoordinate;
    }
    public void setyCoordinate(long yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Driver [driverName=" + driverName + ", vehicleDetails=" + vehicleDetails + ", xCoordinate="
                + xCoordinate + ", yCoordinate=" + yCoordinate + ", available=" + available + "]";
    }
    
}

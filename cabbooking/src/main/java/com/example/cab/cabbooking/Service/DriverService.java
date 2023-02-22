package com.example.cab.cabbooking.Service;

import java.util.List;

import com.example.cab.cabbooking.model.Driver;

public interface DriverService {
    public List<Driver>getDrivers();
    public Driver addDriver(Driver driver);
}

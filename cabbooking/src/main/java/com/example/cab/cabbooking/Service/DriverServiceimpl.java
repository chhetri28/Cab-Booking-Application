package com.example.cab.cabbooking.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.cab.cabbooking.model.Driver;

@Service
public class DriverServiceimpl implements DriverService {
    List<Driver> driverList;
    public DriverServiceimpl(){
        driverList=new ArrayList<>();
        driverList.add(new Driver("d1", "swqift", 10, 1, true));
        driverList.add(new Driver("d2", "wagnor", 11, 10, true));
        driverList.add(new Driver("d3", "creta", 5, 3, true));
    }
    @Override
    public List<Driver> getDrivers() {
        return driverList;
    }

    @Override
    public Driver addDriver(Driver driver) {
        driverList.add(driver);
        return driver;
    }
     
}

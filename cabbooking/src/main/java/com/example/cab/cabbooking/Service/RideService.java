package com.example.cab.cabbooking.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.cab.cabbooking.model.Driver;
import com.example.cab.cabbooking.model.Ride;
import com.example.cab.cabbooking.model.User;

public class RideService {
    @Autowired
    private DriverService driverService;

    public List<Driver> findRide(Ride newRide){
        // if(user.getUserName()==newRide.getUserName()){
        //     return null;
        // }
       List<Driver> drivers=driverService.getDrivers();

      
        calculateDistance(newRide.getSourceXCoordinate(),
        newRide.getSourceYCoordinate(),
        newRide.getDestXCoordinate(),newRide.getDestYCoordinate());
       
     
        return drivers;
        
    }
    
    // Calculates distance between 2 points in 2 dimensions
    public long calculateDistance(long sourceXCoordinate, long sourceYCoordinate,
            long destXCoordinate, long destYCoordinate) {
        long xDistance = (long) Math.pow(sourceXCoordinate - destXCoordinate, 2);
        long yDistance = (long) Math.pow(sourceYCoordinate - destYCoordinate, 2);

        return (long) Math.sqrt(xDistance + yDistance);
    }
}

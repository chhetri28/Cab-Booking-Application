package com.example.cab.cabbooking.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.cab.cabbooking.Service.DriverService;
import com.example.cab.cabbooking.Service.RideService;
import com.example.cab.cabbooking.Service.UserService;
import com.example.cab.cabbooking.model.Driver;
import com.example.cab.cabbooking.model.Ride;
import com.example.cab.cabbooking.model.User;

@RestController
public class MyController {

    @Autowired
    private UserService userService;

    @Autowired
    private DriverService driverService;

    @Autowired
    private RideService rideService;

    @GetMapping("/home")
    public String home(){
        return "This is home page tested by Sourav";
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return this.userService.getUsers();
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User user){
        return this.userService.addUser(user);
    }

    @GetMapping("/driver")
    public List<Driver> getDrivers(){
        return this.driverService.getDrivers();
    }
    @PostMapping("/driver")
    public Driver addDriver(@RequestBody Driver driver){
        return this.driverService.addDriver(driver);
    }

    @GetMapping("findRide")
    public List<Driver> findRide(@RequestParam String userName, @RequestParam long sourceXCoordinate,
            @RequestParam long sourceYCoordinate, @RequestParam long destXCoordinate,
            @RequestParam long destYCoordinate){
                Ride newRide=new Ride(userName, 0, 0, destXCoordinate, destYCoordinate);

                return rideService.findRide(newRide);
    }
}

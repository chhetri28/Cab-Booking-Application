package com.example.cab.cabbooking.Service;

import java.util.List;

import com.example.cab.cabbooking.model.User;

public interface UserService {
    public List<User> getUsers();
    public User addUser(User user);
}

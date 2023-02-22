package com.example.cab.cabbooking.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.cab.cabbooking.model.User;

@Service
public class UserServiceImpl implements UserService{

    List<User> userList;
    public UserServiceImpl(){
        userList=new ArrayList<>();
        userList.add(new User("Abhishek", 'M', 23));
        userList.add(new User("Sourav", 'M', 23));
        userList.add(new User("Rani", 'F', 23));
    }
    @Override
    public List<User> getUsers() {
        return userList;
    }
    @Override
    public User addUser(User user) {
        userList.add(user);
        return user;
    }
    
}

package com.example.springdemo;

import com.example.springdemo.entities.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class UserService {

    @Autowired
    UserRepository userRepository;


    public void addUser(String name,String secondName) {

        User user = new User();
        user.setName(name);
        user.setSecondName(secondName);
        userRepository.saveAndFlush(user);
        log.info("user :" + user.toString() + "added");
    }

    public String removeUser(Long id) {
    userRepository.delete(id);
        return "User Deleted: " + id;
    }

    public String getAll() {
        List<User> list = userRepository.findAll();
        return Arrays.toString(new List[]{list});
    }
    public String getById(Long id){
        User user = userRepository.getOne(id);

    return user.toString();
    }
    public String updateUser(String name,String secondName, Long id){
        User user = userRepository.getOne(id);
        user.setName(name);
        user.setSecondName(secondName);
        userRepository.saveAndFlush(user);
     return user.toString();
    }
}

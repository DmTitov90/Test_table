package com.example.springdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class Controller {
    @Autowired
    UserService userService;

    @Autowired

    UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET, path = "/add/{name}/{secondName}")
    public String add(@PathVariable(name = "name") String name, @PathVariable(name = "secondName") String secondName) {
        userService.addUser(name, secondName);
        return "OK added: " + name + " " + secondName;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/getAll")
    public String getAll() {

        return userService.getAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/get/{id}")
    public String getById(@PathVariable(name = "id") Long id) {
        return userService.getById(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/remove/{id}")
    public String removeById(@PathVariable(name = "id") Long id) {
        return userService.removeUser(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/update/{name}/{secondName}/{id}")
    public String updateUser(@PathVariable(name = "name") String name, @PathVariable(name = "secondName") String secondName, @PathVariable(name = "id") Long id) {
        return userService.updateUser(name, secondName, id);
    }
}

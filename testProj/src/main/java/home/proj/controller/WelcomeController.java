package home.proj.controller;

import home.proj.service.CreateNewUser;
import home.proj.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Autowired
    private HelloService helloService;
    private CreateNewUser createNewUser;

    @GetMapping("/hello")
    public String sayHello(@RequestParam("name") String name){
        return helloService.sayHello(name);
    }

    @GetMapping("/create_new_user")
    public String createNewUser(@RequestParam("id") String id){
        return createNewUser.createNewUser(id);
    }
}
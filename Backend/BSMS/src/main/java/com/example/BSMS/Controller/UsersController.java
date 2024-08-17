package com.example.BSMS.Controller;


import com.example.BSMS.DTO.Request.UsersRegisterDTO;
import com.example.BSMS.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/Users")
public class UsersController {

    @Autowired
    UsersService usersService;

    @PostMapping("/register")
    public String registerUser(@RequestBody UsersRegisterDTO UsersRegisterDTO){
      String message = usersService.registerUser(UsersRegisterDTO);
      return message;
    }

    @GetMapping(
            path="/login",
            params = {"username","password"}
    )
    public String loginUser(@RequestParam (value = "username")String username, @RequestParam(value = "password") String password){
         String message = usersService.loginUser(username,password);
         return message;
    }

}

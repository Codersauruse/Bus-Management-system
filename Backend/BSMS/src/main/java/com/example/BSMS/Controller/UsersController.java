package com.example.BSMS.Controller;


import com.example.BSMS.DTO.Request.UsersRegisterDTO;
import com.example.BSMS.DTO.Response.UserResponseDTO;
import com.example.BSMS.Service.UsersService;
import com.example.BSMS.Util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/Users")
public class UsersController {

    @Autowired
    UsersService usersService;

    @PostMapping("/register")
    public ResponseEntity<StandardResponse> registerUser(@RequestBody UsersRegisterDTO UsersRegisterDTO){
      String message = usersService.registerUser(UsersRegisterDTO);
      return new ResponseEntity<>(new StandardResponse(200,"sucess",message), HttpStatus.CREATED);
    }

    @GetMapping(
            path="/login",
            params = {"username","password"}
    )
    public ResponseEntity<StandardResponse> loginUser(@RequestParam (value = "username")String username, @RequestParam(value = "password") String password){
         UserResponseDTO userResponseDTO = usersService.loginUser(username,password);
        return new ResponseEntity<>(new StandardResponse(201,"sucess",userResponseDTO), HttpStatus.OK);
    }

}

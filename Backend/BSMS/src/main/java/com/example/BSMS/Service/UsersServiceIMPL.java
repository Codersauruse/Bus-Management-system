package com.example.BSMS.Service;


import com.example.BSMS.DTO.Request.UsersRegisterDTO;
import com.example.BSMS.Entity.Users;
import com.example.BSMS.Repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;


@Service

public class UsersServiceIMPL implements UsersService{
    @Autowired
    UserRepo userRepo;
    @Autowired
    ModelMapper modelMapper;

    @Override
    public String registerUser( UsersRegisterDTO usersRegisterDTO) {
        Users user = modelMapper.map(usersRegisterDTO, Users.class);

        if(userRepo.existsByUsername(user.getUsername())){
            return "Username  Already Exists choose different one";
        }
        else if(userRepo.existsByEmail(user.getEmail())){
            return "Email Already Exists choose different one";
        }
        else{
            userRepo.save(user);
            return user.getUsername() + " is successfully registered";
        }



    }

    @Override
    public String loginUser(String username, String password) {
        if(userRepo.existsByUsername(username)){
            Users user = userRepo.findByUsername(username);
            if(user.getPassword().equals(password)){
                return "login Succesfull";
            }
            else {
                return "login Failed. password is incorrect";
            }

        }
        else{
            return "username  is incorrect";
        }

    }
}

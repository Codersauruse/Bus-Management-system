package com.example.BSMS.Service;

import com.example.BSMS.DTO.Request.UsersRegisterDTO;
import com.example.BSMS.DTO.Response.UserResponseDTO;

public interface UsersService {
    String registerUser(UsersRegisterDTO usersRegisterDTO);

    UserResponseDTO loginUser(String username, String password);
}

package com.example.BSMS.Service;

import com.example.BSMS.DTO.Request.UsersRegisterDTO;

public interface UsersService {
    String registerUser(UsersRegisterDTO usersRegisterDTO);

    String loginUser(String username, String password);
}

package com.example.BSMS.DTO.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UsersRegisterDTO {

    private String username;
    private String email;
    private String password;



}

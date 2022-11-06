package com.rk.synchronyapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpRequestDTO {

    private String name;
    private String gender;
    private String emailId;
    private String phoneNumber;
    private String password;


}

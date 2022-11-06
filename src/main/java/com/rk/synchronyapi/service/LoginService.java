package com.rk.synchronyapi.service;

import com.rk.synchronyapi.common.APIResponse;
import com.rk.synchronyapi.dto.LoginRequestDTO;
import com.rk.synchronyapi.dto.SignUpRequestDTO;
import com.rk.synchronyapi.entity.User;
import org.springframework.stereotype.Service;

@Service
public class LoginService {


    public APIResponse signUp(SignUpRequestDTO signUpRequestDTO) {

        APIResponse apiResponse = new APIResponse();
        // validation

        // dto to entity
        User userEntity = new User();
        userEntity.setName(signUpRequestDTO.getName());
        userEntity.setEmailId(signUpRequestDTO.getEmailId());
        userEntity.setIsActive(Boolean.TRUE);
        userEntity.setGender(signUpRequestDTO.getGender());
        userEntity.setPhoneNumber(signUpRequestDTO.getPhoneNumber());
        userEntity.setPassword(signUpRequestDTO.getPassword());

        // store entity
       // userRepo.save(userEntity);
        apiResponse.setData(userEntity);
        return apiResponse;
    }

    public APIResponse logIn(LoginRequestDTO loginRequestDTO) {
        APIResponse apiResponse = new APIResponse();

        // validation

        // verify user exist with given email and password
       // User user = userRepository.findOneByEmailIdIgnoreCaseAndPassword(loginRequestDTO.getEmailId(), loginRequestDTO.getPassword());
        User user = new User();
        // response
        if(user == null){
            apiResponse.setData("User login failed");
            return apiResponse;
        }

        apiResponse.setData(user);

        return apiResponse;
    }
}

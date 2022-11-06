package com.rk.synchronyapi.controller;

import com.rk.synchronyapi.common.APIResponse;
import com.rk.synchronyapi.dto.LoginRequestDTO;
import com.rk.synchronyapi.dto.SignUpRequestDTO;
import com.rk.synchronyapi.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;


    @PostMapping("/signup")
    public ResponseEntity<APIResponse> signUp(@RequestBody SignUpRequestDTO signUpRequestDTO) {
        APIResponse apiResponse = loginService.signUp(signUpRequestDTO);

        return ResponseEntity
                .status(apiResponse.getStatus())
                .body(apiResponse);
    }

    @PostMapping("/login")
    public ResponseEntity<APIResponse> logIn (@RequestBody LoginRequestDTO loginRequestDTO) {
        APIResponse apiResponse = loginService.logIn(loginRequestDTO);

        return ResponseEntity
                .status(apiResponse.getStatus())
                .body(apiResponse);
    }
}

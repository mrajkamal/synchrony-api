package com.rk.synchronyapi.service;

import org.springframework.stereotype.Service;
import org.apache.commons.lang3.RandomStringUtils;

@Service
public class UserService {

    public String generateUserId() {
        StringBuilder userID = new StringBuilder();
        userID.append("SYN-");
        userID.append(RandomStringUtils.randomAlphanumeric(7).toUpperCase());
//        Optional<User> user = userRepo.findById(pin.toString());
//        if(product.isPresent()) {
//            generateUserId();
//        }
        return userID.toString();
    }
}

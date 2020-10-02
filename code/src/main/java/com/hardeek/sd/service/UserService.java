package com.hardeek.sd.service;

import com.hardeek.sd.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService{

    @Autowired
    UserRepository userRepository;

}

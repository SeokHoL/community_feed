package com.seokho.user.apllication;

import com.seokho.user.apllication.dto.CreateUserRequestDto;
import com.seokho.user.apllication.interfaces.UserRepository;
import com.seokho.user.domain.User;
import com.seokho.user.domain.UserInfo;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(CreateUserRequestDto dto){

        UserInfo info = new UserInfo(dto.name(), dto.profileImageUrl());
        User user =new User(null, info);
        return  userRepository.save(user);
    }

    public User getUser(Long id){
        return userRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }
}

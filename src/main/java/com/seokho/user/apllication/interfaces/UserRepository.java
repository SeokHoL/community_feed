package com.seokho.user.apllication.interfaces;

import com.seokho.user.domain.User;

import java.util.Optional;

public interface UserRepository {
    User save(User user);
    Optional<User> findById(Long id);

}

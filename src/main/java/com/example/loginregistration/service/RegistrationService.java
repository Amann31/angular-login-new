package com.example.loginregistration.service;

import com.example.loginregistration.model.User;

public interface RegistrationService {
    public User saveUser(User user);
    public User fetchUserByEmailId(String email);
    public User fetchUserByEmailIdAndPassword(String email, String password);
}

package com.example.loginregistration.service;


import com.example.loginregistration.model.User;
import com.example.loginregistration.repo.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService{

    private final RegistrationRepository registrationRepository;

    @Autowired
    public RegistrationServiceImpl(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }

    @Override
    public User saveUser(User user) {
        return registrationRepository.save(user);
    }

    @Override
    public User fetchUserByEmailId(String email) {
       return registrationRepository.findByEmailId(email);
    }

    @Override
    public User fetchUserByEmailIdAndPassword(String email, String password) {
        return registrationRepository.findByEmailIdAAndPassword(email,password);
    }

}

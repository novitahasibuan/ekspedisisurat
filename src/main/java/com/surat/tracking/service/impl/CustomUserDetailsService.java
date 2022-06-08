///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.surat.tracking.service.impl;
//
//import com.surat.tracking.configuration.CustomUserDetails;
//import com.surat.tracking.model.User;
//import com.surat.tracking.repository.UserRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
///**
// *
// * @author tik
// */
//@Service
//public class CustomUserDetailsService implements UserDetailsService {
//
//    @Autowired
//    private UserRepo userRepo;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepo.findByUsername(username);
//        if (user == null) {
//            throw new UsernameNotFoundException("User Not Found");
//        } 
//        return new CustomUserDetails(user); 
//    }
//
//    
//    
//}

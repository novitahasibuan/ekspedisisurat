/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.surat.tracking.service.impl;

import com.surat.tracking.model.Role;
import com.surat.tracking.model.Unit;
import com.surat.tracking.model.User;
import com.surat.tracking.repository.UserRepo;
import com.surat.tracking.service.IUserService;
import com.surat.tracking.web.dto.UserRegistrationDto;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author tik
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User(registrationDto.getNip(),
                registrationDto.getNama_pegawai(),
                registrationDto.getPassword(), Arrays.asList(new Role("kode_role")),
                Arrays.asList(new Unit("kode_unit")));
        return userRepo.save(user);
    }

}

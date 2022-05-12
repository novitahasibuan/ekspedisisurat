/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.surat.tracking.service;

import com.surat.tracking.model.User;
import com.surat.tracking.web.dto.UserRegistrationDto;

/**
 *
 * @author tik
 */
public interface IUserService {
    User save(UserRegistrationDto registrationDto);
    
}

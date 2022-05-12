/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.surat.tracking.controller;

import com.surat.tracking.service.IReferensi;
import com.surat.tracking.service.IUserService;
import com.surat.tracking.web.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author tik
 */
@Controller
@RequestMapping(value = {"/registration"})
public class UserRegistrationController {
    
    @Autowired
    private IUserService userService;
    @Autowired
    private IReferensi refService;

    @RequestMapping(value = {""}, method = RequestMethod.GET)
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new UserRegistrationDto());
        model.addAttribute("role", refService.listRole());
        model.addAttribute("unit", refService.listUnit());
        return "registration";
    }
//

    @RequestMapping(value = "/addRegistration", method = RequestMethod.POST)
    public @ResponseBody
    String registerUser(@ModelAttribute("user") UserRegistrationDto registrationDto) {
        System.out.println("nip " + registrationDto.getNip());
        userService.save(registrationDto);
        return "redirect:/registration/addRegistration?success";
    }
    
}

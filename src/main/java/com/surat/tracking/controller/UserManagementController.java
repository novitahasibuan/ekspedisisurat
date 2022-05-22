/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.surat.tracking.controller;

import com.surat.tracking.model.User;
import com.surat.tracking.repository.UserRepo;
import com.surat.tracking.service.IReferensi;
import com.surat.tracking.service.IUserService;
import com.surat.tracking.web.dto.UserRegistrationDto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author tik
 */
@Controller
@RequestMapping(value = {"/usermanagement"})
public class UserManagementController {

    @Autowired
    private IUserService userService;
    @Autowired
    private IReferensi refService;

    @RequestMapping(value = {""}, method = RequestMethod.GET)
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new UserRegistrationDto());
        model.addAttribute("users", userService.getUsers());
        model.addAttribute("role", refService.listRole());
        model.addAttribute("unit", refService.listUnit());
        return "registeruser";
    }

    @RequestMapping(value = {"/addRegistration"}, method = RequestMethod.POST)
    public @ResponseBody
    String registerUser(@ModelAttribute("user") UserRegistrationDto registrationDto) {
        try {
            userService.save(registrationDto);
            return "redirect:/usermanagement?success";
        } catch (Exception e) {
            return "exception " + e;
        }
    }

    @RequestMapping(value = {"/editProfil"}, method = RequestMethod.GET)
    public String editProfilForm(Model model) {
        model.addAttribute("user", new UserRegistrationDto());
        model.addAttribute("role", refService.listRole());
        model.addAttribute("unit", refService.listUnit());
        return "editprofil";
    }

    @RequestMapping(value = {"/saveEdit"}, method = RequestMethod.POST)
    public @ResponseBody
    String editProfil(@ModelAttribute("user") UserRegistrationDto registrationDto) {
        userService.save(registrationDto);
        return "redirect:/editProfil?success";
    }

}

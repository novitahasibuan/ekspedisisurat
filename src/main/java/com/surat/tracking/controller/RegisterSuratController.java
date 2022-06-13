/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.surat.tracking.controller;

import com.surat.tracking.service.IReferensi;
import com.surat.tracking.service.ISuratService;
import com.surat.tracking.service.IUserService;
import com.surat.tracking.web.dto.RegisterSuratDto;
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
@RequestMapping("/registersurat")
public class RegisterSuratController {

    @Autowired
    IUserService userService;

    @Autowired
    ISuratService suratService;

    @Autowired
    private IReferensi refService;

    @RequestMapping(value = {""}, method = RequestMethod.GET)
    public String showRegistrationForm(Model model) {
        model.addAttribute("surat", new RegisterSuratDto());
        model.addAttribute("unit", refService.listUnit());
        model.addAttribute("noAgenda", refService.setNoAgenda());
        return "registersurat";
    }

    @RequestMapping(value = {"/addSurat"}, method = RequestMethod.POST)
    public @ResponseBody
    String registerUser(@ModelAttribute("surat") RegisterSuratDto registrationDto) {
        
        suratService.save(registrationDto);
        return "redirect:/registerSurat";
    }
    

}

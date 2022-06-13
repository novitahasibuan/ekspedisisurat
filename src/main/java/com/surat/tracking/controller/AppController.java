/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.surat.tracking.controller;

import com.surat.tracking.service.IReferensi;
import com.surat.tracking.web.dto.RegisterSuratDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author tik
 */
@Controller
@RequestMapping("/")
public class AppController {
    
    @Autowired
    IReferensi refService;

    @RequestMapping(value = {""}, method = RequestMethod.GET)   
    public String home() {
        return "index";
    }
   @RequestMapping(value = {"/updatesurat"}, method = RequestMethod.GET)
    public String showRegistrationForm(Model model) {
        model.addAttribute("surat", new RegisterSuratDto());
        model.addAttribute("unit", refService.listUnit());
        model.addAttribute("noAgenda", refService.setNoAgenda());
        return "updatesurat";
    }
    @RequestMapping(value = {"/registeruser"}, method = RequestMethod.GET)
    public String showRegistrationForm1(Model model) {
        model.addAttribute("surat", new RegisterSuratDto());
        model.addAttribute("unit", refService.listUnit());
        model.addAttribute("noAgenda", refService.setNoAgenda());
        return "registeruser";
    }
     @RequestMapping(value = {"/formsurat"}, method = RequestMethod.GET)
    public String showSurat(Model model) {
//        model.addAttribute("surat", new RegisterSuratDto());
//        model.addAttribute("unit", refService.listUnit());
//        model.addAttribute("noAgenda", refService.setNoAgenda());
        return "formsurat";
    }
}

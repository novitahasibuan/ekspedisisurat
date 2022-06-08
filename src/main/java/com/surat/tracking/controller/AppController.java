/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.surat.tracking.controller;

import com.surat.tracking.web.dto.RegisterSuratDto;
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

    @RequestMapping(value = {""}, method = RequestMethod.GET)
    public String home() {
        return "Home Sekre Es 3";
    }
    
    @RequestMapping(value = {"/sekrees2"}, method = RequestMethod.GET)
    public String sekrees2() {
        return "Home Sekre";
    }

//    @RequestMapping(value = {"/registeruser"}, method = RequestMethod.GET)
//    public String showRegistrationForm2(Model model) {
//        return "registeruser";
//    }

//    @RequestMapping(value = {"/registersurat"}, method = RequestMethod.GET)
//    public String showRegistrationForm3(Model model) {
//        return "registersurat";
//    }

//    @RequestMapping(value = {"/rolepegawai"}, method = RequestMethod.GET)
//    public String showRegistrationForm4(Model model) {
//        return "index";
//    }

}

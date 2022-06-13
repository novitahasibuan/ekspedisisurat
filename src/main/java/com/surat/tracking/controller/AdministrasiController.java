/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.surat.tracking.controller;

import com.surat.tracking.service.IReferensi;
import com.surat.tracking.web.dto.RegisterSuratDto;
import com.surat.tracking.web.dto.UnitRegistrasiDto;
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
@RequestMapping(value = {"/unitmanagement"})
public class AdministrasiController {

    @Autowired
    IReferensi refService;

    @RequestMapping(value = {""}, method = RequestMethod.GET)
    public String showRegistrationForm(Model model) {
        model.addAttribute("role", refService.listRole());
        model.addAttribute("unit", refService.listUnit());
        return "registerunit";
    }

    @RequestMapping(value = {"/addUnit"}, method = RequestMethod.POST)
    public @ResponseBody
    String registerUser(@ModelAttribute("unit") UnitRegistrasiDto unitDto) {
        try {
            refService.saveUnit(unitDto);
            return "redirect:/unitmanagement?success";
        } catch (Exception e) {
            return "exception " + e;
        }
    }

}

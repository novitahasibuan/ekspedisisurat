/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.surat.tracking.service.impl;

import com.surat.tracking.model.Role;
import com.surat.tracking.model.Unit;
import com.surat.tracking.model.User;
import com.surat.tracking.repository.RoleRepo;
import com.surat.tracking.repository.UnitRepo;
import com.surat.tracking.repository.UserRepo;
import com.surat.tracking.service.IReferensi;
import com.surat.tracking.web.dto.UnitRegistrasiDto;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author tik
 */
@Service
public class ReferensiServiceImpl implements IReferensi {

    @Autowired
    UserRepo userRepo;

    @Autowired
    RoleRepo roleRepo;

    @Autowired
    UnitRepo unitRepo;

//    @Autowired
//    SuratRepo suratRepo;
    @Override
    public List<Role> listRole() {
        List<Role> roles = new ArrayList<>();
        try {
            System.out.println("role" + roleRepo.findAll());
            return roles = roleRepo.findAll();
        } catch (Exception ex) {
            System.out.println("role " + ex);
            return null;
        }
    }

    @Override
    public List<Unit> listUnit() {
        List<Unit> unit = new ArrayList<>();
        try {
            System.out.println("unit" + unitRepo.findAll());
            return unit = unitRepo.findAll();
        } catch (Exception ex) {
            System.out.println("role " + ex);
            return null;
        }
    }

    @Override
    public String getNamaUnit() {
        return null;
    }

    @Override
    public String setNoAgenda() {
        Random rand = new Random();
        int num = rand.nextInt(900000) + 100000;
        StringBuilder sb = new StringBuilder();
        String code = sb.append("RS").append(String.valueOf(num)).toString();
        return code;
    }

    @Override
    public Unit saveUnit (UnitRegistrasiDto unit) {
        Unit units = new Unit(unit.getNama_unit());
        return unitRepo.save(units);
    }
}

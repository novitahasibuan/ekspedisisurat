/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.surat.tracking.service.impl;

import com.surat.tracking.model.Role;
import com.surat.tracking.model.Unit;
import com.surat.tracking.repository.RoleRepo;
import com.surat.tracking.repository.UnitRepo;
import com.surat.tracking.service.IReferensi;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author tik
 */
@Service
public class ReferensiServiceImpl implements IReferensi {

    @Autowired
    RoleRepo roleRepo;
    @Autowired
    UnitRepo unitRepo;

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

}

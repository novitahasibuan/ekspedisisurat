/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.surat.tracking.web.dto;

import com.surat.tracking.model.Role;
import com.surat.tracking.model.Unit;
import lombok.Data;

/**
 *
 * @author tik
 */
@Data
public class UserRegistrationDto {

    private String nip;
    private String nama_pegawai;
    private String password;
    private Role dataRole;
    private Unit dataUnit;
    
    public UserRegistrationDto() {
    }

    public UserRegistrationDto(String nip, String nama_pegawai, String password, Role dataRole, Unit dataUnit) {
        this.nip = nip;
        this.nama_pegawai = nama_pegawai;
        this.password = password;
        this.dataRole = dataRole;
        this.dataUnit = dataUnit;
    }

    

}

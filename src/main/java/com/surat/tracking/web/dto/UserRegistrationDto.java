/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.surat.tracking.web.dto;

import lombok.Data;

/**
 *
 * @author tik
 */
@Data
public class UserRegistrationDto {

    private String nip;
    private String password;
    private String nama_pegawai;

    public UserRegistrationDto(String nip, String password, String nama_pegawai) {
        super();
        this.nip = nip;
        this.password = password;
        this.nama_pegawai = nama_pegawai;
    }

    public UserRegistrationDto() {
    }
    
    

}

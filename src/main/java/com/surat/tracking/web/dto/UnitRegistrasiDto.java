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
public class UnitRegistrasiDto {
    
    private String nama_unit;

    public UnitRegistrasiDto(String nama_unit) {
        this.nama_unit = nama_unit;
    }
   
    
}

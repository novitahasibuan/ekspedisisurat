/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.surat.tracking.web.dto;

import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author tik
 */
@Data
public class RegisterSuratDto {
    
    private String noAgenda;
    private String noSurat;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date tglSurat;
    private String perihal;
    private String asalSurat;
    private String konseptor;
    private String tujuanSurat;
    private String catatanKonseptor;
    private String status;
    private String catatanSekreEs2;
    
}

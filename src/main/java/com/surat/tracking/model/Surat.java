/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.surat.tracking.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author tik
 */
@Data
@Entity
@Table(name = "surat")
public class Surat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String noAgenda;
    private String noSurat;
    private Date tglSurat;
    private String perihal;
    private String asalSurat;
    private String konseptor;
    private String tujuanSurat;
    private String catatanKonseptor;
    private String status;
    private String catatanSekreEs2;

    public Surat() {
    }

    public Surat(String noAgenda, String noSurat, Date tglSurat, String perihal, String asalSurat, String konseptor, String tujuanSurat, String catatanKonseptor, String status, String catatanSekreEs2) {
        this.noAgenda = noAgenda;
        this.noSurat = noSurat;
        this.tglSurat = tglSurat;
        this.perihal = perihal;
        this.asalSurat = asalSurat;
        this.konseptor = konseptor;
        this.tujuanSurat = tujuanSurat;
        this.catatanKonseptor = catatanKonseptor;
        this.status = status;
        this.catatanSekreEs2 = catatanSekreEs2;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.surat.tracking.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author tik
 */
@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String nip;

    private String nama_pegawai;

    private String password;

    //add foreignkey role
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "kode_role_id")
    private Role kode_role;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "kode_uni_id")
    private Unit kode_unit;

    public User() {
    }

    public User(String nip, String nama_pegawai, String password, Role kode_role, Unit kode_unit) {
        this.nip = nip;
        this.nama_pegawai = nama_pegawai;
        this.password = password;
        this.kode_role = kode_role;
        this.kode_unit = kode_unit;
    }

}

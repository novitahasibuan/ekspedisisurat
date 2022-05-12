/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.surat.tracking.model;

import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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

    private String nip;

    private String password;

    private String nama_pegawai;

    @ManyToMany(cascade = CascadeType.ALL)
    private Collection<Role> kode_role;

    @ManyToMany(cascade = CascadeType.ALL)
    private Collection<Unit> kode_unit;

    public User(String nip, String password, String nama_pegawai, Collection<Role> kode_role, Collection<Unit> kode_unit) {
        super();
        this.nip = nip;
        this.password = password;
        this.nama_pegawai = nama_pegawai;
        this.kode_role = kode_role;
        this.kode_unit = kode_unit;
    }

}

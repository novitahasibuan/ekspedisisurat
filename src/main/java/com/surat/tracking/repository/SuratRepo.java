/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.surat.tracking.repository;

import com.surat.tracking.model.Surat;
import com.surat.tracking.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tik
 */
@Repository
public interface SuratRepo extends JpaRepository<Surat, Long> {

    Surat findByNoAgenda(String id);
}

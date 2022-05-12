/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.surat.tracking.repository;

import com.surat.tracking.model.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tik
 */
@Repository
public interface UnitRepo extends JpaRepository<Unit, Long> {

}

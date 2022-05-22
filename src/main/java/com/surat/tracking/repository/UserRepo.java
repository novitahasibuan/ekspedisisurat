/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.surat.tracking.repository;


import com.surat.tracking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tik
 */
@Repository
public interface UserRepo extends JpaRepository<User, Long>{
    @Query(value = "SELECT tbltrx.* FROM KUASA_TRX_PENUNJUKAN tbltrx "
            + "WHERE tbltrx.no_surat_kuasa = ?1 ",
            nativeQuery = true)
    User getDataById(String no_surat_kuasa);
}

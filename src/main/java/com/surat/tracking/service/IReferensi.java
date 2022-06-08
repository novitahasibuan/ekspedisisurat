/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.surat.tracking.service;

import com.surat.tracking.model.Role;
import com.surat.tracking.model.Unit;
import com.surat.tracking.web.dto.UnitRegistrasiDto;
import java.util.List;

/**
 *
 * @author tik
 */
public interface IReferensi {

//    public List<Object> getDataRole(HttpServletRequest request);
//    
//    public List<Unit> getDataUnit(HttpServletRequest request);
//    
    public List<Role> listRole();

    public List<Unit> listUnit();
    
    public String getNamaUnit();
    
    public String setNoAgenda();
    
    public Unit saveUnit (UnitRegistrasiDto unit);

}

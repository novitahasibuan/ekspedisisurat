/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.surat.tracking.service;

import com.surat.tracking.model.Role;
import com.surat.tracking.model.Unit;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author tik
 */
public interface IReferensi {
    
    public List<Role> getDataRole(HttpServletRequest request);
    
    public List<Unit> getDataUnit(HttpServletRequest request);
    
    
}

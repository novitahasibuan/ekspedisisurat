/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.surat.tracking.service;

import com.surat.tracking.model.Surat;
import com.surat.tracking.web.dto.RegisterSuratDto;

/**
 *
 * @author tik
 */
public interface ISuratService {

    public Surat save(RegisterSuratDto surat);
}

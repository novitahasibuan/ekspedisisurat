/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.surat.tracking.service.impl;

import com.surat.tracking.model.Surat;
import com.surat.tracking.repository.SuratRepo;
import com.surat.tracking.service.ISuratService;
import com.surat.tracking.web.dto.RegisterSuratDto;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author tik
 */
@Service
public class SuratServiceImpl implements ISuratService {

    @Autowired
    private SuratRepo suratRepo;

    @Override
    public Surat save(RegisterSuratDto suratDto) {

        Surat surats = new Surat(suratDto.getNoAgenda(), suratDto.getNoSurat(), suratDto.getTglSurat(),
                suratDto.getPerihal(), suratDto.getAsalSurat(), suratDto.getKonseptor(),
                suratDto.getTujuanSurat(), suratDto.getCatatanKonseptor(), "1", "");
        return suratRepo.save(surats);
    }

}

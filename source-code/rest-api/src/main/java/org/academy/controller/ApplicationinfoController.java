/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.academy.controller;

import javafx.application.Application;
import org.academy.entity.Applicationinfo;
import org.academy.entity.dao.ApplicationinfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hardinal
 */
@RestController
@Transactional
public class ApplicationinfoController {
    @Autowired private ApplicationinfoDao applicationInfoDao;
    
    @RequestMapping(value="/info", method = RequestMethod.GET)
    public Page<Applicationinfo>infos(Pageable page){
        return applicationInfoDao.findAll(page);
    }
    
}

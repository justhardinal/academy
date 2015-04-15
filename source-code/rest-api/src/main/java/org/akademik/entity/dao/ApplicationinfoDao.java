/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.akademik.entity.dao;

import java.io.Serializable;
import org.akademik.a.entity.Applicationinfo;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author hardinal
 */
public interface ApplicationinfoDao extends PagingAndSortingRepository<Applicationinfo, String> {
    
}

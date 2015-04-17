/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.academy.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hardinal
 */
@RestController
public class ToDoController {
    @RequestMapping(value="/halo",method = RequestMethod.GET)
    public Map<String,Object> halo (@RequestParam(required=false)String nama){
        Map<String,Object> hasil=new HashMap<>();
        hasil.put("salam","Halo "+nama);
        return hasil;
    }
    
}

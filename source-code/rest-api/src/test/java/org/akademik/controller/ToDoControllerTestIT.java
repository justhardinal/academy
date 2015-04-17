/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.akademik.controller;

import static com.jayway.restassured.RestAssured.*;
import org.academy.App;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.junit.Before;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 *
 * @author hardinal
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=App.class)
@WebAppConfiguration
@IntegrationTest("server.port=0")
public class ToDoControllerTestIT {
    
    @Value("${local.server.port}")
    private Integer serverPort;
    
    @Before
    public void setPort(){
        port = serverPort;
    }
    @Test
    public void testhalo(){
        when()
                .get("/api/halo?=hardinal")
            .then()
                .statusCode(HttpStatus.SC_OK)
                .body("salam",Matchers.containsString("Halo Hardinal"));
    }
}

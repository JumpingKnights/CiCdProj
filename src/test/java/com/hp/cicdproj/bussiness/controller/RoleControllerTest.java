package com.hp.cicdproj.bussiness.controller;

import com.hp.cicdproj.CicdprojApplication;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CicdprojApplication.class)
@WebAppConfiguration
public class RoleControllerTest {

    @Autowired
    private RoleController roleController;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("role before class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("role after class");
    }

    @Test
    public void testGetRole() {
        assertEquals(null ,roleController.getRole("2"));
    }
}
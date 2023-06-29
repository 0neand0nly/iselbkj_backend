package com.example.bkj_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.bkj_backend.service.cweService;
import com.example.bkj_backend.model.cweDao;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class cweController{


    @Autowired
    private cweService serv;

    @GetMapping("/code")
    public List<cweDao> getAllBoards()
    {
        return serv.getAllBoards();
    }

}

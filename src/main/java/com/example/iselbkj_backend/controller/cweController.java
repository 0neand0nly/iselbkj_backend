package com.example.iselbkj_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.iselbkj_backend.service.cweService;
import com.example.iselbkj_backend.model.cweDao;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class cweController{

    private final cweService serv;

    @Autowired
    public cweController(cweService serv){
        this.serv = serv;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/CODE")
    public List<cweDao> getAllBoards() {
        return serv.getAllBoards();
    }

}
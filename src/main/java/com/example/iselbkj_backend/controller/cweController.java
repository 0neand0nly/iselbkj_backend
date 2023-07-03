package com.example.iselbkj_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.iselbkj_backend.service.cweService;
import com.example.iselbkj_backend.model.cweDao;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/")
public class cweController{

    private final cweService serv;

    @Autowired
    public cweController(cweService serv){
        this.serv = serv;
    }


    @GetMapping("/demo")
    public List<cweDao> getAllBoards() {
        return serv.getAllBoards();
    }
    @PostMapping("/demo")
    public cweDao createBoard(@RequestBody cweDao cwedao)
    {
        return serv.createBoard(cwedao);
    }


}
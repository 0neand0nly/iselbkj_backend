package com.example.iselbkj_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.iselbkj_backend.service.cweService;
import com.example.iselbkj_backend.model.cwemetaVo;
import com.example.iselbkj_backend.model.cweDao;
import org.springframework.http.ResponseEntity;
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


    @GetMapping("/CWE")
    public List<cwemetaVo> getMetaData() {
        return serv.getMetaData();
    }
    @GetMapping("/CODE")
    public List<cweDao> getAllBoards() {
        return serv.getAllBoards();
    }

    @PostMapping("/CODE")
    public cweDao createBoard(@RequestBody cweDao cwedao)
    {
        return serv.createBoard(cwedao);
    }

    @PostMapping("/CWE")
    public cwemetaVo createMetaBoard(@RequestBody cwemetaVo cwevo)
    {
        return serv.createMetaBoard(cwevo);
    }


    @GetMapping("/CODE/{cwe_id}")
    public ResponseEntity<cweDao> getBoardById(@PathVariable("cwe_id") Integer cweId) {
        return serv.getBoard(cweId);
    }

    @PutMapping("/CODE/{cwe_id}")
    public ResponseEntity<cweDao> updateBoardById(@PathVariable("cwe_id") Integer cweId, @PathVariable cweDao cwedao) {
        return serv.updateBoard(cweId,cwedao);
    }





}
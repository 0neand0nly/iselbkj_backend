package com.example.iselbkj_backend.controller;

import com.example.iselbkj_backend.model.chunkVo;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.iselbkj_backend.service.cweService;
import com.example.iselbkj_backend.model.cwemetaVo;
import com.example.iselbkj_backend.model.cweDao;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@CrossOrigin(origins = "https://web-iselbkj-frontend-kvmh2mljph7x12.sel4.cloudtype.app/")
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

    @GetMapping("/CHUNK")
    public List<chunkVo> getAllChunk() {
        return serv.getAllChunk();
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
    public ResponseEntity<cweDao> updateBoardById(@PathVariable("cwe_id") Integer cweId, @RequestBody cweDao cwedao) {
        return serv.updateBoard(cweId,cwedao);
    }

    @DeleteMapping("/CODE/{cweId}")
    public ResponseEntity<Map<String, Boolean>> deleteBoard(@PathVariable("cweId") Integer cweId) {
        ResponseEntity<Map<String, Boolean>> codeResponse = serv.deleteBoard(cweId);

        if (codeResponse.getStatusCode().is2xxSuccessful()) {
            Map<String, Boolean> response = new HashMap<>();
            response.put("CODE_Deleted_" + cweId, codeResponse.getBody().get("Deleted CODE Data by cwe_id : {" + cweId + "}"));
            return ResponseEntity.ok(response);
        } else {
            throw new RuntimeException("Failed to delete CODE for id: " + cweId);
        }
    }

    @DeleteMapping("/CWE/{cweId}")
    public ResponseEntity<Map<String, Boolean>> deleteCwe(@PathVariable("cweId") Integer cweId) {
        ResponseEntity<Map<String, Boolean>> cweResponse = serv.deleteCwe(cweId);

        if (cweResponse.getStatusCode().is2xxSuccessful()) {
            Map<String, Boolean> response = new HashMap<>();
            response.put("CWE_Deleted_" + cweId, cweResponse.getBody().get("Deleted CWE Data by cwe_id : {" + cweId + "}"));
            return ResponseEntity.ok(response);
        } else {
            throw new RuntimeException("Failed to delete CWE for id: " + cweId);
        }
    }


}

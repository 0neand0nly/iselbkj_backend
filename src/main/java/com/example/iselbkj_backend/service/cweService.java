package com.example.iselbkj_backend.service;

import com.example.iselbkj_backend.Exception.ResourceNotFoundException;
import com.example.iselbkj_backend.model.cwemetaVo;
import com.example.iselbkj_backend.Repository.cweRepository;
import com.example.iselbkj_backend.Repository.cwemetaRepository;
import com.example.iselbkj_backend.model.cweDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class cweService {

    @Autowired
    private cweRepository repo;
    @Autowired
    private cwemetaRepository metarepo;

    public List<cweDao> getAllBoards() {
        return repo.findAll();
    }

    public List<cwemetaVo> getMetaData() {
        return metarepo.findAll();
    }

    public cweDao createBoard(cweDao cwedao) {
        return repo.save(cwedao);
    }

    public cwemetaVo createMetaBoard(cwemetaVo cwemetavo) {
        return metarepo.save(cwemetavo);
    }

    public ResponseEntity<cweDao> getBoard(Integer cwe_id) {
        cweDao cwedao = repo.findById(cwe_id).orElseThrow(() -> new ResourceNotFoundException("This Data does not Exist in the Database CWE_ID: [" + cwe_id + "]"));
        return ResponseEntity.ok(cwedao);
    }

    public ResponseEntity<cweDao> updateBoard(Integer cwe_id, cweDao updateBoard) {
        cweDao cwedao = repo.findById(cwe_id).orElseThrow(() -> new ResourceNotFoundException("This Data does not Exist in the Database CWE_ID: [" + cwe_id + "]"));
        cwedao.setCwe_id(updateBoard.getCwe_id());
        cwedao.setCwe_name(updateBoard.getCwe_name());
        cwedao.setSrcGood(updateBoard.getSrcGood());
        cwedao.setSrcBad(updateBoard.getSrcBad());
        cwedao.setByteGood(updateBoard.getByteGood());
        cwedao.setByteBad(updateBoard.getByteBad());

        cweDao endUpdate = repo.save(cwedao);
        return ResponseEntity.ok(endUpdate);
    }

    public ResponseEntity<Map<String, Boolean>> deleteBoard(Integer cwe_id) {
        cweDao cwedao = repo.findById(cwe_id).orElseThrow(() -> new ResourceNotFoundException("This Data does not Exist in the Database CWE_ID: [" + cwe_id + "]"));

        repo.delete(cwedao);
        Map<String, Boolean> response = new HashMap<>();
        response.put("Deleted CODE Data by cwe_id : {" + cwe_id + "}", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

    public ResponseEntity<Map<String, Boolean>> deleteCwe(Integer cwe_id) {
        cwemetaVo cwevo = metarepo.findById(cwe_id).orElseThrow(() -> new ResourceNotFoundException("This Data does not Exist in the Database CWE_ID: [" + cwe_id + "]"));

        metarepo.delete(cwevo);
        Map<String, Boolean> res = new HashMap<>();
        res.put("Deleted CWE Data by cwe_id : {" + cwe_id + "}", Boolean.TRUE);
        return ResponseEntity.ok(res);
    }
}

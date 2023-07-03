package com.example.iselbkj_backend.service;


import com.example.iselbkj_backend.model.cwemetaVo;
import com.example.iselbkj_backend.Repository.cweRepository;
import com.example.iselbkj_backend.Repository.cwemetaRepository;
import com.example.iselbkj_backend.model.cweDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class cweService {

    @Autowired
    private cweRepository repo;
    private cwemetaRepository metarepo;

    public List<cweDao> getAllBoards()
    {
        return repo.findAll();
    }

    public List<cwemetaVo> getMetaData()
    {
        return metarepo.findAll();
    }

    public cweDao createBoard(cweDao cwedao)
    {
        return repo.save(cwedao);
    }
    public cwemetaVo createMetaBoard(cwemetaVo cwemetavo) { return metarepo.save(cwemetavo);}




}

package com.example.iselbkj_backend.service;

import com.example.iselbkj_backend.Repository.cweRepository;
import com.example.iselbkj_backend.model.cweDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service

public class cweService {

    @Autowired
    private cweRepository repo;

    public List<cweDao> getAllBoards()
    {
        return repo.findAll();
    }

}

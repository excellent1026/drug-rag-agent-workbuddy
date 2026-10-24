package com.drugrag.service;

import com.drugrag.entity.Drug;
import com.drugrag.mapper.DrugMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class DrugServiceImpl implements DrugService{

    @Resource
    private DrugMapper drugMapper;

    @Override
    public List<Drug> findAll() {
        return drugMapper.selectAll();
    }

    @Override
    public List<Drug> search(String keyword) {
        return drugMapper.selectByKeyword(keyword);
    }
}
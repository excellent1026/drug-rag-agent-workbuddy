package com.drugrag.service;

import com.drugrag.entity.Drug;
import java.util.List;

public interface DrugService {
    List<Drug> findAll();
    List<Drug> search(String keyword);
}
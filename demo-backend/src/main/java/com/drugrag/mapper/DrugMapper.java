package com.drugrag.mapper;

import com.drugrag.entity.Drug;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface DrugMapper {
    List<Drug> selectAll();
    List<Drug> selectByKeyword(String keyword);
}
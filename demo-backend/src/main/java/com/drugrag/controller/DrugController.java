package com.drugrag.controller;

import com.drugrag.entity.Drug;
import com.drugrag.service.DrugService;
import com.drugrag.vo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/drug")
public class DrugController {

    @Resource
    private DrugService drugService;

    @GetMapping("/list")
    public Result<List<Drug>> list(){
        List<Drug> list = drugService.findAll();
        return Result.success(list);
    }

    @GetMapping("/search")
    public Result<List<Drug>> search(@RequestParam String keyword){
        List<Drug> list = drugService.search(keyword);
        return Result.success(list);
    }
}
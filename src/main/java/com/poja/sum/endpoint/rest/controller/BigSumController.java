package com.poja.sum.endpoint.rest.controller;

import com.poja.sum.service.BigSumService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BigSumController {

    BigSumService bigSumService;

    @GetMapping("/big-sum")
    public String makeSum(@RequestParam String a, @RequestParam String b){
        return bigSumService.sum(a, b);
    }

}
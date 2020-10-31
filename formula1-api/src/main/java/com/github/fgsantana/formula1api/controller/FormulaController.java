package com.github.fgsantana.formula1api.controller;

import com.github.fgsantana.formula1api.client.FormulaFeignClient;
import com.github.fgsantana.formula1api.dto.request.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FormulaController {
    final FormulaFeignClient client;

    @GetMapping("/{season}/{round}")
    public Result getRaceResult(@PathVariable("season") String season, @PathVariable("round") String round) {
        return client.getRaceResult(season, round);
    }





}

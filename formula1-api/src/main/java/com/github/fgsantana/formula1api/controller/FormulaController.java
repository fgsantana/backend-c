package com.github.fgsantana.formula1api.controller;

import com.github.fgsantana.formula1api.dto.response.ResponseResult;
import com.github.fgsantana.formula1api.dto.response.ResponseSeasonResult;
import com.github.fgsantana.formula1api.service.FormulaService;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FormulaController {
    final FormulaService service;

    @GetMapping("/{season}/{round}")
    public ResponseResult getRaceResult(@PathVariable("season") String season, @PathVariable("round") String round) {
        return service.getRound(season, round);
    }

    @GetMapping("/{season}")
    public ResponseSeasonResult getAllRaces(@PathVariable("season") String season, @Nullable @RequestParam("size") Long size, @Nullable @RequestParam("page") Long page) {
        return service.getAllRacesPage(season, size, page);
    }


}

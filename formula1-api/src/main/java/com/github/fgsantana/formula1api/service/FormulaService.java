package com.github.fgsantana.formula1api.service;

import com.github.fgsantana.formula1api.client.FormulaFeignClient;
import com.github.fgsantana.formula1api.dto.request.RaceTbl;
import com.github.fgsantana.formula1api.dto.request.Result;
import com.github.fgsantana.formula1api.dto.response.ResponseResult;
import com.github.fgsantana.formula1api.dto.response.ResponseSeasonResult;
import com.github.fgsantana.formula1api.exception.InvalidFormatException;
import feign.FeignException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FormulaService {

    final FormulaFeignClient client;


    public ResponseResult getRound(String season, String round) {
        try {
            Result result = client.getRaceResult(season, round);
            RaceTbl table = result.getMrData().getRaceTable();
            return ResponseResult.builder().season(table.getSeason()).round(table.getRound()).raceInfo(table.getRaces()[0]).results(table.getRaces()[0].getResults()).build();
        } catch (FeignException.BadRequest e) {
            throw new InvalidFormatException();
        }
    }


}

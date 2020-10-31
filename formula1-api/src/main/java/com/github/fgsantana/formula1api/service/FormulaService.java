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
            return ResponseResult.builder().raceInfo(table.getRaces()[0]).build();
        } catch (FeignException.BadRequest e) {
            throw new InvalidFormatException();
        }
    }

    public ResponseSeasonResult getAllRacesPage(String year, Long size, Long page) {
        try {
            Result result = client.getAllRacesPage(year, size, page);
            return ResponseSeasonResult.builder().raceTable(result.getMrData().getRaceTable()).build();
        } catch (FeignException.BadRequest e) {
            throw new InvalidFormatException();
        }
    }


}

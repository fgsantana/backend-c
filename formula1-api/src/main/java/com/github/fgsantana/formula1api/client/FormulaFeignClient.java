package com.github.fgsantana.formula1api.client;

import com.github.fgsantana.formula1api.dto.request.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "https://ergast.com/api", name = "formula")
public interface FormulaFeignClient {

    @GetMapping("/f1/{year}/{round}/results.json")
    Result getRaceResult(@PathVariable("year") String year, @PathVariable("round") String round);

    
}

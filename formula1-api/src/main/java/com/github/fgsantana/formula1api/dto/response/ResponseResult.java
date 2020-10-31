package com.github.fgsantana.formula1api.dto.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.fgsantana.formula1api.dto.request.Race;
import com.github.fgsantana.formula1api.dto.request.type.ResultDriver;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseResult {
    private String season;
    private String round;

    @JsonProperty("RaceInformation")
    private Race raceInfo;

    @JsonProperty("Results")
    private ResultDriver[] results;
}

package com.github.fgsantana.formula1api.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.fgsantana.formula1api.dto.request.RaceTbl;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ResponseSeasonResult {
    @JsonProperty("RaceTable")
    RaceTbl raceTable;
}

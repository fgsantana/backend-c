package com.github.fgsantana.formula1api.dto.request.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.fgsantana.formula1api.dto.request.RaceTbl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MRData {
    @JsonProperty("RaceTable")
    RaceTbl raceTable;
}

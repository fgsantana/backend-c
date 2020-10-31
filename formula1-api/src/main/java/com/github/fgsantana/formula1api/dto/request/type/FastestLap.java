package com.github.fgsantana.formula1api.dto.request.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FastestLap {
    private String rank;
    private String lap;
    @JsonProperty("Time")
    private TimeFastest time;
    @JsonProperty("AverageSpeed")
    private AverageSpeed avgSpeed;

}

package com.github.fgsantana.formula1api.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RaceTbl {
    private String season;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String round;
    @JsonProperty("Races")
    private Race[] races;
}

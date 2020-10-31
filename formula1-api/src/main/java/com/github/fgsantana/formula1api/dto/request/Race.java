package com.github.fgsantana.formula1api.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.fgsantana.formula1api.dto.request.type.Circuit;
import com.github.fgsantana.formula1api.dto.request.type.ResultDriver;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Race {
    private String season;
    private String round;
    private String url;
    private String raceName;
    @JsonProperty("Circuit")
    private Circuit circuit;
    private String date;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String time;
    @JsonProperty("Results")
    private ResultDriver[] results;
}

package com.github.fgsantana.formula1api.dto.request.type;

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
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultDriver {
    private String number;
    private String position;
    private String positionText;
    private String points;

    @JsonProperty("Driver")
    private Driver driverInfo;

    @JsonProperty("Constructor")
    private Constructor constructor;

    private String grid;
    private String laps;
    private String status;

    @JsonProperty(value = "Time")
    private Time time;

    @JsonProperty(value = "FastestLap")
    private FastestLap fastestLap;


}

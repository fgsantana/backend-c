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
public class Location {
    private String lat;
    @JsonProperty(value = "long")
    private String longi;
    private String locality;
    private String country;

}

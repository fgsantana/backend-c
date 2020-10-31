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
public class Circuit {
    private String circuitId;
    private String url;
    private String circuitName;
    @JsonProperty("Location")
    private Location location;
}

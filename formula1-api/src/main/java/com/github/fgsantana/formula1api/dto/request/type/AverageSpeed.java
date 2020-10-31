package com.github.fgsantana.formula1api.dto.request.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AverageSpeed {
    private String units;
    private String speed;
}

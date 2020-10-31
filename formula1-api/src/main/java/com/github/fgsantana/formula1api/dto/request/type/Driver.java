package com.github.fgsantana.formula1api.dto.request.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Driver {
    private String driverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String permanentNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String code;
    private String url;
    private String givenName;
    private String familyName;
    private String dateOfBirth;
    private String nationality;


}

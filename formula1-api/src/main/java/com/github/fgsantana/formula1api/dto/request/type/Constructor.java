package com.github.fgsantana.formula1api.dto.request.type;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Constructor {
    private String constructorId;
    private String url;
    private String name;
    private String nationality;

}

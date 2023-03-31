package com.test.metadata.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Meta {

    private String value;
    private Long rate;
    private Boolean isAlways;
}

package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Person {

    @ApiModelProperty(value = "id", dataType = "uuid", required = true)
    private final UUID id;

    @NotBlank
    @ApiModelProperty(value = "name", dataType = "string", required = true)
    private final String name;

    public Person(@JsonProperty("id") UUID id, @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

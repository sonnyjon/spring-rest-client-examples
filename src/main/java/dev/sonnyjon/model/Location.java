package dev.sonnyjon.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sonny on 8/20/2022.
 */
@Getter
@Setter
public class Location implements Serializable
{
    private String street;
    private String city;
    private String state;
    private String postcode;
    private Map<String, Object> additionalProperties = new HashMap<>();

    private final static long serialVersionUID = -3532048267747973846L;
}

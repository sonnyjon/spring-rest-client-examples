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
public class Name implements Serializable
{
    private String title;
    private String first;
    private String last;
    private Map<String, Object> additionalProperties = new HashMap<>();

    private final static long serialVersionUID = 420620315591775395L;
}

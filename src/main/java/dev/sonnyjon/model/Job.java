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
public class Job implements Serializable
{
    private String title;
    private String company;
    private Map<String, Object> additionalProperties = new HashMap<>();

    private final static long serialVersionUID = -4985150429002262656L;
}

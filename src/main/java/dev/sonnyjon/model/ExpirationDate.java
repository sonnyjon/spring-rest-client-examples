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
public class ExpirationDate implements Serializable
{
    private String date;
    private Integer timezoneType;
    private String timezone;
    private Map<String, Object> additionalProperties = new HashMap<>();

    private final static long serialVersionUID = 4661228813349752965L;
}

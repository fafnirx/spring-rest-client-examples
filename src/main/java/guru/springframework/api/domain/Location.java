package guru.springframework.api.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
public class Location implements Serializable {
    private String street;
    private String city;
    private String state;
    private String postcode;
    private Map<String,Object> additionalProperties = new HashMap<>();
}

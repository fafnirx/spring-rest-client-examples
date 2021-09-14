package guru.springframework.api.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
public class ExpirationDate implements Serializable {
    private String date;
    private Integer timezoneType;
    private String timezone;
    private Map<String,Object> additionalProperties = new HashMap<>();
}

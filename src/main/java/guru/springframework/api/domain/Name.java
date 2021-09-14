package guru.springframework.api.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
public class Name implements Serializable {
    private String title;
    private String first;
    private String last;
    private Map<String,Object> additionalProperties = new HashMap<>();
}

package guru.springframework.api.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
public class Billing implements Serializable {
    private Card card;
    private Map<String,Object> additionalProperties = new HashMap<>();
}

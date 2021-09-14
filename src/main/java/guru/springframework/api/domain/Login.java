package guru.springframework.api.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
public class Login implements Serializable {
    private String username;
    private String password;
    private String md5;
    private String sha1;
    private String sha256;
    private Map<String,Object> additionalProperties = new HashMap<>();
}

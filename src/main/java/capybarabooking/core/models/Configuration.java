package capybarabooking.core.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Configuration {

    private String driverClassName;

    private String url;

    private String username;

    private String password;
}

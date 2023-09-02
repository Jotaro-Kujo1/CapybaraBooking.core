package capybarabooking.core.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Sysname {

    @Id
    private String name;

    private Integer hbdataverid;
}

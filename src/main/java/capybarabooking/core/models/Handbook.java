package capybarabooking.core.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Handbook {

    @Id
    public Integer hbdataverid;

    public String name;

    public String description;

    public String stringfield00;

    public String stringfield01;

    public String stringfield02;

    public String stringfield03;

    public String stringfield04;

    public String stringfield05;

    public String stringfield06;

    public String stringfield07;

    public String stringfield08;

    public String stringfield09;

    public String stringfield10;

    public Integer intfield00;

    public Integer intfield01;

    public Integer intfield02;

    public Integer intfield03;

    public Integer intfield04;

    public Integer intfield05;

    public Integer intfield06;

    public Integer intfield07;

    public Integer intfield08;

    public Integer intfield09;

    public Integer intfield10;

    public Double doublefield00;

    public Double doublefield01;

    public Double doublefield02;

    public Double doublefield03;

    public Double doublefield04;

    public Double doublefield05;

    public Double doublefield06;

    public Double doublefield07;

    public Double doublefield08;

    public Double doublefield09;

    public Double doublefield10;
}

package net.surtronika.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
public class Airline {
    private Long id;
    private String name;
    private String country;
    private String logo;
    private String slogan;
    private String headQuaters;
    private String website;
    private String established;
}

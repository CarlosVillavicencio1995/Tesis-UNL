package com.unl.tesis.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Getter
@Setter
@Entity(name = "person_vaccine")
public class PersonVaccine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Long id;
    private Long vaccineId;
    private Long personaId;
    private Date date;
    private Integer dose;
}

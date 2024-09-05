package com.example.BSMS.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name="Busses")
public class Busses {
    @Id
    @Column(name = "bus_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int busId;

    @Column(name = "city", length = 100, nullable = false)
    private String city;

    @Column(name = "fare" ,length = 100,nullable = false)
    private int fare;

    @Column(name = "Name" ,length = 100,nullable = false)
    private String Name;
    @Column(name = "depature", length = 100, nullable = false)
    private int depature;

    @Column(name = "arrival" ,length = 100,nullable = false)
    private int arrival;

    @Column(name = "seats", length = 100, nullable = false)
    private int seats;



}

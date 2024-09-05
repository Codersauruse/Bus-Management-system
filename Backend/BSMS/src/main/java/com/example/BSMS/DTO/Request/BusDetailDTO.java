package com.example.BSMS.DTO.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BusDetailDTO {
    private String city;
    private int fare;
    private String Name;
    private int depature;
    private int arrival;
    private int seats;

}


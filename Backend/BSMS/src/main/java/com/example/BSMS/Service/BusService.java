package com.example.BSMS.Service;

import com.example.BSMS.DTO.Request.BusDetailDTO;

import java.util.List;

public interface BusService {
    List<BusDetailDTO> getAllBusses();
}

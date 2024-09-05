package com.example.BSMS.Service;

import com.example.BSMS.DTO.Request.BusDetailDTO;
import com.example.BSMS.Entity.Busses;
import com.example.BSMS.Repo.BusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BusServiceIMPL implements BusService{

    @Autowired
    BusRepo BusRepo;
    @Override
    public List<BusDetailDTO> getAllBusses() {
        List<Busses> BusInfo = BusRepo.findAll();
        List<BusDetailDTO> Busdetails = new ArrayList<BusDetailDTO>();
        for (Busses b:BusInfo
             ) {
            Busdetails.add(new BusDetailDTO(b.getCity(),b.getFare(),b.getName(),b.getDepature(),b.getArrival(),b.getSeats()));
        }
        return Busdetails;
    }
}

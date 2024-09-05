package com.example.BSMS.Controller;

import com.example.BSMS.DTO.Request.BusDetailDTO;
import com.example.BSMS.Service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.BSMS.Service.BusService;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/BusInfo")
public class BusInfoController {
    @Autowired
    BusService BusService;
    @GetMapping(path="get-All-buses")
    public List<BusDetailDTO> getAllBuses(){
        List<BusDetailDTO> busInfo = BusService.getAllBusses();
        return busInfo;
    }


}

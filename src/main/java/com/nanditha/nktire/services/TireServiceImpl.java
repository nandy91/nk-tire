package com.nanditha.nktire.services;

import com.nanditha.nktire.model.TireDto;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class TireServiceImpl implements TireService {
    @Override
    public TireDto getTireById(UUID tireId) {
        return TireDto.builder().id(UUID.randomUUID())
                .tireName("XGRIP4S")
                .tireStyle("Passenger Tire")
                .build();
    }
}

package com.nanditha.nktire.services;

import com.nanditha.nktire.model.TireDto;

import java.util.UUID;

public interface TireService {

    TireDto getTireById(UUID tireId);
}

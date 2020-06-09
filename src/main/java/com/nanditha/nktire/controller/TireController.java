package com.nanditha.nktire.controller;

import com.nanditha.nktire.model.TireDto;
import com.nanditha.nktire.services.TireService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RequestMapping("/api/v1/tire")
@RestController
public class TireController {
    private final TireService tireService;

    public TireController(TireService tireService) {
        this.tireService = tireService;
    }

    @GetMapping({"/{tireId}"})
    public ResponseEntity<TireDto> getTire(@PathVariable("tireId") UUID tireId) {
        return new ResponseEntity<>(tireService.getTireById(tireId), HttpStatus.OK);
    }
}

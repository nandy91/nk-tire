package com.nanditha.nktire.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TireDto {
    private UUID id;
    private String tireName;
    private String tireStyle;
    private Long upc;

}

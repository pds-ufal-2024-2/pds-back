package com.cc.pds.domain;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Location {

    @NotBlank(message = "Neighborhood is required")
    private String neighborhood;

    @NotBlank(message = "Street is required")
    private String street;

    @NotBlank(message = "Nearest house number is required")
    private String nearestHouseNumber;

    @NotBlank(message = "Reference point is required")
    private String referencePoint;

    private String zipCode;


}

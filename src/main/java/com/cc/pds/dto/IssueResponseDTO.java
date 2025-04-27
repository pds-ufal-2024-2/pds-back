package com.cc.pds.dto;

import com.cc.pds.domain.IssueDescription;
import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class IssueResponseDTO {
    private String neighborhood;
    private String street;
    private String nearestHouseNumber;
    private String referencePoint;
    private String zipCode;
    private IssueDescription issueDescription;
}

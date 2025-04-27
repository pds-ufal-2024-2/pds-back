package com.cc.pds.controller;


import com.cc.pds.domain.IssueDescription;
import com.cc.pds.dto.IssueRequestDTO;
import com.cc.pds.dto.IssueResponseDTO;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/issues")
@AllArgsConstructor
public class IssueController {

    @PostMapping
    public ResponseEntity<IssueResponseDTO> registerIssue(
            @NotNull @RequestBody IssueRequestDTO issueDTO
    ) {
        return new ResponseEntity<>(
                IssueResponseDTO
                        .builder()
                            .nearestHouseNumber(issueDTO.location().getNearestHouseNumber())
                            .neighborhood(issueDTO.location().getNeighborhood())
                            .referencePoint(issueDTO.location().getReferencePoint())
                            .street(issueDTO.location().getStreet())
                            .zipCode(issueDTO.location().getZipCode())
                            .issueDescription(
                                    IssueDescription
                                            .builder()
                                                .issueCategory(issueDTO.issueDescription().getIssueCategory())
                                                .issueDescription(issueDTO.issueDescription().getIssueDescription())
                                            .build()
                            )
                        .build(),
                HttpStatus.CREATED
        );
    }
}

package com.cc.pds.controller;


import com.cc.pds.domain.IssueDescription;
import com.cc.pds.domain.Location;
import com.cc.pds.dto.IssueRequestDTO;
import com.cc.pds.dto.IssueResponseDTO;
import com.cc.pds.service.IssueService;
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
    private final IssueService issueService;
    @PostMapping
    public ResponseEntity<IssueResponseDTO> registerIssue(
            @NotNull @RequestBody IssueRequestDTO issueDTO
    ) {
        var createdIssue = issueService.createIssue(issueDTO);
        return new ResponseEntity<>(createdIssue, HttpStatus.CREATED);
    }
}

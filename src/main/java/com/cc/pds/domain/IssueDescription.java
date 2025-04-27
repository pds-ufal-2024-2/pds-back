package com.cc.pds.domain;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class IssueDescription {

    @NotBlank(message = "issueCategory is required")
    private String issueCategory;

    @NotBlank(message = "issueDescription is required")
    private String issueDescription;
}

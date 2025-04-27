package com.cc.pds.domain;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class IssueDescription {

    @NotBlank(message = "issueCategory is required")
    private String issueCategory;

    @NotBlank(message = "issueDescription is required")
    private String issueDescription;
}

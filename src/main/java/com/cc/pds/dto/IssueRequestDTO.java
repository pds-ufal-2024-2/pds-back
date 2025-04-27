package com.cc.pds.dto;

import com.cc.pds.domain.IssueDescription;
import com.cc.pds.domain.Location;

public record IssueRequestDTO(
        Location location,
        IssueDescription issueDescription
) {
}

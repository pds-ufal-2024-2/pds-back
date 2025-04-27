package com.cc.pds.dto;

import com.cc.pds.domain.IssueDescription;
import com.cc.pds.domain.Location;
import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class IssueResponseDTO {
    private Location location;
    private IssueDescription issueDescription;
}

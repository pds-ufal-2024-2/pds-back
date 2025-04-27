package com.cc.pds.service;

import com.cc.pds.dto.IssueRequestDTO;
import com.cc.pds.dto.IssueResponseDTO;

public interface IssueService {
    IssueResponseDTO createIssue(IssueRequestDTO issueRequestDTO);
}

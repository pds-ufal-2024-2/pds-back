package com.cc.pds.service.impl;

import com.cc.pds.dto.IssueRequestDTO;
import com.cc.pds.dto.IssueResponseDTO;
import com.cc.pds.entity.Issue;
import com.cc.pds.repository.IssueRepository;
import com.cc.pds.service.IssueService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class IssueServiceImpl implements IssueService {
    private final IssueRepository issueRepository;

    @Override
    @Transactional
    public IssueResponseDTO createIssue(IssueRequestDTO issueRequestDTO) {
        Issue issue = new Issue();
        issue.setLocation(issueRequestDTO.location());
        issue.setIssueDescription(issueRequestDTO.issueDescription());

        issueRepository.save(issue);
        return IssueResponseDTO
                .builder()
                .location(issue.getLocation())
                .issueDescription(issue.getIssueDescription())
                .build();
    }

}

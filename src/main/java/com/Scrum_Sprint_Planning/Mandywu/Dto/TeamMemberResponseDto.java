package com.Scrum_Sprint_Planning.Mandywu.Dto;

import com.Scrum_Sprint_Planning.Mandywu.data.TeamMemberResponseData;
import com.Scrum_Sprint_Planning.Mandywu.entity.TeammateScore;

import java.util.List;

public class TeamMemberResponseDto {
    private String userStoryId;
    private String description;
    private List<TeammateScore> teammateScoreList;

    public TeamMemberResponseDto(TeamMemberResponseData teamMemberResponseData) {
        this.userStoryId = teamMemberResponseData.getUserStoryId();
        this.description = teamMemberResponseData.getDescription();
        this.teammateScoreList = teamMemberResponseData.getTeammateScoreList();
    }

    public String getUserStoryId() {
        return userStoryId;
    }

    public void setUserStoryId(String userStoryId) {
        this.userStoryId = userStoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<TeammateScore> getTeammateScoreList() {
        return teammateScoreList;
    }

    public void setTeammateScoreList(List<TeammateScore> teammateScoreList) {
        this.teammateScoreList = teammateScoreList;
    }
}

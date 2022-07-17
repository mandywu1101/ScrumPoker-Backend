package com.Scrum_Sprint_Planning.Mandywu.data;

import com.Scrum_Sprint_Planning.Mandywu.entity.TeammateScore;
import com.Scrum_Sprint_Planning.Mandywu.entity.UserStoryEntity;

import java.util.List;

public class TeamMemberResponseData {
    private String userStoryId;
    private String description;
    private List<TeammateScore> teammateScoreList;

    public TeamMemberResponseData(UserStoryEntity userStoryEntity) {
        this.userStoryId = userStoryEntity.getUserStoryId();
        this.description = userStoryEntity.getDescription();
        this.teammateScoreList = userStoryEntity.getTeammateScoreList();
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

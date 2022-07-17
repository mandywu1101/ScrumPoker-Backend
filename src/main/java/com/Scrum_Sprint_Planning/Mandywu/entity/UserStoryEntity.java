package com.Scrum_Sprint_Planning.Mandywu.entity;

import com.Scrum_Sprint_Planning.Mandywu.data.AddScoreData;
import com.Scrum_Sprint_Planning.Mandywu.data.UserStoryData;

import java.util.ArrayList;
import java.util.List;

public class UserStoryEntity {
    private String userStoryId;
    private String description;
    private List<TeammateScore> teammateScoreList;


    public UserStoryEntity(UserStoryData userStoryData) {
        this.userStoryId = userStoryData.getUserStoryId();
        this.description = userStoryData.getDescription();
        this.teammateScoreList = new ArrayList<>();
    }

    public UserStoryEntity(AddScoreData addScoreData) {
        this.userStoryId = addScoreData.getUserStoryId();
    }

    public List<TeammateScore> getTeammateScoreList() {
        return teammateScoreList;
    }

    public void setTeammateScoreList(List<TeammateScore> teammateScoreList) {
        this.teammateScoreList = teammateScoreList;
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

    @Override
    public String toString() {
        return "No:" + userStoryId + " Story=" + description ;
    }
}

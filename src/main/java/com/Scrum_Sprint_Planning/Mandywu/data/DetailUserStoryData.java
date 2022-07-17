package com.Scrum_Sprint_Planning.Mandywu.data;

import com.Scrum_Sprint_Planning.Mandywu.entity.UserStoryEntity;

public class DetailUserStoryData {
    private String userStoryId;
    private String description;

    public DetailUserStoryData(UserStoryEntity userStoryEntity) {
        this.userStoryId = userStoryEntity.getUserStoryId();
        this.description = userStoryEntity.getDescription();
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
        return "DetailUserStoryData{" +
                "userStoryId='" + userStoryId + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

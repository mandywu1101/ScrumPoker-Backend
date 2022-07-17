package com.Scrum_Sprint_Planning.Mandywu.Dto;

import com.Scrum_Sprint_Planning.Mandywu.data.DetailUserStoryData;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DetailUserStoryDto {

    @JsonProperty("UserStory_id")
    private String userStoryId;

    @JsonProperty("UserStory_description")
    private String description;

    public DetailUserStoryDto(DetailUserStoryData detailUserStoryData) {
        this.userStoryId = detailUserStoryData.getUserStoryId();
        this.description = detailUserStoryData.getDescription();
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
}

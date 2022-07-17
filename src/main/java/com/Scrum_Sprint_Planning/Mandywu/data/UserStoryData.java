package com.Scrum_Sprint_Planning.Mandywu.data;

import com.Scrum_Sprint_Planning.Mandywu.Dto.CreateUserStoryDto;

public class UserStoryData {
    private String userStoryId;
    private String description;

    public UserStoryData(CreateUserStoryDto createUserStoryDto) {
        this.userStoryId = createUserStoryDto.getUserStoryId();
        this.description = createUserStoryDto.getDescription();
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

package com.Scrum_Sprint_Planning.Mandywu.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;


public class CreateUserStoryDto {

    @JsonProperty("UserStory_id")
    private String userStoryId;

    @JsonProperty("TeamMember_Address")
    private String teamMemberAddress;

    @JsonProperty("UserStory_description")
    private String description;

    public CreateUserStoryDto(String userStoryId, String teamMemberAddress, String description) {
        this.userStoryId = userStoryId;
        this.teamMemberAddress = teamMemberAddress;
        this.description = description;
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

    public String getTeamMemberAddress() {
        return teamMemberAddress;
    }

    public void setTeamMemberAddress(String teamMemberAddress) {
        this.teamMemberAddress = teamMemberAddress;
    }

    @Override
    public String toString() {
        return "CreateUserStoryDto{" +
                "userStoryId='" + userStoryId + '\'' +
                ", teamMemberAddress='" + teamMemberAddress + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

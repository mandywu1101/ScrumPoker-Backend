package com.Scrum_Sprint_Planning.Mandywu.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddScoreDto {
    private String userStoryId;
    private String teamMemberAddress;
    private String score;

    public AddScoreDto(String userStoryId, String teamMemberAddress, String score) {
        this.userStoryId = userStoryId;
        this.teamMemberAddress = teamMemberAddress;
        this.score = score;
    }

    public String getUserStoryId() {
        return userStoryId;
    }

    public void setUserStoryId(String userStoryId) {
        this.userStoryId = userStoryId;
    }

    public String getTeamMemberAddress() {
        return teamMemberAddress;
    }

    public void setTeamMemberAddress(String teamMemberAddress) {
        this.teamMemberAddress = teamMemberAddress;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

}

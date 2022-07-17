package com.Scrum_Sprint_Planning.Mandywu.data;

import com.Scrum_Sprint_Planning.Mandywu.Dto.AddScoreDto;

public class AddScoreData {
    private String userStoryId;
    private String teamMemberAddress;
    private String score;


    public AddScoreData(AddScoreDto addScoreDto) {
        this.userStoryId = addScoreDto.getUserStoryId();
        this.teamMemberAddress = addScoreDto.getTeamMemberAddress();
        this.score = addScoreDto.getScore();
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

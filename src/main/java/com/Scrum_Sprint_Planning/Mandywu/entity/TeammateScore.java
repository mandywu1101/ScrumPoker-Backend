package com.Scrum_Sprint_Planning.Mandywu.entity;

import com.Scrum_Sprint_Planning.Mandywu.data.AddScoreData;

public class TeammateScore {
    private String teamMemberAddress;
    private String score;

    public TeammateScore(AddScoreData addScoreData) {
        this.teamMemberAddress = addScoreData.getTeamMemberAddress();
        this.score = addScoreData.getScore();
    }

    public TeammateScore() {
        this.teamMemberAddress = null;
        this.score = null;
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

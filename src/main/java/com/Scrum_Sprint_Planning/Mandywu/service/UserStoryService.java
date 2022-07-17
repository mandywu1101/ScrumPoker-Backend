package com.Scrum_Sprint_Planning.Mandywu.service;

import com.Scrum_Sprint_Planning.Mandywu.data.AddScoreData;
import com.Scrum_Sprint_Planning.Mandywu.data.DetailUserStoryData;
import com.Scrum_Sprint_Planning.Mandywu.data.TeamMemberResponseData;
import com.Scrum_Sprint_Planning.Mandywu.data.UserStoryData;
import com.Scrum_Sprint_Planning.Mandywu.entity.TeammateScore;
import com.Scrum_Sprint_Planning.Mandywu.entity.UserStoryEntity;

import java.util.HashMap;
import java.util.List;

public interface UserStoryService {
    DetailUserStoryData addUserStory(UserStoryData userStoryData);
    List<DetailUserStoryData> getAllUserStory();
    TeamMemberResponseData addScore(AddScoreData addScoreData);
    DetailUserStoryData findUserStory(String userStoryId);

}

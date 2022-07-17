package com.Scrum_Sprint_Planning.Mandywu.service.impl;

import com.Scrum_Sprint_Planning.Mandywu.data.AddScoreData;
import com.Scrum_Sprint_Planning.Mandywu.data.DetailUserStoryData;
import com.Scrum_Sprint_Planning.Mandywu.data.TeamMemberResponseData;
import com.Scrum_Sprint_Planning.Mandywu.data.UserStoryData;
import com.Scrum_Sprint_Planning.Mandywu.entity.TeammateScore;
import com.Scrum_Sprint_Planning.Mandywu.entity.UserStoryEntity;
import com.Scrum_Sprint_Planning.Mandywu.service.UserStoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class UserStoryServiceImpl implements UserStoryService {

    List<UserStoryEntity> userStoryEntityList = new ArrayList<>();

    public DetailUserStoryData addUserStory(UserStoryData userStoryData) {
        UserStoryEntity newUserStoryEntity = new UserStoryEntity(userStoryData);
        userStoryEntityList.add(newUserStoryEntity);
        return new DetailUserStoryData(newUserStoryEntity);
    }

    public List<DetailUserStoryData> getAllUserStory() {
        List<DetailUserStoryData> detailUserStoryDataList = new ArrayList<>();
        for (UserStoryEntity userStoryEntity : userStoryEntityList) {
            detailUserStoryDataList.add(new DetailUserStoryData(userStoryEntity));
        }
        return detailUserStoryDataList;
    }


    public TeamMemberResponseData addScore(AddScoreData addScoreData) {
        for (UserStoryEntity userStoryEntity : userStoryEntityList) {
            if (userStoryEntity.getUserStoryId().equals(addScoreData.getUserStoryId())) {
                TeammateScore teammateScore = new TeammateScore(addScoreData);
                userStoryEntity.getTeammateScoreList().add(teammateScore);
                userStoryEntity.setTeammateScoreList(userStoryEntity.getTeammateScoreList());
                return new TeamMemberResponseData(userStoryEntity);
            }
        }
        return null;
    }

    public DetailUserStoryData findUserStory(String userStoryId){
        for (UserStoryEntity userStoryEntity : userStoryEntityList) {
            if (userStoryEntity.getUserStoryId().equals(userStoryId)){
                return new DetailUserStoryData(userStoryEntity);
            }
            System.out.println("NOT FOUND");
        }
        return null;
    }
}

package com.Scrum_Sprint_Planning.Mandywu.api;

import com.Scrum_Sprint_Planning.Mandywu.Dto.AddScoreDto;
import com.Scrum_Sprint_Planning.Mandywu.Dto.CreateUserStoryDto;
import com.Scrum_Sprint_Planning.Mandywu.Dto.DetailUserStoryDto;
import com.Scrum_Sprint_Planning.Mandywu.Dto.TeamMemberResponseDto;
import com.Scrum_Sprint_Planning.Mandywu.data.AddScoreData;
import com.Scrum_Sprint_Planning.Mandywu.data.DetailUserStoryData;
import com.Scrum_Sprint_Planning.Mandywu.data.TeamMemberResponseData;
import com.Scrum_Sprint_Planning.Mandywu.data.UserStoryData;
import com.Scrum_Sprint_Planning.Mandywu.entity.TeammateScore;
import com.Scrum_Sprint_Planning.Mandywu.entity.UserStoryEntity;
import com.Scrum_Sprint_Planning.Mandywu.service.impl.UserStoryServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@CrossOrigin(origins = {"http://localhost:3000"}, maxAge = 3600)
//@CrossOrigin(origins = "*",allowCredentials="true",allowedHeaders = "*",methods = {POST,GET,PUT})


@RestController
public class UserStoryApi {

    private final UserStoryServiceImpl userStoryService;

    public UserStoryApi(UserStoryServiceImpl userStoryService) {
        this.userStoryService = userStoryService;
    }

    @PostMapping("/public/userStory")
    public DetailUserStoryDto CreateUserStory(@RequestBody CreateUserStoryDto createProductDto) {
        UserStoryData userStoryData = new UserStoryData(createProductDto);
        return new DetailUserStoryDto(userStoryService.addUserStory(userStoryData));
    }

    @GetMapping("/public/userStory")
    public List<DetailUserStoryDto> getAllUserStory() {
        List<DetailUserStoryDto> detailUserStoryDtoList = new ArrayList<>();
        List<DetailUserStoryData> detailUserStoryDataList = userStoryService.getAllUserStory();
        for (DetailUserStoryData detailUserStoryData : detailUserStoryDataList) {
            DetailUserStoryDto detailUserStoryDto = new DetailUserStoryDto(detailUserStoryData);
            detailUserStoryDtoList.add(detailUserStoryDto);
        }
        return detailUserStoryDtoList;
    }

    @PutMapping("/public/userStory/{userStoryId}/{email}/{score}")
    public TeamMemberResponseDto addScore(@PathVariable(value = "userStoryId") String userStoryId,
                         @PathVariable(value = "email") String email,
                         @PathVariable(value = "score") String score) {
        AddScoreData addScoreData = new AddScoreData(new AddScoreDto(userStoryId,email,score));
         TeamMemberResponseData teamMemberResponseData = userStoryService.addScore(addScoreData);
        return new TeamMemberResponseDto(teamMemberResponseData);
    }

    @GetMapping("/public/userStory/{userStoryId}")
    public DetailUserStoryDto findUserStoryById(@PathVariable String userStoryId) {
       return new DetailUserStoryDto(userStoryService.findUserStory(userStoryId));
    }

}

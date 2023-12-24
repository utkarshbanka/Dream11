package com.Dream11.Dream11.Service;

import com.Dream11.Dream11.Exception.ResourceNotFound;
import com.Dream11.Dream11.Model.Team;
import com.Dream11.Dream11.Repositry.TeamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl  implements  TeamService{


    @Autowired
    private TeamRepo teamRepo;


    @Override
    public Team creatteam(Team team) {


        return  teamRepo.save(team);
    }

    @Override
    public String deletteam(Integer id) {

         Team s = teamRepo.findById(id).orElseThrow(()->new ResourceNotFound("No Team Exist With this id"));
        return "Team Delete Successfully";
    }

    @Override
    public Team getteam(Integer id) {


        return  teamRepo.findById(id).orElseThrow(()->new ResourceNotFound("No team found for this id"));
    }

    @Override
    public List<Team> getteam(String Name) {

        return  teamRepo.findAllByTeamName(Name);
    }
}

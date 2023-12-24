package com.Dream11.Dream11.Service;

import com.Dream11.Dream11.Model.Team;

import java.util.List;

public interface TeamService {


    public Team   creatteam(Team team);

    public String deletteam(Integer id);


    public  Team getteam(Integer id);

    public List<Team> getteam(String Name);
}

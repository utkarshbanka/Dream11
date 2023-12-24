package com.Dream11.Dream11.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Team {


    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer teamId;

    private String teamName;

    private String country;

    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<Player> players;

    @ManyToMany
    @JoinTable(
            name = "team_sport",
            joinColumns = @JoinColumn(name = "teamId"),
            inverseJoinColumns = @JoinColumn(name = "sportId"))
    private List<Sport> sports;


}

package com.Dream11.Dream11.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer playerId;

    private String playerName;

    private String skill;

    private String price;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

}

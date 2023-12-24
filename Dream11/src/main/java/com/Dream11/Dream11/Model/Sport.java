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
public class Sport {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer sportId;

    private String sportName;

    @ManyToMany(mappedBy = "sports")
    private List<Team> teams;


}

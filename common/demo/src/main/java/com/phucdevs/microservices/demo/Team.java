package com.phucdevs.microservices.demo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@Entity
//@XmlRootElement
public class Team {

    @Id
    @GeneratedValue
    Long id;
    String name;
    String location;
    String mascotte;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "teamId")
    Set<Player> players;

    public Team(String name, String location, String mascotte, Set<Player> players) {
        this.name = name;
        this.location = location;
        this.mascotte = mascotte;
        this.players = players;
    }
}

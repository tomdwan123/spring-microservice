package com.phucdevs.microservices;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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

package com.phucdevs.microservices;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Player {

    @Id
    @GeneratedValue
    Long id;

    String name;
    String position;

    public Player(String name, String position) {
        this.name = name;
        this.position = position;
    }
}

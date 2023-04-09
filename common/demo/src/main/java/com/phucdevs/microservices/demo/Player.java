package com.phucdevs.microservices.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Player {

    @Id @GeneratedValue
    Long id;

    String name;
    String position;

    public Player(String name, String position) {
        this.name = name;
        this.position = position;
    }
}

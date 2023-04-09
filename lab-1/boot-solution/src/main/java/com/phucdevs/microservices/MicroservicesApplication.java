package com.phucdevs.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class MicroservicesApplication extends SpringBootServletInitializer {

    /*
     * Used with run by JAR
     */
    public static void main(String[] args) {
        SpringApplication.run(MicroservicesApplication.class, args);
    }

    /*
     * Used with run by WAR
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MicroservicesApplication.class);
    }

    @PostConstruct
    public void init() {

        Set<Player> players = new HashSet<>();
        players.add( new Player("Chicago", "US") );
        players.add( new Player("Tokyo", "JP") );
        Team team = new Team("Country", "Rich", "", players);
        repository.save(team);
    }

    @Autowired
    TeamRepository repository;
}

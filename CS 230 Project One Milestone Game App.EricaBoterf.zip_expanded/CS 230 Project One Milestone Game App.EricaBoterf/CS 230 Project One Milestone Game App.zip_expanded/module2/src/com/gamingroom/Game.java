package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Game class that represents a game instance.
 * Inherits from Entity class to reuse common attributes.
 * Holds a list of teams participating in the game.
 * 
 * @author coce@snhu.edu
 */
public class Game extends Entity {

    // List of teams in this game
    private List<Team> teams = new ArrayList<>();

    /**
     * Constructor with an identifier and name
     * @param id Unique identifier for the game
     * @param name Name of the game
     */
    public Game(long id, String name) {
        super(id, name);
    }

    /**
     * Adds a new team to the game if the name is unique.
     * Uses iterator pattern to check existing team names.
     * 
     * @param name Team name to add
     * @return The team instance if created or existing team if name already exists
     */
    public Team addTeam(String name) {
        // Check if a team with the same name exists
        for (Team team : teams) {
            if (team.getName().equalsIgnoreCase(name)) {
                return team; // Return existing team
            }
        }

        // If unique, create new team
        Team team = new Team(teams.size() + 1, name);
        teams.add(team);
        return team;
    }

    /**
     * Returns an iterator for the list of teams
     * @return Iterator<Team>
     */
    public Iterator<Team> getTeams() {
        return teams.iterator();
    }

    @Override
    public String toString() {
        return "Game [id=" + getId() + ", name=" + getName() + "]";
    }
}

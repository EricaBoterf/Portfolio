package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Team class represents a group of players in a game.
 * Inherits common fields (id, name) from Entity.
 * Holds a list of players.
 * 
 * @author coce@snhu.edu
 */
public class Team extends Entity {

    // List to store players in this team
    private List<Player> players = new ArrayList<>();

    /**
     * Constructor for Team
     * @param id Unique identifier for the team
     * @param name Name of the team
     */
    public Team(long id, String name) {
        super(id, name);
    }

    /**
     * Adds a new player to the team if the name is unique.
     * 
     * @param name Name of the player
     * @return The existing player if found, or a new Player object if added
     */
    public Player addPlayer(String name) {
        // Check for duplicate player name
        for (Player player : players) {
            if (player.getName().equalsIgnoreCase(name)) {
                return player; // Return existing player
            }
        }

        // If unique, create new player
        Player player = new Player(players.size() + 1, name);
        players.add(player);
        return player;
    }

    /**
     * Returns an iterator for all players in this team
     * @return Iterator<Player>
     */
    public Iterator<Player> getPlayers() {
        return players.iterator();
    }

    /**
     * Returns the list of players as a simple list (for display)
     * @return List of player names
     */
    public List<String> getPlayersAsList() {
        List<String> names = new ArrayList<>();
        for (Player player : players) {
            names.add(player.getName());
        }
        return names;
    }

    @Override
    public String toString() {
        return "Team [id=" + getId() + ", name=" + getName() + "]";
    }
}
